package org.bananagest.pojo;

import java.io.Serializable;
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
@Table(name = "tbl_user" ,catalog = "bananaguest")
public class Tbl_user{
 
    @Id @GeneratedValue
    @Column(name = "idUser", nullable = true)
    private int idUser;
    
    @Column(name = "name", nullable = true)
    private String name;
    
    @Column(name = "password", nullable = true)
    private String password;
    
    @Column(name = "email", nullable = true)
    private String email;
    
    @Column(name = "valid", nullable = true)
    private boolean valid;

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }  
}
