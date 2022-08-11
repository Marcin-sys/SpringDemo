package com.example.demo.repository;

import com.example.demo.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
