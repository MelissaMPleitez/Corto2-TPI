/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.boundary;

import com.mycompany.biblioteca.entity.Usuario;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Melissa
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario>{
    @PersistenceContext(unitName = "com.mycompany_Biblioteca_jar_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public UsuarioFacade() {
        super(Usuario.class);
    }

    void setEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public interface UsuarioBean{
        UsuarioFacade recuperacionUsuario(Long idUsuario);
        UsuarioFacade buscaUsuarioLogin(String login);
    }
}
