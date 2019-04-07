package pl.kamilkoszarny.web.mkclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kamilkoszarny.web.mkclinic.model.Doctor;
import pl.kamilkoszarny.web.mkclinic.model.Patient;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Override
    Optional<Doctor> findById(Long aLong);
}
