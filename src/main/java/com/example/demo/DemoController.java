package com.example.demo;

import com.example.demo.entity.Movimiento;
import com.example.demo.entity.Personal;
import com.example.demo.request.NominaRequest;
import com.example.demo.response.NominaResponse;
import com.example.demo.service.MovimientoService;
import com.example.demo.service.NominaService;
import com.example.demo.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class DemoController {
    @Autowired
    NominaService nominaService;
    @Autowired
    PersonalService personalService;
    @Autowired
    MovimientoService movimientoService;

    @GetMapping("/getnomina/{mes}")
    public List<NominaResponse> getNominaMes(@PathVariable int mes){
       return  nominaService.getNominaMes( mes);
    }

    @PostMapping("/personal")
    public void addPersonal(@RequestBody Personal personal){
          personalService.addPersonal(personal);

    }
    @PostMapping("/movimiento")
    public void addMovimiento(@RequestBody Movimiento movimiento){
          movimientoService.addMovimiento( movimiento);
    }
}
