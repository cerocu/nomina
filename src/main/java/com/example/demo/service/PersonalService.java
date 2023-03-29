package com.example.demo.service;

import com.example.demo.entity.Personal;
import com.example.demo.repository.IPersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalService {

    @Autowired
    IPersonalRepository personalRepository;

    public void addPersonal(Personal personal){
         personalRepository.save(personal);
    }
}
