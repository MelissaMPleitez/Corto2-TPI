/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.entity;

import java.util.List;
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
public class ProductoTest {
    
    public ProductoTest() {
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
     * Test of getProdId method, of class Producto.
     */
    @Test
    public void testGetProdId() {
        System.out.println("getProdId");
        Producto instance = new Producto();
        Integer expResult = null;
        Integer result = instance.getProdId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setProdId method, of class Producto.
     */
    @Test
    public void testSetProdId() {
        System.out.println("setProdId");
        Integer prodId = null;
        Producto instance = new Producto();
        instance.setProdId(prodId);
        
    }

    /**
     * Test of getNombProducto method, of class Producto.
     */
    @Test
    public void testGetNombProducto() {
        System.out.println("getNombProducto");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getNombProducto();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNombProducto method, of class Producto.
     */
    @Test
    public void testSetNombProducto() {
        System.out.println("setNombProducto");
        String nombProducto = "";
        Producto instance = new Producto();
        instance.setNombProducto(nombProducto);
        
    }

    /**
     * Test of getCantProd method, of class Producto.
     */
    @Test
    public void testGetCantProd() {
        System.out.println("getCantProd");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.getCantProd();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCantProd method, of class Producto.
     */
    @Test
    public void testSetCantProd() {
        System.out.println("setCantProd");
        String cantProd = "";
        Producto instance = new Producto();
        instance.setCantProd(cantProd);
        
    }

    /**
     * Test of getPrecio method, of class Producto.
     */
    @Test
    public void testGetPrecio() {
        System.out.println("getPrecio");
        Producto instance = new Producto();
        Double expResult = null;
        Double result = instance.getPrecio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPrecio method, of class Producto.
     */
    @Test
    public void testSetPrecio() {
        System.out.println("setPrecio");
        Double precio = null;
        Producto instance = new Producto();
        instance.setPrecio(precio);
       
    }

    /**
     * Test of getEnviosList method, of class Producto.
     */
    @Test
    public void testGetEnviosList() {
        System.out.println("getEnviosList");
        Producto instance = new Producto();
        List<Envios> expResult = null;
        List<Envios> result = instance.getEnviosList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEnviosList method, of class Producto.
     */
    @Test
    public void testSetEnviosList() {
        System.out.println("setEnviosList");
        List<Envios> enviosList = null;
        Producto instance = new Producto();
        instance.setEnviosList(enviosList);
        
    }

    /**
     * Test of hashCode method, of class Producto.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Producto instance = new Producto();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
      
        
    }

    /**
     * Test of equals method, of class Producto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Producto instance = new Producto();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Producto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Producto instance = new Producto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
