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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ejemplar", catalog = "biblio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ejemplar.findAll", query = "SELECT e FROM Ejemplar e"),
    @NamedQuery(name = "Ejemplar.findById", query = "SELECT e FROM Ejemplar e WHERE e.id = :id"),
    @NamedQuery(name = "Ejemplar.findByFechaAdquisicion", query = "SELECT e FROM Ejemplar e WHERE e.fechaAdquisicion = :fechaAdquisicion"),
    @NamedQuery(name = "Ejemplar.findByFechaDevolucion", query = "SELECT e FROM Ejemplar e WHERE e.fechaDevolucion = :fechaDevolucion"),
    @NamedQuery(name = "Ejemplar.findByFechaPrestamo", query = "SELECT e FROM Ejemplar e WHERE e.fechaPrestamo = :fechaPrestamo"),
    @NamedQuery(name = "Ejemplar.findByIdEjemplar", query = "SELECT e FROM Ejemplar e WHERE e.idEjemplar = :idEjemplar"),
    @NamedQuery(name = "Ejemplar.findByLocalizacion", query = "SELECT e FROM Ejemplar e WHERE e.localizacion = :localizacion"),
    @NamedQuery(name = "Ejemplar.findByObservaciones", query = "SELECT e FROM Ejemplar e WHERE e.observaciones = :observaciones"),
    @NamedQuery(name = "Ejemplar.findByLibroId", query = "SELECT e FROM Ejemplar e WHERE e.libroId = :libroId")})
public class Ejemplar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "fechaAdquisicion")
    @Temporal(TemporalType.DATE)
    private Date fechaAdquisicion;
    @Column(name = "fechaDevolucion")
    @Temporal(TemporalType.DATE)
    private Date fechaDevolucion;
    @Column(name = "fechaPrestamo")
    @Temporal(TemporalType.DATE)
    private Date fechaPrestamo;
    @Column(name = "idEjemplar", length = 255)
    private String idEjemplar;
    @Basic(optional = false)
    @Column(name = "localizacion", nullable = false, length = 12)
    private String localizacion;
    @Column(name = "observaciones", length = 255)
    private String observaciones;
    @Basic(optional = false)
    @Column(name = "libro_id", nullable = false)
    private long libroId;
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    @ManyToOne
    private Usuario usuarioId;

    public Ejemplar() {
    }

    public Ejemplar(Long id) {
        this.id = id;
    }

    public Ejemplar(Long id, String localizacion, long libroId) {
        this.id = id;
        this.localizacion = localizacion;
        this.libroId = libroId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Date fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(String idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public long getLibroId() {
        return libroId;
    }

    public void setLibroId(long libroId) {
        this.libroId = libroId;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
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
        if (!(object instanceof Ejemplar)) {
            return false;
        }
        Ejemplar other = (Ejemplar) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.biblioteca.Ejemplar[ id=" + id + " ]";
    }
    
}
