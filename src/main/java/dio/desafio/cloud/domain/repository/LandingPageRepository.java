package dio.desafio.cloud.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dio.desafio.cloud.domain.model.LandingPage;

public interface LandingPageRepository extends JpaRepository<LandingPage, Long> {

}
