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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of getClientId method, of class Cliente.
     */
    @Test
    public void testGetClientId() {
        System.out.println("getClientId");
        Cliente instance = new Cliente();
        Integer expResult = null;
        Integer result = instance.getClientId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setClientId method, of class Cliente.
     */
    @Test
    public void testSetClientId() {
        System.out.println("setClientId");
        Integer clientId = null;
        Cliente instance = new Cliente();
        instance.setClientId(clientId);
        
    }

    /**
     * Test of getClientNomb method, of class Cliente.
     */
    @Test
    public void testGetClientNomb() {
        System.out.println("getClientNomb");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.getClientNomb();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setClientNomb method, of class Cliente.
     */
    @Test
    public void testSetClientNomb() {
        System.out.println("setClientNomb");
        String clientNomb = "";
        Cliente instance = new Cliente();
        instance.setClientNomb(clientNomb);
        
    }

    /**
     * Test of getClientCuenta method, of class Cliente.
     */
    @Test
    public void testGetClientCuenta() {
        System.out.println("getClientCuenta");
        Cliente instance = new Cliente();
        Integer expResult = null;
        Integer result = instance.getClientCuenta();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setClientCuenta method, of class Cliente.
     */
    @Test
    public void testSetClientCuenta() {
        System.out.println("setClientCuenta");
        Integer clientCuenta = null;
        Cliente instance = new Cliente();
        instance.setClientCuenta(clientCuenta);
        
    }

    /**
     * Test of getEnviosList method, of class Cliente.
     */
    @Test
    public void testGetEnviosList() {
        System.out.println("getEnviosList");
        Cliente instance = new Cliente();
        List<Envios> expResult = null;
        List<Envios> result = instance.getEnviosList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEnviosList method, of class Cliente.
     */
    @Test
    public void testSetEnviosList() {
        System.out.println("setEnviosList");
        List<Envios> enviosList = null;
        Cliente instance = new Cliente();
        instance.setEnviosList(enviosList);
        
    }

    /**
     * Test of hashCode method, of class Cliente.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Cliente instance = new Cliente();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of equals method, of class Cliente.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Cliente instance = new Cliente();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new Cliente();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
