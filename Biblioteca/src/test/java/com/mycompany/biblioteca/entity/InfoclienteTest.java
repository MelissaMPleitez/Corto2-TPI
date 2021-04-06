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
public class InfoclienteTest {
    
    public InfoclienteTest() {
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
     * Test of getClientId method, of class Infocliente.
     */
    @Test
    public void testGetClientId() {
        System.out.println("getClientId");
        Infocliente instance = new Infocliente();
        Integer expResult = null;
        Integer result = instance.getClientId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setClientId method, of class Infocliente.
     */
    @Test
    public void testSetClientId() {
        System.out.println("setClientId");
        Integer clientId = null;
        Infocliente instance = new Infocliente();
        instance.setClientId(clientId);
       
    }

    /**
     * Test of getClientNomb method, of class Infocliente.
     */
    @Test
    public void testGetClientNomb() {
        System.out.println("getClientNomb");
        Infocliente instance = new Infocliente();
        String expResult = "";
        String result = instance.getClientNomb();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setClientNomb method, of class Infocliente.
     */
    @Test
    public void testSetClientNomb() {
        System.out.println("setClientNomb");
        String clientNomb = "";
        Infocliente instance = new Infocliente();
        instance.setClientNomb(clientNomb);
        
    }

    /**
     * Test of getEmpresaNomb method, of class Infocliente.
     */
    @Test
    public void testGetEmpresaNomb() {
        System.out.println("getEmpresaNomb");
        Infocliente instance = new Infocliente();
        String expResult = "";
        String result = instance.getEmpresaNomb();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmpresaNomb method, of class Infocliente.
     */
    @Test
    public void testSetEmpresaNomb() {
        System.out.println("setEmpresaNomb");
        String empresaNomb = "";
        Infocliente instance = new Infocliente();
        instance.setEmpresaNomb(empresaNomb);
        
    }

    /**
     * Test of getEmpresaTel method, of class Infocliente.
     */
    @Test
    public void testGetEmpresaTel() {
        System.out.println("getEmpresaTel");
        Infocliente instance = new Infocliente();
        String expResult = "";
        String result = instance.getEmpresaTel();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmpresaTel method, of class Infocliente.
     */
    @Test
    public void testSetEmpresaTel() {
        System.out.println("setEmpresaTel");
        String empresaTel = "";
        Infocliente instance = new Infocliente();
        instance.setEmpresaTel(empresaTel);
       
    }

    /**
     * Test of getEmpresaAdress method, of class Infocliente.
     */
    @Test
    public void testGetEmpresaAdress() {
        System.out.println("getEmpresaAdress");
        Infocliente instance = new Infocliente();
        String expResult = "";
        String result = instance.getEmpresaAdress();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmpresaAdress method, of class Infocliente.
     */
    @Test
    public void testSetEmpresaAdress() {
        System.out.println("setEmpresaAdress");
        String empresaAdress = "";
        Infocliente instance = new Infocliente();
        instance.setEmpresaAdress(empresaAdress);
        
    }

    /**
     * Test of hashCode method, of class Infocliente.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Infocliente instance = new Infocliente();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Infocliente.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Infocliente instance = new Infocliente();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Infocliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Infocliente instance = new Infocliente();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
