package pl.kamilkoszarny.web.mkclinic.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.kamilkoszarny.web.mkclinic.model.Specialization;
import pl.kamilkoszarny.web.mkclinic.service.SpecialitzationService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/specializations")
public class SpecializationController  {

    private SpecialitzationService specialitzationService;

    public SpecializationController(SpecialitzationService specialitzationService) {
        this.specialitzationService = specialitzationService;
    }

    @GetMapping
    public ResponseEntity<List<Specialization>> showAllSpecialiations() {
        return new ResponseEntity<>(specialitzationService.getAllSpecializations(), HttpStatus.OK);
    }
}
