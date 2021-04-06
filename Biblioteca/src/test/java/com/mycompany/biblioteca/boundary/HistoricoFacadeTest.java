/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.boundary;

import com.mycompany.biblioteca.entity.Envios;
import com.mycompany.biblioteca.entity.Historico;
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
public class HistoricoFacadeTest {
    
    private static HistoricoFacade historicoTest;
    private EntityManager emMock;
    private Historico historicoEntity;

    @BeforeClass
    public static void setUpBeforeClass(){
        historicoTest = new HistoricoFacade();
    }
    
    @Before
    public void setUp(){
        emMock = createMock(EntityManager.class); 
        historicoTest.setEntityManager();
        historicoEntity = new Historico();
    }


    /**
     * Test of create method, of class BibliotecarioFacade.
     */
    @Test
    public void testCreate() {
        emMock.persist(historicoEntity);
        replay(emMock);
        historicoTest.create(historicoEntity);
        verify(emMock);
    }

    /**
     * Test of edit method, of class BibliotecarioFacade.
     */
    @Test
    public void testEdit(){
        expect(emMock.merge(historicoEntity)).andReturn(historicoEntity);
        replay(emMock);
        historicoTest.create(historicoEntity);
        verify(emMock);
    }

    /**
     * Test of remove method, of class BibliotecarioFacade.
     */
    @Test
    public void testRemove(){
        expect(emMock.merge(historicoEntity)).andStubReturn(historicoEntity);
        emMock.remove(historicoEntity);
        replay(emMock);
        historicoTest.remove(historicoEntity);
        verify(emMock);
    }

    /**
     * Test of find method, of class BibliotecarioFacade.
     */
    @Test
    public void testFind() {
        expect(emMock.find(Historico.class, historicoEntity.getId())).andReturn(historicoEntity);
        replay(emMock);
        assertEquals(historicoEntity, historicoTest.find(historicoEntity.getId()));
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
        List<Historico> resultList = new ArrayList<Historico>();
        resultList.add(historicoEntity);
        resultList.add(new Historico());
        
        expect(emMock.getCriteriaBuilder()).andReturn(criteriaBuilderMock);
        expect(criteriaBuilderMock.createQuery()).andReturn(criteriaQueryMock);
        expect(criteriaQueryMock.from(Historico.class)).andReturn(rootMock);
        expect(criteriaQueryMock.select(rootMock)).andReturn(criteriaQueryMock);
        expect(emMock.createQuery(criteriaQueryMock)).andReturn(typedQueryMock);
        expect(typedQueryMock.getResultList()).andReturn(resultList);
        assertEquals(resultList, historicoTest.findAll());
        
        replay(emMock);
        replay(criteriaBuilderMock);
        replay(criteriaQueryMock);
        replay(rootMock);
        replay(typedQueryMock);
        
        historicoTest.findAll();
        
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
