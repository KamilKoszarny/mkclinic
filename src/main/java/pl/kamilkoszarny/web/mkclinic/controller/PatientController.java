package pl.kamilkoszarny.web.mkclinic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.kamilkoszarny.web.mkclinic.model.Patient;
import pl.kamilkoszarny.web.mkclinic.repository.PatientRepository;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("patients")
    public List<Patient> getPatients() {
        return patientRepository.findAll();
    }

    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }
}
