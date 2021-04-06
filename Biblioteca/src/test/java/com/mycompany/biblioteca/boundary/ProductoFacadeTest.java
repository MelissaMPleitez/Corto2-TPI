/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.boundary;

import com.mycompany.biblioteca.entity.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Melissa
 */
public class ProductoFacadeTest {
    
    private static ProductoFacade productoTest;
    private EntityManager emMock;
    private Producto productoEntity;

    @BeforeClass
    public static void setUpBeforeClass(){
        productoTest = new ProductoFacade();
    }
    
    @Before
    public void setUp(){
        emMock = createMock(EntityManager.class); 
        productoTest.setEntityManager();
        productoEntity = new Producto();
    }


    /**
     * Test of create method, of class BibliotecarioFacade.
     */
    @Test
    public void testCreate() {
        emMock.persist(productoEntity);
        replay(emMock);
        productoTest.create(productoEntity);
        verify(emMock);
    }

    /**
     * Test of edit method, of class BibliotecarioFacade.
     */
    @Test
    public void testEdit(){
        expect(emMock.merge(productoEntity)).andReturn(productoEntity);
        replay(emMock);
        productoTest.create(productoEntity);
        verify(emMock);
    }

    /**
     * Test of remove method, of class BibliotecarioFacade.
     */
    @Test
    public void testRemove(){
        expect(emMock.merge(productoEntity)).andStubReturn(productoEntity);
        emMock.remove(productoEntity);
        replay(emMock);
        productoTest.remove(productoEntity);
        verify(emMock);
    }

    /**
     * Test of find method, of class BibliotecarioFacade.
     */
    @Test
    public void testFind() {
        expect(emMock.find(Producto.class, productoEntity.getProdId())).andReturn(productoEntity);
        replay(emMock);
        assertEquals(productoEntity, productoTest.find(productoEntity.getProdId()));
        verify(emMock);
    }

    /**
     * Test of findAll method, of class BibliotecarioFacade.
     */
    @Test
    public void testFindAll() {
        CriteriaQuery criteriaQueryMock = createMock(CriteriaQuery.class);
        CriteriaBuilder criteriaBuilderMock = createMock(CriteriaBuilder.class);
        Root rootMock = createMock(Root.class);
        TypedQuery typedQueryMock = createMock(TypedQuery.class);
        List<Producto> resultList = new ArrayList<Producto>();
        resultList.add(productoEntity);
        resultList.add(new Producto());
        
        expect(emMock.getCriteriaBuilder()).andReturn(criteriaBuilderMock);
        expect(criteriaBuilderMock.createQuery()).andReturn(criteriaQueryMock);
        expect(criteriaQueryMock.from(Producto.class)).andReturn(rootMock);
        expect(criteriaQueryMock.select(rootMock)).andReturn(criteriaQueryMock);
        expect(emMock.createQuery(criteriaQueryMock)).andReturn(typedQueryMock);
        expect(typedQueryMock.getResultList()).andReturn(resultList);
        assertEquals(resultList, productoTest.findAll());
        
        replay(emMock);
        replay(criteriaBuilderMock);
        replay(criteriaQueryMock);
        replay(rootMock);
        replay(typedQueryMock);
        
        productoTest.findAll();
        
        verify(criteriaBuilderMock);
        verify(criteriaQueryMock);
        verify(rootMock);
        verify(typedQueryMock);
        verify(emMock);
}

    /**
     * Test of findRange method, of class BibliotecarioFacade.
     */
    @Test
    public void testFindRange(){

    }

    /**
     * Test of count method, of class BibliotecarioFacade.
     */
    @Test
    public void testCount(){

    }
    
}
