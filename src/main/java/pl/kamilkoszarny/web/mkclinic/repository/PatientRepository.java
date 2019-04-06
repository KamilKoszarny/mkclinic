package pl.kamilkoszarny.web.mkclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamilkoszarny.web.mkclinic.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
