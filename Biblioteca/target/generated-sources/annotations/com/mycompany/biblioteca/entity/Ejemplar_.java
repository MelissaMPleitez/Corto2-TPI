package com.mycompany.biblioteca.entity;

import com.mycompany.biblioteca.entity.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-05T22:57:26")
@StaticMetamodel(Ejemplar.class)
public class Ejemplar_ { 

    public static volatile SingularAttribute<Ejemplar, Date> fechaAdquisicion;
    public static volatile SingularAttribute<Ejemplar, Date> fechaDevolucion;
    public static volatile SingularAttribute<Ejemplar, Date> fechaPrestamo;
    public static volatile SingularAttribute<Ejemplar, Long> libroId;
    public static volatile SingularAttribute<Ejemplar, String> localizacion;
    public static volatile SingularAttribute<Ejemplar, String> observaciones;
    public static volatile SingularAttribute<Ejemplar, Long> id;
    public static volatile SingularAttribute<Ejemplar, String> idEjemplar;
    public static volatile SingularAttribute<Ejemplar, Usuario> usuarioId;

}