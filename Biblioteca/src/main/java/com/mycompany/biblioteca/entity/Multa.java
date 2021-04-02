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
@Table(name = "multa", catalog = "biblio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Multa.findAll", query = "SELECT m FROM Multa m"),
    @NamedQuery(name = "Multa.findById", query = "SELECT m FROM Multa m WHERE m.id = :id"),
    @NamedQuery(name = "Multa.findByEstado", query = "SELECT m FROM Multa m WHERE m.estado = :estado"),
    @NamedQuery(name = "Multa.findByFechaFin", query = "SELECT m FROM Multa m WHERE m.fechaFin = :fechaFin"),
    @NamedQuery(name = "Multa.findByFechaInicio", query = "SELECT m FROM Multa m WHERE m.fechaInicio = :fechaInicio"),
    @NamedQuery(name = "Multa.findByUsuarioId", query = "SELECT m FROM Multa m WHERE m.usuarioId = :usuarioId")})
public class Multa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic(optional = false)
    @Column(name = "estado", nullable = false, length = 9)
    private String estado;
    @Column(name = "fechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @Column(name = "usuario_id", nullable = false)
    private long usuarioId;

    public Multa() {
    }

    public Multa(Long id) {
        this.id = id;
    }

    public Multa(Long id, String estado, long usuarioId) {
        this.id = id;
        this.estado = estado;
        this.usuarioId = usuarioId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
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
        if (!(object instanceof Multa)) {
            return false;
        }
        Multa other = (Multa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.biblioteca.Multa[ id=" + id + " ]";
    }
    
}
