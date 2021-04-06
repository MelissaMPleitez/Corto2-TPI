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
public class EnviosPKTest {
    
    public EnviosPKTest() {
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
     * Test of getClientId method, of class EnviosPK.
     */
    @Test
    public void testGetClientId() {
        System.out.println("getClientId");
        EnviosPK instance = new EnviosPK();
        int expResult = 0;
        int result = instance.getClientId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setClientId method, of class EnviosPK.
     */
    @Test
    public void testSetClientId() {
        System.out.println("setClientId");
        int clientId = 0;
        EnviosPK instance = new EnviosPK();
        instance.setClientId(clientId);
        
    }

    /**
     * Test of getProdId method, of class EnviosPK.
     */
    @Test
    public void testGetProdId() {
        System.out.println("getProdId");
        EnviosPK instance = new EnviosPK();
        int expResult = 0;
        int result = instance.getProdId();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setProdId method, of class EnviosPK.
     */
    @Test
    public void testSetProdId() {
        System.out.println("setProdId");
        int prodId = 0;
        EnviosPK instance = new EnviosPK();
        instance.setProdId(prodId);
        
    }

    /**
     * Test of hashCode method, of class EnviosPK.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        EnviosPK instance = new EnviosPK();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class EnviosPK.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        EnviosPK instance = new EnviosPK();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class EnviosPK.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        EnviosPK instance = new EnviosPK();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
