package dio.desafio.cloud.domain.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dio.desafio.cloud.domain.model.LandingPage;
import dio.desafio.cloud.domain.service.LandingPageService;

@RestController
@RequestMapping("/landing-page")
public class LandingPageController {

    @Autowired
    private LandingPageService landingPageService;

    @GetMapping("/{id}")
    public ResponseEntity<LandingPage> findById(@PathVariable("id") Long id) {
        LandingPage landingPage = landingPageService.findById(id);
        return ResponseEntity.ok(landingPage);
    }

    @PostMapping()
    public ResponseEntity<LandingPage> create(@RequestBody LandingPage landingPage) {
        LandingPage newLandingPage = landingPageService.create(landingPage);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newLandingPage.getId())
                .toUri();
        return ResponseEntity.created(location).body(newLandingPage);
    }
}
