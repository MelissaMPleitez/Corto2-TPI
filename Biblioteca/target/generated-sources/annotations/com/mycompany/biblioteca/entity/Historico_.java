package com.mycompany.biblioteca.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-03T11:48:20")
@StaticMetamodel(Historico.class)
public class Historico_ { 

    public static volatile SingularAttribute<Historico, Date> fechaDevolucionReal;
    public static volatile SingularAttribute<Historico, Date> fechaDevolucion;
    public static volatile SingularAttribute<Historico, Date> fechaPrestamo;
    public static volatile SingularAttribute<Historico, Long> ejemplarId;
    public static volatile SingularAttribute<Historico, Long> id;
    public static volatile SingularAttribute<Historico, Long> usuarioId;

}