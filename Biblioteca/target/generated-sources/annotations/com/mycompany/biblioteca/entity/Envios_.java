package com.mycompany.biblioteca.entity;

import com.mycompany.biblioteca.entity.Cliente;
import com.mycompany.biblioteca.entity.EnviosPK;
import com.mycompany.biblioteca.entity.Producto;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-03T00:38:16")
@StaticMetamodel(Envios.class)
public class Envios_ { 

    public static volatile SingularAttribute<Envios, EnviosPK> enviosPK;
    public static volatile SingularAttribute<Envios, Cliente> cliente;
    public static volatile SingularAttribute<Envios, String> empresaAdress;
    public static volatile SingularAttribute<Envios, Date> fechaEntrega;
    public static volatile SingularAttribute<Envios, Producto> producto;

}