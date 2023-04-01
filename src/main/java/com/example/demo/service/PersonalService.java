package com.example.demo.service;

import com.example.demo.entity.Personal;
import com.example.demo.repository.IPersonalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalService {

    @Autowired
    IPersonalRepository personalRepository;

    public Boolean addPersonal(Personal personal){
        if(getPersonal( personal.idrol)==null)
            return false;
         personalRepository.save(personal);
        return true;
    }
    public Personal getPersonal(Integer personal){
         Personal personal1=null;
        try{


            personal1=personalRepository.findById(personal).get();
        }
        catch (Exception e){
            return personal1;
        }
        return personal1;
    }
}
