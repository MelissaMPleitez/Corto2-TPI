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
public class EjemplarTest {
    
    public EjemplarTest() {
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
     * Test of getId method, of class Ejemplar.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Ejemplar instance = new Ejemplar();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId method, of class Ejemplar.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Ejemplar instance = new Ejemplar();
        instance.setId(id);
        
    }

    /**
     * Test of getFechaAdquisicion method, of class Ejemplar.
     */
    @Test
    public void testGetFechaAdquisicion() {
        System.out.println("getFechaAdquisicion");
        Ejemplar instance = new Ejemplar();
        Date expResult = null;
        Date result = instance.getFechaAdquisicion();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setFechaAdquisicion method, of class Ejemplar.
     */
    @Test
    public void testSetFechaAdquisicion() {
        System.out.println("setFechaAdquisicion");
        Date fechaAdquisicion = null;
        Ejemplar instance = new Ejemplar();
        instance.setFechaAdquisicion(fechaAdquisicion);
        
    }

    /**
     * Test of getFechaDevolucion method, of class Ejemplar.
     */
    @Test
    public void testGetFechaDevolucion() {
        System.out.println("getFechaDevolucion");
        Ejemplar instance = new Ejemplar();
        Date expResult = null;
        Date result = instance.getFechaDevolucion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaDevolucion method, of class Ejemplar.
     */
    @Test
    public void testSetFechaDevolucion() {
        System.out.println("setFechaDevolucion");
        Date fechaDevolucion = null;
        Ejemplar instance = new Ejemplar();
        instance.setFechaDevolucion(fechaDevolucion);
        
    }

    /**
     * Test of getFechaPrestamo method, of class Ejemplar.
     */
    @Test
    public void testGetFechaPrestamo() {
        System.out.println("getFechaPrestamo");
        Ejemplar instance = new Ejemplar();
        Date expResult = null;
        Date result = instance.getFechaPrestamo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaPrestamo method, of class Ejemplar.
     */
    @Test
    public void testSetFechaPrestamo() {
        System.out.println("setFechaPrestamo");
        Date fechaPrestamo = null;
        Ejemplar instance = new Ejemplar();
        instance.setFechaPrestamo(fechaPrestamo);
        
    }

    /**
     * Test of getIdEjemplar method, of class Ejemplar.
     */
    @Test
    public void testGetIdEjemplar() {
        System.out.println("getIdEjemplar");
        Ejemplar instance = new Ejemplar();
        String expResult = "";
        String result = instance.getIdEjemplar();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIdEjemplar method, of class Ejemplar.
     */
    @Test
    public void testSetIdEjemplar() {
        System.out.println("setIdEjemplar");
        String idEjemplar = "";
        Ejemplar instance = new Ejemplar();
        instance.setIdEjemplar(idEjemplar);
        
    }

    /**
     * Test of getLocalizacion method, of class Ejemplar.
     */
    @Test
    public void testGetLocalizacion() {
        System.out.println("getLocalizacion");
        Ejemplar instance = new Ejemplar();
        String expResult = "";
        String result = instance.getLocalizacion();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLocalizacion method, of class Ejemplar.
     */
    @Test
    public void testSetLocalizacion() {
        System.out.println("setLocalizacion");
        String localizacion = "";
        Ejemplar instance = new Ejemplar();
        instance.setLocalizacion(localizacion);
        
    }

    /**
     * Test of getObservaciones method, of class Ejemplar.
     */
    @Test
    public void testGetObservaciones() {
        System.out.println("getObservaciones");
        Ejemplar instance = new Ejemplar();
        String expResult = "";
        String result = instance.getObservaciones();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setObservaciones method, of class Ejemplar.
     */
    @Test
    public void testSetObservaciones() {
        System.out.println("setObservaciones");
        String observaciones = "";
        Ejemplar instance = new Ejemplar();
        instance.setObservaciones(observaciones);
        
    }

    /**
     * Test of getLibroId method, of class Ejemplar.
     */
    @Test
    public void testGetLibroId() {
        System.out.println("getLibroId");
        Ejemplar instance = new Ejemplar();
        long expResult = 0L;
        long result = instance.getLibroId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLibroId method, of class Ejemplar.
     */
    @Test
    public void testSetLibroId() {
        System.out.println("setLibroId");
        long libroId = 0L;
        Ejemplar instance = new Ejemplar();
        instance.setLibroId(libroId);
        
    }

    /**
     * Test of getUsuarioId method, of class Ejemplar.
     */
    @Test
    public void testGetUsuarioId() {
        System.out.println("getUsuarioId");
        Ejemplar instance = new Ejemplar();
        Usuario expResult = null;
        Usuario result = instance.getUsuarioId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setUsuarioId method, of class Ejemplar.
     */
    @Test
    public void testSetUsuarioId() {
        System.out.println("setUsuarioId");
        Usuario usuarioId = null;
        Ejemplar instance = new Ejemplar();
        instance.setUsuarioId(usuarioId);
        
    }

    /**
     * Test of hashCode method, of class Ejemplar.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Ejemplar instance = new Ejemplar();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Ejemplar.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Ejemplar instance = new Ejemplar();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of toString method, of class Ejemplar.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ejemplar instance = new Ejemplar();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
