package com.example.demo.service;

import com.example.demo.entity.Movimiento;
import com.example.demo.repository.IMovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovimientoService {

    @Autowired
    IMovimientoRepository movimientoRepository;

    public  void addMovimiento(Movimiento movimiento){
        movimientoRepository.save(movimiento);
    }
}
