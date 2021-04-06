/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.boundary;

import com.mycompany.biblioteca.entity.Bibliotecario;
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
public class BibliotecarioFacadeTest{
    
    private static BibliotecarioFacade bibliotecarioTest;
    private EntityManager emMock;
    private Bibliotecario bibliotecarioEntity;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        bibliotecarioTest = new BibliotecarioFacade();
    }
    
    @Before
    public void setUp() throws Exception {
        emMock = createMock(EntityManager.class);
        //bibliotecarioTest.setEntityManager(emMock); 
        bibliotecarioTest.getEntityManager();
        bibliotecarioEntity = new Bibliotecario(1, "somebody@ishere.com", "user", "biblio", "popcorn");
    }


    /**
     * Test of create method, of class BibliotecarioFacade.
     */
    @Test
    public void testCreate() {
        emMock.persist(bibliotecarioEntity);
        replay(emMock);
        bibliotecarioTest.create(bibliotecarioEntity);
        verify(emMock);
    }

    /**
     * Test of edit method, of class BibliotecarioFacade.
     */
    @Test
    public void testEdit(){
        expect(emMock.merge(bibliotecarioEntity)).andReturn(bibliotecarioEntity);
        replay(emMock);
        bibliotecarioTest.create(bibliotecarioEntity);
        verify(emMock);
    }

    /**
     * Test of remove method, of class BibliotecarioFacade.
     */
    @Test
    public void testRemove(){
        expect(emMock.merge(bibliotecarioEntity)).andStubReturn(bibliotecarioEntity);
        emMock.remove(bibliotecarioEntity);
        replay(emMock);
        bibliotecarioTest.remove(bibliotecarioEntity);
        verify(emMock);
    }

    /**
     * Test of find method, of class BibliotecarioFacade.
     */
    @Test
    public void testFind() {
        expect(emMock.find(Bibliotecario.class, bibliotecarioEntity.getId())).andReturn(bibliotecarioEntity);
        replay(emMock);
        assertEquals(bibliotecarioEntity, bibliotecarioTest.find(bibliotecarioEntity.getId()));
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
        List<Bibliotecario> resultList = new ArrayList<Bibliotecario>();
        resultList.add(bibliotecarioEntity);
        resultList.add(new Bibliotecario());
        
        expect(emMock.getCriteriaBuilder()).andReturn(criteriaBuilderMock);
        expect(criteriaBuilderMock.createQuery()).andReturn(criteriaQueryMock);
        expect(criteriaQueryMock.from(Bibliotecario.class)).andReturn(rootMock);
        expect(criteriaQueryMock.select(rootMock)).andReturn(criteriaQueryMock);
        expect(emMock.createQuery(criteriaQueryMock)).andReturn(typedQueryMock);
        expect(typedQueryMock.getResultList()).andReturn(resultList);
        assertEquals(resultList, bibliotecarioTest.findAll());
        
        replay(emMock);
        replay(criteriaBuilderMock);
        replay(criteriaQueryMock);
        replay(rootMock);
        replay(typedQueryMock);
        
        bibliotecarioTest.findAll();
        
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
    public void testCount() throws Exception {

    }
    
}
