/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "envios", catalog = "biblio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Envios.findAll", query = "SELECT e FROM Envios e"),
    @NamedQuery(name = "Envios.findByClientId", query = "SELECT e FROM Envios e WHERE e.enviosPK.clientId = :clientId"),
    @NamedQuery(name = "Envios.findByProdId", query = "SELECT e FROM Envios e WHERE e.enviosPK.prodId = :prodId"),
    @NamedQuery(name = "Envios.findByEmpresaAdress", query = "SELECT e FROM Envios e WHERE e.empresaAdress = :empresaAdress"),
    @NamedQuery(name = "Envios.findByFechaEntrega", query = "SELECT e FROM Envios e WHERE e.fechaEntrega = :fechaEntrega")})
public class Envios implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EnviosPK enviosPK;
    @Column(name = "empresa_adress", length = 50)
    private String empresaAdress;
    @Column(name = "fecha_Entrega")
    @Temporal(TemporalType.DATE)
    private Date fechaEntrega;
    @JoinColumn(name = "client_id", referencedColumnName = "client_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cliente cliente;
    @JoinColumn(name = "prod_id", referencedColumnName = "prod_id", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;

    public Envios() {
    }

    public Envios(EnviosPK enviosPK) {
        this.enviosPK = enviosPK;
    }

    public Envios(int clientId, int prodId) {
        this.enviosPK = new EnviosPK(clientId, prodId);
    }

    public EnviosPK getEnviosPK() {
        return enviosPK;
    }

    public void setEnviosPK(EnviosPK enviosPK) {
        this.enviosPK = enviosPK;
    }

    public String getEmpresaAdress() {
        return empresaAdress;
    }

    public void setEmpresaAdress(String empresaAdress) {
        this.empresaAdress = empresaAdress;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (enviosPK != null ? enviosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Envios)) {
            return false;
        }
        Envios other = (Envios) object;
        if ((this.enviosPK == null && other.enviosPK != null) || (this.enviosPK != null && !this.enviosPK.equals(other.enviosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.biblioteca.Envios[ enviosPK=" + enviosPK + " ]";
    }
    
}
