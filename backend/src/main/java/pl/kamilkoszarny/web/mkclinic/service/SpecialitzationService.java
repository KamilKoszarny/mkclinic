package pl.kamilkoszarny.web.mkclinic.service;

import org.springframework.stereotype.Service;
import pl.kamilkoszarny.web.mkclinic.model.Specialization;
import pl.kamilkoszarny.web.mkclinic.repository.SpecializationRepository;

import java.util.List;

@Service
public class SpecialitzationService {

    private SpecializationRepository specializationRepository;

    public SpecialitzationService(SpecializationRepository specializationRepository) {
        this.specializationRepository = specializationRepository;
    }

    public List<Specialization> getAllSpecializations() {
        return specializationRepository.findAll();
    }
}
