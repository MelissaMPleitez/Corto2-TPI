/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.boundary;

import com.mycompany.biblioteca.entity.Libro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Melissa
 */
@Stateless
public class LibroFacade extends AbstractFacade<Libro>{
    @PersistenceContext(unitName = "com.mycompany_Biblioteca_jar_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public LibroFacade() {
        super(Libro.class);
    }

    void setEntityManager() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public interface LibroInterface{
        List<LibroFacade> listaLibros();
        LibroFacade recLibro(Long libroId);
        EjemplarFacade recEjemplar(Long ejemplarId);
        LibroFacade buscaLibroIsbn(String isbn);
        public List<LibroFacade> buscaLibros (String keyword);
        public List<LibroFacade> listaLibrosTitulo();
        public List<LibroFacade> listaLibrosTitulo(int firstResult, int maxResults);
    }

}
