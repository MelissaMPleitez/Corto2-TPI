/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Melissa
 */
@Entity
@Table(name = "cliente", catalog = "biblio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByClientId", query = "SELECT c FROM Cliente c WHERE c.clientId = :clientId"),
    @NamedQuery(name = "Cliente.findByClientNomb", query = "SELECT c FROM Cliente c WHERE c.clientNomb = :clientNomb"),
    @NamedQuery(name = "Cliente.findByClientCuenta", query = "SELECT c FROM Cliente c WHERE c.clientCuenta = :clientCuenta")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "client_id", nullable = false)
    private Integer clientId;
    @Column(name = "client_nomb", length = 50)
    private String clientNomb;
    @Column(name = "client_cuenta")
    private Integer clientCuenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cliente")
    private List<Envios> enviosList;

    public Cliente() {
    }

    public Cliente(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getClientNomb() {
        return clientNomb;
    }

    public void setClientNomb(String clientNomb) {
        this.clientNomb = clientNomb;
    }

    public Integer getClientCuenta() {
        return clientCuenta;
    }

    public void setClientCuenta(Integer clientCuenta) {
        this.clientCuenta = clientCuenta;
    }

    @XmlTransient
    public List<Envios> getEnviosList() {
        return enviosList;
    }

    public void setEnviosList(List<Envios> enviosList) {
        this.enviosList = enviosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (clientId != null ? clientId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.clientId == null && other.clientId != null) || (this.clientId != null && !this.clientId.equals(other.clientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.biblioteca.Cliente[ clientId=" + clientId + " ]";
    }
    
}
