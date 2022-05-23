package com.example.crudviernes.ad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdService {

    @Autowired
    private final AdRepository AdRepository;

    public AdService(AdRepository AdRepository) {
        this.AdRepository = AdRepository;
    }

    public List<Ad> getAllEvents() {
        return AdRepository.findAll();
    }
}
