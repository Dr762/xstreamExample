/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gbond.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author abondar
 */
@Entity
@SequenceGenerator(name = "sem_seq", sequenceName = "sem_seq", initialValue = 1, allocationSize=1)
@XmlRootElement
//@XmlType(propOrder={"semantics_name"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Semantics implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator =  "sem_seq")
      @XmlTransient
    private Long id;
    
    @XmlElement
    private String semantics_name;

      @XmlTransient
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

 
    public String getSemantics_name() {
        return semantics_name;
    }

    public void setSemantics_name(String semantics_name) {
        this.semantics_name = semantics_name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 89 * hash + (this.semantics_name != null ? this.semantics_name.hashCode() : 0);
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Semantics other = (Semantics) obj;
        if (!this.id.equals(other.id)) {
            return false;
        }
        return Objects.equals(this.semantics_name, other.semantics_name);
    }

    @Override
    public String toString() {
        return semantics_name ;
    }

   

    
    
}
