/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.biblioteca.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Melissa
 */
@Embeddable
public class EnviosPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "client_id", nullable = false)
    private int clientId;
    @Basic(optional = false)
    @Column(name = "prod_id", nullable = false)
    private int prodId;

    public EnviosPK() {
    }

    public EnviosPK(int clientId, int prodId) {
        this.clientId = clientId;
        this.prodId = prodId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) clientId;
        hash += (int) prodId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EnviosPK)) {
            return false;
        }
        EnviosPK other = (EnviosPK) object;
        if (this.clientId != other.clientId) {
            return false;
        }
        if (this.prodId != other.prodId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.biblioteca.EnviosPK[ clientId=" + clientId + ", prodId=" + prodId + " ]";
    }
    
}
