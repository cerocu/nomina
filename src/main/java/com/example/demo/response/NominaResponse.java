package com.example.demo.response;


import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
//@Entity
//@Table(name = "personal")
/*@NamedStoredProcedureQueries({
        @NamedStoredProcedureQuery(name = "carcularNomina", procedureName = "carcularNomina",
                      parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "personalin",type=Integer.class),
                                      @StoredProcedureParameter(mode = ParameterMode.IN,name = "mesin",type=Integer.class),
                                      @StoredProcedureParameter(mode = ParameterMode.IN,name = "yearin",type=Integer.class)} )})
*/
public class NominaResponse {

    public Integer horatrabajadas;
    public Integer totalporentrega;
    public Integer bonoporhoras;
    public Double retenciones;
    public Double sueldo;

}
