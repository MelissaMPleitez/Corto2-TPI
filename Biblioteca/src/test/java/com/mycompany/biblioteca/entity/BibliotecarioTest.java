/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.entity;

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
public class BibliotecarioTest {
    
    public BibliotecarioTest() {
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
     * Test of getId method, of class Bibliotecario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Bibliotecario instance = new Bibliotecario();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Bibliotecario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Bibliotecario instance = new Bibliotecario();
        instance.setId(id);
        
    }

    /**
     * Test of getEmail method, of class Bibliotecario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Bibliotecario instance = new Bibliotecario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmail method, of class Bibliotecario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Bibliotecario instance = new Bibliotecario();
        instance.setEmail(email);
        
    }

    /**
     * Test of getLogin method, of class Bibliotecario.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Bibliotecario instance = new Bibliotecario();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setLogin method, of class Bibliotecario.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Bibliotecario instance = new Bibliotecario();
        instance.setLogin(login);
        
    }

    /**
     * Test of getNif method, of class Bibliotecario.
     */
    @Test
    public void testGetNif() {
        System.out.println("getNif");
        Bibliotecario instance = new Bibliotecario();
        String expResult = "";
        String result = instance.getNif();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNif method, of class Bibliotecario.
     */
    @Test
    public void testSetNif() {
        System.out.println("setNif");
        String nif = "";
        Bibliotecario instance = new Bibliotecario();
        instance.setNif(nif);
       
    }

    /**
     * Test of getPassword method, of class Bibliotecario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Bibliotecario instance = new Bibliotecario();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPassword method, of class Bibliotecario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Bibliotecario instance = new Bibliotecario();
        instance.setPassword(password);
        
    }

    /**
     * Test of hashCode method, of class Bibliotecario.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Bibliotecario instance = new Bibliotecario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Bibliotecario.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Bibliotecario instance = new Bibliotecario();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Bibliotecario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Bibliotecario instance = new Bibliotecario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
