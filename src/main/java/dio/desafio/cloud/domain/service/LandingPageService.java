package dio.desafio.cloud.domain.service;

import dio.desafio.cloud.domain.model.LandingPage;

public interface LandingPageService {
    LandingPage findById(Long id);

    LandingPage create(LandingPage landingPage);
}
