package com.mycompany.biblioteca.entity;

import com.mycompany.biblioteca.entity.Envios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-05T22:57:26")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, String> clientNomb;
    public static volatile ListAttribute<Cliente, Envios> enviosList;
    public static volatile SingularAttribute<Cliente, Integer> clientId;
    public static volatile SingularAttribute<Cliente, Integer> clientCuenta;

}