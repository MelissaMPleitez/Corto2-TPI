/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.boundary;

import com.mycompany.biblioteca.entity.Multa;
import com.mycompany.biblioteca.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.embeddable.EJBContainer;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import static org.easymock.EasyMock.createMock;
import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.easymock.EasyMock.verify;
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
public class UsuarioFacadeTest {
    
    private static UsuarioFacade usuarioTest;
    private EntityManager emMock;
    private Usuario usuarioEntity;

    @BeforeClass
    public static void setUpBeforeClass(){
        usuarioTest = new UsuarioFacade();
    }
    
    @Before
    public void setUp(){
        emMock = createMock(EntityManager.class); 
        usuarioTest.setEntityManager();
        usuarioEntity = new Usuario();
    }


    /**
     * Test of create method, of class BibliotecarioFacade.
     */
    @Test
    public void testCreate() {
        emMock.persist(usuarioEntity);
        replay(emMock);
        usuarioTest.create(usuarioEntity);
        verify(emMock);
    }

    /**
     * Test of edit method, of class BibliotecarioFacade.
     */
    @Test
    public void testEdit(){
        expect(emMock.merge(usuarioEntity)).andReturn(usuarioEntity);
        replay(emMock);
        usuarioTest.create(usuarioEntity);
        verify(emMock);
    }

    /**
     * Test of remove method, of class BibliotecarioFacade.
     */
    @Test
    public void testRemove(){
        expect(emMock.merge(usuarioEntity)).andStubReturn(usuarioEntity);
        emMock.remove(usuarioEntity);
        replay(emMock);
        usuarioTest.remove(usuarioEntity);
        verify(emMock);
    }

    /**
     * Test of find method, of class BibliotecarioFacade.
     */
    @Test
    public void testFind() {
        expect(emMock.find(Usuario.class, usuarioEntity.getId())).andReturn(usuarioEntity);
        replay(emMock);
        assertEquals(usuarioEntity, usuarioTest.find(usuarioEntity.getId()));
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
        List<Usuario> resultList = new ArrayList<Usuario>();
        resultList.add(usuarioEntity);
        resultList.add(new Usuario());
        
        expect(emMock.getCriteriaBuilder()).andReturn(criteriaBuilderMock);
        expect(criteriaBuilderMock.createQuery()).andReturn(criteriaQueryMock);
        expect(criteriaQueryMock.from(Usuario.class)).andReturn(rootMock);
        expect(criteriaQueryMock.select(rootMock)).andReturn(criteriaQueryMock);
        expect(emMock.createQuery(criteriaQueryMock)).andReturn(typedQueryMock);
        expect(typedQueryMock.getResultList()).andReturn(resultList);
        assertEquals(resultList, usuarioTest.findAll());
        
        replay(emMock);
        replay(criteriaBuilderMock);
        replay(criteriaQueryMock);
        replay(rootMock);
        replay(typedQueryMock);
        
        usuarioTest.findAll();
        
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
