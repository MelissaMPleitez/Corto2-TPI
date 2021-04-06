package com.mycompany.biblioteca.entity;

import com.mycompany.biblioteca.entity.Envios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-05T22:57:26")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, Double> precio;
    public static volatile ListAttribute<Producto, Envios> enviosList;
    public static volatile SingularAttribute<Producto, String> cantProd;
    public static volatile SingularAttribute<Producto, String> nombProducto;
    public static volatile SingularAttribute<Producto, Integer> prodId;

}