package com.example.demo.service;

import com.example.demo.Speaker;
import com.example.demo.repository.HibernateSpeakerRepositoryImpl;
import com.example.demo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
