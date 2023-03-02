package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Voiture;
import com.example.repository.GarageRepository;

@Service
public class GarageService {

    @Autowired
    private GarageRepository garageRepository;

    public List<Voiture> getVoitures() {
        List<Voiture> voitures = new ArrayList<>();
        garageRepository.findAll().forEach(voiture -> {
            voitures.add(voiture);
        });
        return voitures;
    }

    public Voiture getVoiture(long id) {
        return garageRepository.findById(id).orElse( null); 
    }

    public void deleteVoiture(long id) {
        garageRepository.deleteById(id);
    }

    public void addVoiture(Voiture voiture) {
        garageRepository.save(voiture);
    }

    public void updateVoiture(Voiture voiture, long id) {
        garageRepository.save(voiture);
    }
}
