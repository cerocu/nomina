package com.example.demo.entity;

import lombok.Getter;

import javax.persistence.*;

import lombok.Getter;

import javax.persistence.*;
import java.io.Serializable;


@Getter
@Entity
@Table(name = "personal")
/*@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "carcularNomina", procedureName = "carcularNomina",
                parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "personalin",type=Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN,name = "mesin",type=Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.IN,name = "yearin",type=Integer.class)} )})*/
public class Personal implements Serializable {
    @Id

    @Column(name = "numero")
    public Integer numero;
   /* public String horatrabajadas;
    public String totalporentrega;
    public String bonoporhoras;
    public String retenciones;
    public String sueldo;*/
}
