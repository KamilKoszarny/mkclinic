package pl.kamilkoszarny.web.mkclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamilkoszarny.web.mkclinic.model.Patient;

import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    @Override
    Optional<Patient> findById(Long aLong);
}
