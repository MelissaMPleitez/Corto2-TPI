/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Melissa
 */
@Entity
@Table(name = "historico", catalog = "biblio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Historico.findAll", query = "SELECT h FROM Historico h"),
    @NamedQuery(name = "Historico.findById", query = "SELECT h FROM Historico h WHERE h.id = :id"),
    @NamedQuery(name = "Historico.findByFechaDevolucion", query = "SELECT h FROM Historico h WHERE h.fechaDevolucion = :fechaDevolucion"),
    @NamedQuery(name = "Historico.findByFechaDevolucionReal", query = "SELECT h FROM Historico h WHERE h.fechaDevolucionReal = :fechaDevolucionReal"),
    @NamedQuery(name = "Historico.findByFechaPrestamo", query = "SELECT h FROM Historico h WHERE h.fechaPrestamo = :fechaPrestamo"),
    @NamedQuery(name = "Historico.findByEjemplarId", query = "SELECT h FROM Historico h WHERE h.ejemplarId = :ejemplarId"),
    @NamedQuery(name = "Historico.findByUsuarioId", query = "SELECT h FROM Historico h WHERE h.usuarioId = :usuarioId")})
public class Historico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "fechaDevolucion")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @Column(name = "fechaDevolucionReal")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucionReal;
    @Column(name = "fechaPrestamo")
    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;
    @Basic(optional = false)
    @Column(name = "ejemplar_id", nullable = false)
    private long ejemplarId;
    @Basic(optional = false)
    @Column(name = "usuario_id", nullable = false)
    private long usuarioId;

    public Historico() {
    }

    public Historico(Long id) {
        this.id = id;
    }

    public Historico(Long id, long ejemplarId, long usuarioId) {
        this.id = id;
        this.ejemplarId = ejemplarId;
        this.usuarioId = usuarioId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaDevolucionReal() {
        return fechaDevolucionReal;
    }

    public void setFechaDevolucionReal(Date fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public long getEjemplarId() {
        return ejemplarId;
    }

    public void setEjemplarId(long ejemplarId) {
        this.ejemplarId = ejemplarId;
    }

    public long getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        this.usuarioId = usuarioId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historico)) {
            return false;
        }
        Historico other = (Historico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.biblioteca.Historico[ id=" + id + " ]";
    }
    
}
