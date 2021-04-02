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
@Table(name = "producto", catalog = "biblio", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p"),
    @NamedQuery(name = "Producto.findByProdId", query = "SELECT p FROM Producto p WHERE p.prodId = :prodId"),
    @NamedQuery(name = "Producto.findByNombProducto", query = "SELECT p FROM Producto p WHERE p.nombProducto = :nombProducto"),
    @NamedQuery(name = "Producto.findByCantProd", query = "SELECT p FROM Producto p WHERE p.cantProd = :cantProd"),
    @NamedQuery(name = "Producto.findByPrecio", query = "SELECT p FROM Producto p WHERE p.precio = :precio")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "prod_id", nullable = false)
    private Integer prodId;
    @Column(name = "nomb_producto", length = 200)
    private String nombProducto;
    @Column(name = "cant_prod", length = 50)
    private String cantProd;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio", precision = 22, scale = 0)
    private Double precio;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    private List<Envios> enviosList;

    public Producto() {
    }

    public Producto(Integer prodId) {
        this.prodId = prodId;
    }

    public Integer getProdId() {
        return prodId;
    }

    public void setProdId(Integer prodId) {
        this.prodId = prodId;
    }

    public String getNombProducto() {
        return nombProducto;
    }

    public void setNombProducto(String nombProducto) {
        this.nombProducto = nombProducto;
    }

    public String getCantProd() {
        return cantProd;
    }

    public void setCantProd(String cantProd) {
        this.cantProd = cantProd;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
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
        hash += (prodId != null ? prodId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.prodId == null && other.prodId != null) || (this.prodId != null && !this.prodId.equals(other.prodId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.biblioteca.Producto[ prodId=" + prodId + " ]";
    }
    
}
