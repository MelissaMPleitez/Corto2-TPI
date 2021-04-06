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
public class LibroTest {
    
    public LibroTest() {
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
     * Test of getId method, of class Libro.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Libro instance = new Libro();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setId method, of class Libro.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Libro instance = new Libro();
        instance.setId(id);
        
    }

    /**
     * Test of getAutor method, of class Libro.
     */
    @Test
    public void testGetAutor() {
        System.out.println("getAutor");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getAutor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAutor method, of class Libro.
     */
    @Test
    public void testSetAutor() {
        System.out.println("setAutor");
        String autor = "";
        Libro instance = new Libro();
        instance.setAutor(autor);
        
    }

    /**
     * Test of getFechaAlta method, of class Libro.
     */
    @Test
    public void testGetFechaAlta() {
        System.out.println("getFechaAlta");
        Libro instance = new Libro();
        Date expResult = null;
        Date result = instance.getFechaAlta();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFechaAlta method, of class Libro.
     */
    @Test
    public void testSetFechaAlta() {
        System.out.println("setFechaAlta");
        Date fechaAlta = null;
        Libro instance = new Libro();
        instance.setFechaAlta(fechaAlta);
        
    }

    /**
     * Test of getIsbn method, of class Libro.
     */
    @Test
    public void testGetIsbn() {
        System.out.println("getIsbn");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getIsbn();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIsbn method, of class Libro.
     */
    @Test
    public void testSetIsbn() {
        System.out.println("setIsbn");
        String isbn = "";
        Libro instance = new Libro();
        instance.setIsbn(isbn);
        
    }

    /**
     * Test of getNumDisponibles method, of class Libro.
     */
    @Test
    public void testGetNumDisponibles() {
        System.out.println("getNumDisponibles");
        Libro instance = new Libro();
        Integer expResult = null;
        Integer result = instance.getNumDisponibles();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumDisponibles method, of class Libro.
     */
    @Test
    public void testSetNumDisponibles() {
        System.out.println("setNumDisponibles");
        Integer numDisponibles = null;
        Libro instance = new Libro();
        instance.setNumDisponibles(numDisponibles);
        
    }

    /**
     * Test of getNumPaginas method, of class Libro.
     */
    @Test
    public void testGetNumPaginas() {
        System.out.println("getNumPaginas");
        Libro instance = new Libro();
        Integer expResult = null;
        Integer result = instance.getNumPaginas();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNumPaginas method, of class Libro.
     */
    @Test
    public void testSetNumPaginas() {
        System.out.println("setNumPaginas");
        Integer numPaginas = null;
        Libro instance = new Libro();
        instance.setNumPaginas(numPaginas);
        
    }

    /**
     * Test of getTitulo method, of class Libro.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTitulo method, of class Libro.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Libro instance = new Libro();
        instance.setTitulo(titulo);
        
    }

    /**
     * Test of hashCode method, of class Libro.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Libro instance = new Libro();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Libro.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Libro instance = new Libro();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Libro.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Libro instance = new Libro();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
