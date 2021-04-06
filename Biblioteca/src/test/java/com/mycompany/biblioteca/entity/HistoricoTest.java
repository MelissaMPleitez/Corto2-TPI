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
public class HistoricoTest {
    
    public HistoricoTest() {
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
     * Test of getId method, of class Historico.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Historico instance = new Historico();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId method, of class Historico.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Historico instance = new Historico();
        instance.setId(id);
        
    }

    /**
     * Test of getFechaDevolucion method, of class Historico.
     */
    @Test
    public void testGetFechaDevolucion() {
        System.out.println("getFechaDevolucion");
        Historico instance = new Historico();
        Date expResult = null;
        Date result = instance.getFechaDevolucion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaDevolucion method, of class Historico.
     */
    @Test
    public void testSetFechaDevolucion() {
        System.out.println("setFechaDevolucion");
        Date fechaDevolucion = null;
        Historico instance = new Historico();
        instance.setFechaDevolucion(fechaDevolucion);
        
    }

    /**
     * Test of getFechaDevolucionReal method, of class Historico.
     */
    @Test
    public void testGetFechaDevolucionReal() {
        System.out.println("getFechaDevolucionReal");
        Historico instance = new Historico();
        Date expResult = null;
        Date result = instance.getFechaDevolucionReal();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setFechaDevolucionReal method, of class Historico.
     */
    @Test
    public void testSetFechaDevolucionReal() {
        System.out.println("setFechaDevolucionReal");
        Date fechaDevolucionReal = null;
        Historico instance = new Historico();
        instance.setFechaDevolucionReal(fechaDevolucionReal);
        
    }

    /**
     * Test of getFechaPrestamo method, of class Historico.
     */
    @Test
    public void testGetFechaPrestamo() {
        System.out.println("getFechaPrestamo");
        Historico instance = new Historico();
        Date expResult = null;
        Date result = instance.getFechaPrestamo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaPrestamo method, of class Historico.
     */
    @Test
    public void testSetFechaPrestamo() {
        System.out.println("setFechaPrestamo");
        Date fechaPrestamo = null;
        Historico instance = new Historico();
        instance.setFechaPrestamo(fechaPrestamo);
        
    }

    /**
     * Test of getEjemplarId method, of class Historico.
     */
    @Test
    public void testGetEjemplarId() {
        System.out.println("getEjemplarId");
        Historico instance = new Historico();
        long expResult = 0L;
        long result = instance.getEjemplarId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEjemplarId method, of class Historico.
     */
    @Test
    public void testSetEjemplarId() {
        System.out.println("setEjemplarId");
        long ejemplarId = 0L;
        Historico instance = new Historico();
        instance.setEjemplarId(ejemplarId);
       
    }

    /**
     * Test of getUsuarioId method, of class Historico.
     */
    @Test
    public void testGetUsuarioId() {
        System.out.println("getUsuarioId");
        Historico instance = new Historico();
        long expResult = 0L;
        long result = instance.getUsuarioId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUsuarioId method, of class Historico.
     */
    @Test
    public void testSetUsuarioId() {
        System.out.println("setUsuarioId");
        long usuarioId = 0L;
        Historico instance = new Historico();
        instance.setUsuarioId(usuarioId);
       
    }

    /**
     * Test of hashCode method, of class Historico.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Historico instance = new Historico();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Historico.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Historico instance = new Historico();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Historico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Historico instance = new Historico();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
