package dio.desafio.cloud.domain.service.implementation;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.desafio.cloud.domain.model.LandingPage;
import dio.desafio.cloud.domain.repository.LandingPageRepository;
import dio.desafio.cloud.domain.service.LandingPageService;

@Service
public class LandingPageServiceImplementation implements LandingPageService {

    @Autowired
    private LandingPageRepository landingPageRepository;

    @Override
    public LandingPage findById(Long id) {
        return landingPageRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public LandingPage create(LandingPage landingPage) {
        if (landingPageRepository.existsByContactEmail(landingPage.getContact().getEmail())) {
            throw new IllegalArgumentException("This e-mail already exists!");
        }
        if (landingPageRepository.existsByContactPhone(landingPage.getContact().getPhone())) {
            throw new IllegalArgumentException("This phone number already exists!");
        }
        return landingPageRepository.save(landingPage);
    }

}
