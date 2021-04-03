/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.boundary;

import com.mycompany.biblioteca.entity.Usuario;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Melissa
 */
@Entity
@DiscriminatorValue(value = "ALUMNO")
public class AlumnoFacade extends UsuarioFacade{
    private static final long serialVersionUID = 1L;
    @PersistenceContext(unitName = "com.mycompany_Biblioteca_jar_1.0-SNAPSHOTPU")
    @Id
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
    

    
}
