/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.entity;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author crist
 */
public class EnviosTest {
    
    public EnviosTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEnviosPK method, of class Envios.
     */
    @Test
    public void testGetEnviosPK() {
        System.out.println("getEnviosPK");
        Envios instance = new Envios();
        EnviosPK expResult = null;
        EnviosPK result = instance.getEnviosPK();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEnviosPK method, of class Envios.
     */
    @Test
    public void testSetEnviosPK() {
        System.out.println("setEnviosPK");
        EnviosPK enviosPK = null;
        Envios instance = new Envios();
        instance.setEnviosPK(enviosPK);
        
    }

    /**
     * Test of getEmpresaAdress method, of class Envios.
     */
    @Test
    public void testGetEmpresaAdress() {
        System.out.println("getEmpresaAdress");
        Envios instance = new Envios();
        String expResult = "";
        String result = instance.getEmpresaAdress();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setEmpresaAdress method, of class Envios.
     */
    @Test
    public void testSetEmpresaAdress() {
        System.out.println("setEmpresaAdress");
        String empresaAdress = "";
        Envios instance = new Envios();
        instance.setEmpresaAdress(empresaAdress);
       
    }

    /**
     * Test of getFechaEntrega method, of class Envios.
     */
    @Test
    public void testGetFechaEntrega() {
        System.out.println("getFechaEntrega");
        Envios instance = new Envios();
        Date expResult = null;
        Date result = instance.getFechaEntrega();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaEntrega method, of class Envios.
     */
    @Test
    public void testSetFechaEntrega() {
        System.out.println("setFechaEntrega");
        Date fechaEntrega = null;
        Envios instance = new Envios();
        instance.setFechaEntrega(fechaEntrega);
       
    }

    /**
     * Test of getCliente method, of class Envios.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Envios instance = new Envios();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCliente method, of class Envios.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Envios instance = new Envios();
        instance.setCliente(cliente);
        
    }

    /**
     * Test of getProducto method, of class Envios.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        Envios instance = new Envios();
        Producto expResult = null;
        Producto result = instance.getProducto();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setProducto method, of class Envios.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        Producto producto = null;
        Envios instance = new Envios();
        instance.setProducto(producto);
        
    }

    /**
     * Test of hashCode method, of class Envios.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Envios instance = new Envios();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Envios.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Envios instance = new Envios();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Envios.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Envios instance = new Envios();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
