package com.mycompany.biblioteca.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-05T22:57:26")
@StaticMetamodel(Reserva.class)
public class Reserva_ { 

    public static volatile SingularAttribute<Reserva, Date> fecha;
    public static volatile SingularAttribute<Reserva, String> estado;
    public static volatile SingularAttribute<Reserva, Long> libroId;
    public static volatile SingularAttribute<Reserva, Long> id;
    public static volatile SingularAttribute<Reserva, Date> fechaFin;
    public static volatile SingularAttribute<Reserva, Long> usuarioId;
    public static volatile SingularAttribute<Reserva, String> tipoFinal;

}