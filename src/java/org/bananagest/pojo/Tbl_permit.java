package org.bananagest.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ol
 */
 @Entity
 @Table(name = "tbl_permit" ,catalog = "bananaguest")
public class Tbl_permit {
     
    @Id @GeneratedValue
    @Column(name = "idPermit", nullable = true)
    private int idPermit;
     
    @Column(name = "ErarseUser")
    private boolean ErarseUser;
    
    @Column(name = "ErarseProyect")
    private boolean ErarseProyect;
    
    @Column(name = "ErarseTask")
    private boolean ErarseTask;
    
    @Column(name = "ModifyUser")
    private boolean ModifyUser;
     
    @Column(name = "ModifyProyect")
    private boolean ModifyProyect;
    
    @Column(name = "ModifyTask")
    private boolean ModifyTask;
    
    @Column(name = "CreateUser")
    private boolean CreateUser;
    
    @Column(name = "CreateProyect")
    private boolean CreateProyect;
    
    @Column(name = "CreateTask")
    private boolean CreateTask;
    
    @Column(name = "idUser", nullable = true)
    private int idUser;

    public int getIdPermit() {
        return idPermit;
    }

    public void setIdPermit(int idPermit) {
        this.idPermit = idPermit;
    }

    public boolean isErarseUser() {
        return ErarseUser;
    }

    public void setErarseUser(boolean ErarseUser) {
        this.ErarseUser = ErarseUser;
    }

    public boolean isErarseProyect() {
        return ErarseProyect;
    }

    public void setErarseProyect(boolean ErarseProyect) {
        this.ErarseProyect = ErarseProyect;
    }

    public boolean isErarseTask() {
        return ErarseTask;
    }

    public void setErarseTask(boolean ErarseTask) {
        this.ErarseTask = ErarseTask;
    }

    public boolean isModifyUser() {
        return ModifyUser;
    }

    public void setModifyUser(boolean ModifyUser) {
        this.ModifyUser = ModifyUser;
    }

    public boolean isModifyProyect() {
        return ModifyProyect;
    }

    public void setModifyProyect(boolean ModifyProyect) {
        this.ModifyProyect = ModifyProyect;
    }

    public boolean isModifyTask() {
        return ModifyTask;
    }

    public void setModifyTask(boolean ModifyTask) {
        this.ModifyTask = ModifyTask;
    }

    public boolean isCreateUser() {
        return CreateUser;
    }

    public void setCreateUser(boolean CreateUser) {
        this.CreateUser = CreateUser;
    }

    public boolean isCreateProyect() {
        return CreateProyect;
    }

    public void setCreateProyect(boolean CreateProyect) {
        this.CreateProyect = CreateProyect;
    }

    public boolean isCreateTask() {
        return CreateTask;
    }

    public void setCreateTask(boolean CreateTask) {
        this.CreateTask = CreateTask;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
     
   
}
