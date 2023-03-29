package com.example.demo;

import com.example.demo.request.NominaRequest;
import com.example.demo.response.NominaResponse;
import com.example.demo.service.NominaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class DemoController {
    @Autowired
    NominaService nominaService;
    @GetMapping("/getnomina/{mes}")
    public List<NominaResponse> getNominaMes(@PathVariable int mes){
       return  nominaService.getNominaMes( mes);
    }
}
