package org.bananagest.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ol
 */
@Entity
@Table(name = "tbl_proyect" ,catalog = "bananaguest")
public class Tbl_proyect {
    
    @Id @GeneratedValue
    @Column(name = "idProyect", nullable = true)
    private int idProyect;
    
     @Column(name = "proyectName")
    private String proyectName ;
     
    @Column(name = "description")
    private String description ;
     
    @Column(name = "proyectAmount")
    private double proyectAmount;
    
    @Column(name = "peopleAmount")
    private int peopleAmount ;
    
    @OneToMany
    @JoinColumn(name="idUser")
    private int idUser ;

    public int getIdProyect() {
        return idProyect;
    }

    public void setIdProyect(int idProyect) {
        this.idProyect = idProyect;
    }

    public String getProyectName() {
        return proyectName;
    }

    public void setProyectName(String proyectName) {
        this.proyectName = proyectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getProyectAmount() {
        return proyectAmount;
    }

    public void setProyectAmount(double proyectAmount) {
        this.proyectAmount = proyectAmount;
    }

    public int getPeopleAmount() {
        return peopleAmount;
    }

    public void setPeopleAmount(int peopleAmount) {
        this.peopleAmount = peopleAmount;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    
}
