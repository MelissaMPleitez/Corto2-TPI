/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.boundary.UsuarioFacade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melissa
 */
public class ReglasBibliotecaTest {
    
    public ReglasBibliotecaTest() {
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
     * Test of getInstance method, of class ReglasBiblioteca.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ReglasBiblioteca expResult = null;
        ReglasBiblioteca result = ReglasBiblioteca.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of diasPrestamo method, of class ReglasBiblioteca.
     */
    @Test
    public void testDiasPrestamo() {
        System.out.println("diasPrestamo");
        UsuarioFacade usuario = null;
        ReglasBiblioteca instance = new ReglasBiblioteca();
        int expResult = 0;
        int result = instance.diasPrestamo(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CupoOp method, of class ReglasBiblioteca.
     */
    @Test
    public void testCupoOp_UsuarioFacade_int() {
        System.out.println("CupoOp");
        UsuarioFacade usuario = null;
        int numOp = 0;
        ReglasBiblioteca instance = new ReglasBiblioteca();
        instance.CupoOp(usuario, numOp);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CupoOp method, of class ReglasBiblioteca.
     */
    @Test
    public void testCupoOp_UsuarioFacade() {
        System.out.println("CupoOp");
        UsuarioFacade usuario = null;
        ReglasBiblioteca instance = new ReglasBiblioteca();
        int expResult = 0;
        int result = instance.CupoOp(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
