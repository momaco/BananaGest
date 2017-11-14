package org.bananagest.bean;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import org.bananagest.model.IdentifyUser;
import org.bananagest.model.User;
import org.bananagest.model.UsersData;

/**
 *
 * @author feris
 */
@ManagedBean
public class Login {

    private String user;
    private String password;
    private String message;
    
    //Actions 
    public void checkUser() {

        UsersData data = UsersData.getInstance();
        boolean pass = false;

        if (user.isEmpty() || password.isEmpty()) 
        {
            message = "All fields must be filled";
        } 
        else 
        {
            for (Object obj : data.getMap().values()) 
            {
                User us = (User) obj;

                if ((us.getName().equals(user) || us.getEmail().equals(user))
                        && (us.getPassword().equals(password))) 
                {
                    IdentifyUser id = IdentifyUser.getInstance();

                    id.setIdUser(us.getId());
                    
                    pass = true;
                    
                    break;
                }
                else 
                {
                    message = "The user or password is incorrect";
                }
            }
        }
        try 
        {
            if(pass)
            {
                FacesContext.getCurrentInstance().getExternalContext().redirect("home.xhtml");
                FacesContext.getCurrentInstance().responseComplete();
            }
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Get and set
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
