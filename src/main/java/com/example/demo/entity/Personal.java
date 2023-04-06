package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.*;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Entity
@Table(name = "personal")
public class Personal implements Serializable {
    @Id

    @Column(name = "numero")
    public Integer numero;
    @Column(name = "idrol")
    public Integer idrol;
    @Column(name = "nombre")
    public String nombre;
    @Column(name = "apellidos")
    public String apellidos;
    @Column(name = "salario")
    public Integer salario;
    @Column(name = "vales")
    public Integer vales;

    @Override
    public String toString() {
        return "Personal{" +
                "numero=" + numero +
                ", idrol=" + idrol +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", salario=" + salario +
                ", vales=" + vales +
                '}';
    }
}
