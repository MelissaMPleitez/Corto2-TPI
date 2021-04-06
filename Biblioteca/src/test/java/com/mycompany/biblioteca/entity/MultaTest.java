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
public class MultaTest {
    
    public MultaTest() {
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
     * Test of getId method, of class Multa.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Multa instance = new Multa();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Multa.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Multa instance = new Multa();
        instance.setId(id);
        
    }

    /**
     * Test of getEstado method, of class Multa.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Multa instance = new Multa();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEstado method, of class Multa.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Multa instance = new Multa();
        instance.setEstado(estado);
        
    }

    /**
     * Test of getFechaFin method, of class Multa.
     */
    @Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        Multa instance = new Multa();
        Date expResult = null;
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaFin method, of class Multa.
     */
    @Test
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = null;
        Multa instance = new Multa();
        instance.setFechaFin(fechaFin);
        
    }

    /**
     * Test of getFechaInicio method, of class Multa.
     */
    @Test
    public void testGetFechaInicio() {
        System.out.println("getFechaInicio");
        Multa instance = new Multa();
        Date expResult = null;
        Date result = instance.getFechaInicio();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaInicio method, of class Multa.
     */
    @Test
    public void testSetFechaInicio() {
        System.out.println("setFechaInicio");
        Date fechaInicio = null;
        Multa instance = new Multa();
        instance.setFechaInicio(fechaInicio);
        
    }

    /**
     * Test of getUsuarioId method, of class Multa.
     */
    @Test
    public void testGetUsuarioId() {
        System.out.println("getUsuarioId");
        Multa instance = new Multa();
        long expResult = 0L;
        long result = instance.getUsuarioId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUsuarioId method, of class Multa.
     */
    @Test
    public void testSetUsuarioId() {
        System.out.println("setUsuarioId");
        long usuarioId = 0L;
        Multa instance = new Multa();
        instance.setUsuarioId(usuarioId);
        
    }

    /**
     * Test of hashCode method, of class Multa.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Multa instance = new Multa();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Multa.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Multa instance = new Multa();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Multa.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Multa instance = new Multa();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
