/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.controller;

import com.mycompany.biblioteca.boundary.AlumnoFacade;
import com.mycompany.biblioteca.boundary.ProfesorFacade;
import com.mycompany.biblioteca.boundary.UsuarioFacade;
import com.mycompany.biblioteca.services.BibliotecaException;
import java.util.List;

/**
 *
 * @author Melissa
 */
public class ReglasBiblioteca {
    
    private int diasPrestamoAl = 7;
    private int diasPrestamoPr = 30;
    private int opAlumno = 5;
    private int opProfesor=8;
    
    private static ReglasBiblioteca me = new ReglasBiblioteca();
    

    public static ReglasBiblioteca getInstance(){
        return me;
    }
    public int diasPrestamo(UsuarioFacade usuario) throws BibliotecaException{
        if(usuario instanceof AlumnoFacade){
            return diasPrestamoAl;
        }else if(usuario instanceof ProfesorFacade){
            return diasPrestamoPr;
        }else{
            String message = "Solo los alumnos y profesores pueden realizar prestamos";
            throw new BibliotecaException(message);
        }
    }
    
    public void CupoOp (UsuarioFacade usuario, int numOp)throws BibliotecaException{
        String message;
        if (!(usuario instanceof AlumnoFacade) && !(usuario instanceof ProfesorFacade)){
            message="El servicio de prestamo de libros sr limita a profesors y estudiantes";
            throw new BibliotecaException (message);
        }
        if ((usuario instanceof AlumnoFacade && numOp > opAlumno)||(usuario instanceof ProfesorFacade && numOp > opProfesor)){
            message="Usted ha excedido el numero de operaciones permitidas";
            throw new BibliotecaException(message);
        }
    }
    
    public int CupoOp(UsuarioFacade usuario) throws BibliotecaException{
        if(usuario instanceof AlumnoFacade){
            return opAlumno;
        }else if(usuario instanceof ProfesorFacade){
            return opProfesor;
        }else{
            String message = "Solo los alumnos y profesores pueden realizar prestamos";
            throw new BibliotecaException(message);
        }
    }
    
   
}
