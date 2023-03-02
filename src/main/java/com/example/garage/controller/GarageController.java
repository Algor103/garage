package com.example.garage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Voiture;
import com.example.service.GarageService;


@RestController
public class GarageController {

    @Autowired
    private GarageService garageService;
    
    @RequestMapping("/voitures")
    public List<Voiture> getVoitures() {
        return garageService.getVoitures();
    }

    @RequestMapping("/voiture/{id}}")
    public Voiture getVoiture(@PathVariable long id) {
        return garageService.getVoiture(id);
    }

    @RequestMapping("/voiture/delete/{id}}")
    public void deleteVoiture(@PathVariable long id) {
        garageService.deleteVoiture(id);
    }

    @PostMapping("/voiture/add")
    public void addVoiture(@RequestBody Voiture voiture) {
        garageService.addVoiture(voiture);
    }

    @PutMapping("/voiture/update/{id}")
    public void updateVoiture(@RequestBody Voiture voiture, @PathVariable long id) {
        garageService.updateVoiture(voiture, id);
    }
}
