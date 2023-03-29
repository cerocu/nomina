package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Entity
@Table(name = "movimiento")
public class Movimiento implements Serializable {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovimiento")
    public Integer idmovimiento;
    @Column(name = "numero")
    public Integer numero;
    @Column(name = "mes")
    public Integer mes;
    @Column(name = "year")
    public Integer year;
    @Column(name = "cantidad")
    public Integer cantidad;
}
