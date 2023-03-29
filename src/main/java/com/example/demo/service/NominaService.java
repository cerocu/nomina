package com.example.demo.service;

import com.example.demo.repository.IPersonalRepository;
import com.example.demo.request.NominaRequest;
import com.example.demo.response.NominaResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class NominaService {

    @Autowired
    IPersonalRepository personalRepository;
    public List<NominaResponse> getNominaMes(int mes ) {
        List<?> nominames=personalRepository.getNomina(2,mes,2020);
        List<NominaResponse> nominas=new ArrayList<>();
        Iterator iterator =nominames.iterator();
        while (iterator.hasNext()){
            Object[] obj=(Object[]) iterator.next();
            NominaResponse nominaResponse=new NominaResponse();
            System.out.println(obj[0]);
           nominaResponse.setHoratrabajadas( Integer.parseInt(String.valueOf(obj[0])));
            nominaResponse.setTotalporentrega(Integer.parseInt(String.valueOf(obj[1])));
            nominaResponse.setBonoporhoras(Integer.parseInt(String.valueOf(obj[2])));
            nominaResponse.setRetenciones(Double.parseDouble(String.valueOf(obj[3])));
            nominaResponse.setSueldo(Double.parseDouble(String.valueOf(obj[4])));
            nominas.add(nominaResponse);
        }

      return  nominas;

    }
}
