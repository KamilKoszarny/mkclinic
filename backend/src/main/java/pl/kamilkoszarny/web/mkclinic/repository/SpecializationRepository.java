package pl.kamilkoszarny.web.mkclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamilkoszarny.web.mkclinic.model.Specialization;

public interface SpecializationRepository extends JpaRepository<Specialization, Long> {

}
