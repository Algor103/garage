package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.model.Voiture;

public interface GarageRepository extends CrudRepository<Voiture, Long> {
    
}
