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
public class ReservaTest {
    
    public ReservaTest() {
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
     * Test of getId method, of class Reserva.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Reserva instance = new Reserva();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId method, of class Reserva.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Reserva instance = new Reserva();
        instance.setId(id);
        
    }

    /**
     * Test of getEstado method, of class Reserva.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Reserva instance = new Reserva();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEstado method, of class Reserva.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Reserva instance = new Reserva();
        instance.setEstado(estado);
        
    }

    /**
     * Test of getFecha method, of class Reserva.
     */
    @Test
    public void testGetFecha() {
        System.out.println("getFecha");
        Reserva instance = new Reserva();
        Date expResult = null;
        Date result = instance.getFecha();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setFecha method, of class Reserva.
     */
    @Test
    public void testSetFecha() {
        System.out.println("setFecha");
        Date fecha = null;
        Reserva instance = new Reserva();
        instance.setFecha(fecha);
        
    }

    /**
     * Test of getFechaFin method, of class Reserva.
     */
    @Test
    public void testGetFechaFin() {
        System.out.println("getFechaFin");
        Reserva instance = new Reserva();
        Date expResult = null;
        Date result = instance.getFechaFin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaFin method, of class Reserva.
     */
    @Test
    public void testSetFechaFin() {
        System.out.println("setFechaFin");
        Date fechaFin = null;
        Reserva instance = new Reserva();
        instance.setFechaFin(fechaFin);
        
    }

    /**
     * Test of getTipoFinal method, of class Reserva.
     */
    @Test
    public void testGetTipoFinal() {
        System.out.println("getTipoFinal");
        Reserva instance = new Reserva();
        String expResult = "";
        String result = instance.getTipoFinal();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTipoFinal method, of class Reserva.
     */
    @Test
    public void testSetTipoFinal() {
        System.out.println("setTipoFinal");
        String tipoFinal = "";
        Reserva instance = new Reserva();
        instance.setTipoFinal(tipoFinal);
        
    }

    /**
     * Test of getLibroId method, of class Reserva.
     */
    @Test
    public void testGetLibroId() {
        System.out.println("getLibroId");
        Reserva instance = new Reserva();
        long expResult = 0L;
        long result = instance.getLibroId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLibroId method, of class Reserva.
     */
    @Test
    public void testSetLibroId() {
        System.out.println("setLibroId");
        long libroId = 0L;
        Reserva instance = new Reserva();
        instance.setLibroId(libroId);
       
    }

    /**
     * Test of getUsuarioId method, of class Reserva.
     */
    @Test
    public void testGetUsuarioId() {
        System.out.println("getUsuarioId");
        Reserva instance = new Reserva();
        long expResult = 0L;
        long result = instance.getUsuarioId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setUsuarioId method, of class Reserva.
     */
    @Test
    public void testSetUsuarioId() {
        System.out.println("setUsuarioId");
        long usuarioId = 0L;
        Reserva instance = new Reserva();
        instance.setUsuarioId(usuarioId);
        
    }

    /**
     * Test of hashCode method, of class Reserva.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Reserva instance = new Reserva();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Reserva.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Reserva instance = new Reserva();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Reserva.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Reserva instance = new Reserva();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
