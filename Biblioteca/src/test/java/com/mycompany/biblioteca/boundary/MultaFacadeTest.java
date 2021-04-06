/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.boundary;

import com.mycompany.biblioteca.entity.Multa;
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
public class MultaFacadeTest {
    
    private static MultaFacade multaTest;
    private EntityManager emMock;
    private Multa multaEntity;

    @BeforeClass
    public static void setUpBeforeClass(){
        multaTest = new MultaFacade();
    }
    
    @Before
    public void setUp(){
        emMock = createMock(EntityManager.class); 
        multaTest.setEntityManager();
        multaEntity = new Multa();
    }


    /**
     * Test of create method, of class BibliotecarioFacade.
     */
    @Test
    public void testCreate() {
        emMock.persist(multaEntity);
        replay(emMock);
        multaTest.create(multaEntity);
        verify(emMock);
    }

    /**
     * Test of edit method, of class BibliotecarioFacade.
     */
    @Test
    public void testEdit(){
        expect(emMock.merge(multaEntity)).andReturn(multaEntity);
        replay(emMock);
        multaTest.create(multaEntity);
        verify(emMock);
    }

    /**
     * Test of remove method, of class BibliotecarioFacade.
     */
    @Test
    public void testRemove(){
        expect(emMock.merge(multaEntity)).andStubReturn(multaEntity);
        emMock.remove(multaEntity);
        replay(emMock);
        multaTest.remove(multaEntity);
        verify(emMock);
    }

    /**
     * Test of find method, of class BibliotecarioFacade.
     */
    @Test
    public void testFind() {
        expect(emMock.find(Multa.class, multaEntity.getId())).andReturn(multaEntity);
        replay(emMock);
        assertEquals(multaEntity, multaTest.find(multaEntity.getId()));
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
        List<Multa> resultList = new ArrayList<Multa>();
        resultList.add(multaEntity);
        resultList.add(new Multa());
        
        expect(emMock.getCriteriaBuilder()).andReturn(criteriaBuilderMock);
        expect(criteriaBuilderMock.createQuery()).andReturn(criteriaQueryMock);
        expect(criteriaQueryMock.from(Multa.class)).andReturn(rootMock);
        expect(criteriaQueryMock.select(rootMock)).andReturn(criteriaQueryMock);
        expect(emMock.createQuery(criteriaQueryMock)).andReturn(typedQueryMock);
        expect(typedQueryMock.getResultList()).andReturn(resultList);
        assertEquals(resultList, multaTest.findAll());
        
        replay(emMock);
        replay(criteriaBuilderMock);
        replay(criteriaQueryMock);
        replay(rootMock);
        replay(typedQueryMock);
        
        multaTest.findAll();
        
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
