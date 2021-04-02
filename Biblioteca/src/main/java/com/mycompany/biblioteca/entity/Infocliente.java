/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Melissa
 */
@Entity
@Table(name = "infocliente", catalog = "biblio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Infocliente.findAll", query = "SELECT i FROM Infocliente i"),
    @NamedQuery(name = "Infocliente.findByClientId", query = "SELECT i FROM Infocliente i WHERE i.clientId = :clientId"),
    @NamedQuery(name = "Infocliente.findByClientNomb", query = "SELECT i FROM Infocliente i WHERE i.clientNomb = :clientNomb"),
    @NamedQuery(name = "Infocliente.findByEmpresaNomb", query = "SELECT i FROM Infocliente i WHERE i.empresaNomb = :empresaNomb"),
    @NamedQuery(name = "Infocliente.findByEmpresaTel", query = "SELECT i FROM Infocliente i WHERE i.empresaTel = :empresaTel"),
    @NamedQuery(name = "Infocliente.findByEmpresaAdress", query = "SELECT i FROM Infocliente i WHERE i.empresaAdress = :empresaAdress")})
public class Infocliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "client_id", nullable = false)
    private Integer clientId;
    @Column(name = "client_nomb", length = 100)
    private String clientNomb;
    @Column(name = "empresa_nomb", length = 100)
    private String empresaNomb;
    @Column(name = "empresa_tel", length = 50)
    private String empresaTel;
    @Column(name = "empresa_adress", length = 200)
    private String empresaAdress;

    public Infocliente() {
    }

    public Infocliente(Integer clientId) {
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

    public String getEmpresaNomb() {
        return empresaNomb;
    }

    public void setEmpresaNomb(String empresaNomb) {
        this.empresaNomb = empresaNomb;
    }

    public String getEmpresaTel() {
        return empresaTel;
    }

    public void setEmpresaTel(String empresaTel) {
        this.empresaTel = empresaTel;
    }

    public String getEmpresaAdress() {
        return empresaAdress;
    }

    public void setEmpresaAdress(String empresaAdress) {
        this.empresaAdress = empresaAdress;
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
        if (!(object instanceof Infocliente)) {
            return false;
        }
        Infocliente other = (Infocliente) object;
        if ((this.clientId == null && other.clientId != null) || (this.clientId != null && !this.clientId.equals(other.clientId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.biblioteca.Infocliente[ clientId=" + clientId + " ]";
    }
    
}
