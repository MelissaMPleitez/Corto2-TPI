/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.boundary;


import com.mycompany.biblioteca.entity.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Melissa
 */
@Stateless
public class ClienteFacade extends AbstractFacade<Cliente>{
    @PersistenceContext(unitName = "com.mycompany_Biblioteca_jar_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    
    protected EntityManager setEntityManager() {
        return em;
    }

    public ClienteFacade() {
        super(Cliente.class);
    }
}
