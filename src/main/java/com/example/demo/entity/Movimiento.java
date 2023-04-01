package com.example.demo.entity;

import lombok.Getter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Entity
@Table(name = "movimiento")
public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
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
