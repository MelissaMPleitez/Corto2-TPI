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
public class UsuarioTest {
    
    public UsuarioTest() {
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
     * Test of getTipo method, of class Usuario.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTipo method, of class Usuario.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Usuario instance = new Usuario();
        instance.setTipo(tipo);
        
    }

    /**
     * Test of getId method, of class Usuario.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Usuario instance = new Usuario();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setId method, of class Usuario.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Usuario instance = new Usuario();
        instance.setId(id);
        
    }

    /**
     * Test of getApellido1 method, of class Usuario.
     */
    @Test
    public void testGetApellido1() {
        System.out.println("getApellido1");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellido1();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setApellido1 method, of class Usuario.
     */
    @Test
    public void testSetApellido1() {
        System.out.println("setApellido1");
        String apellido1 = "";
        Usuario instance = new Usuario();
        instance.setApellido1(apellido1);
        
    }

    /**
     * Test of getApellido2 method, of class Usuario.
     */
    @Test
    public void testGetApellido2() {
        System.out.println("getApellido2");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getApellido2();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setApellido2 method, of class Usuario.
     */
    @Test
    public void testSetApellido2() {
        System.out.println("setApellido2");
        String apellido2 = "";
        Usuario instance = new Usuario();
        instance.setApellido2(apellido2);
        
    }

    /**
     * Test of getCalle method, of class Usuario.
     */
    @Test
    public void testGetCalle() {
        System.out.println("getCalle");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCalle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCalle method, of class Usuario.
     */
    @Test
    public void testSetCalle() {
        System.out.println("setCalle");
        String calle = "";
        Usuario instance = new Usuario();
        instance.setCalle(calle);
        
    }

    /**
     * Test of getCiudad method, of class Usuario.
     */
    @Test
    public void testGetCiudad() {
        System.out.println("getCiudad");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCiudad();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCiudad method, of class Usuario.
     */
    @Test
    public void testSetCiudad() {
        System.out.println("setCiudad");
        String ciudad = "";
        Usuario instance = new Usuario();
        instance.setCiudad(ciudad);
        
    }

    /**
     * Test of getCodigoPostal method, of class Usuario.
     */
    @Test
    public void testGetCodigoPostal() {
        System.out.println("getCodigoPostal");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getCodigoPostal();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setCodigoPostal method, of class Usuario.
     */
    @Test
    public void testSetCodigoPostal() {
        System.out.println("setCodigoPostal");
        String codigoPostal = "";
        Usuario instance = new Usuario();
        instance.setCodigoPostal(codigoPostal);
       
    }

    /**
     * Test of getNumero method, of class Usuario.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Usuario instance = new Usuario();
        Integer expResult = null;
        Integer result = instance.getNumero();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumero method, of class Usuario.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        Integer numero = null;
        Usuario instance = new Usuario();
        instance.setNumero(numero);
        
    }

    /**
     * Test of getPiso method, of class Usuario.
     */
    @Test
    public void testGetPiso() {
        System.out.println("getPiso");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPiso();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPiso method, of class Usuario.
     */
    @Test
    public void testSetPiso() {
        System.out.println("setPiso");
        String piso = "";
        Usuario instance = new Usuario();
        instance.setPiso(piso);
        
    }

    /**
     * Test of getEmail method, of class Usuario.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEmail method, of class Usuario.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Usuario instance = new Usuario();
        instance.setEmail(email);
        
    }

    /**
     * Test of getEstado method, of class Usuario.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEstado method, of class Usuario.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Usuario instance = new Usuario();
        instance.setEstado(estado);
        
    }

    /**
     * Test of getLogin method, of class Usuario.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getLogin();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setLogin method, of class Usuario.
     */
    @Test
    public void testSetLogin() {
        System.out.println("setLogin");
        String login = "";
        Usuario instance = new Usuario();
        instance.setLogin(login);
        
    }

    /**
     * Test of getNombre method, of class Usuario.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setNombre method, of class Usuario.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Usuario instance = new Usuario();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of getPassword method, of class Usuario.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setPassword method, of class Usuario.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Usuario instance = new Usuario();
        instance.setPassword(password);
        
    }

    /**
     * Test of getTutor method, of class Usuario.
     */
    @Test
    public void testGetTutor() {
        System.out.println("getTutor");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getTutor();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTutor method, of class Usuario.
     */
    @Test
    public void testSetTutor() {
        System.out.println("setTutor");
        String tutor = "";
        Usuario instance = new Usuario();
        instance.setTutor(tutor);
        
    }

    /**
     * Test of getDepartamento method, of class Usuario.
     */
    @Test
    public void testGetDepartamento() {
        System.out.println("getDepartamento");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.getDepartamento();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setDepartamento method, of class Usuario.
     */
    @Test
    public void testSetDepartamento() {
        System.out.println("setDepartamento");
        String departamento = "";
        Usuario instance = new Usuario();
        instance.setDepartamento(departamento);
       
    }

    /**
     * Test of getEjemplarList method, of class Usuario.
     */
    @Test
    public void testGetEjemplarList() {
        System.out.println("getEjemplarList");
        Usuario instance = new Usuario();
        List<Ejemplar> expResult = null;
        List<Ejemplar> result = instance.getEjemplarList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setEjemplarList method, of class Usuario.
     */
    @Test
    public void testSetEjemplarList() {
        System.out.println("setEjemplarList");
        List<Ejemplar> ejemplarList = null;
        Usuario instance = new Usuario();
        instance.setEjemplarList(ejemplarList);
        
    }

    /**
     * Test of hashCode method, of class Usuario.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Usuario instance = new Usuario();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of equals method, of class Usuario.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Usuario instance = new Usuario();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Usuario.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Usuario instance = new Usuario();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        ;
    }
    
}
