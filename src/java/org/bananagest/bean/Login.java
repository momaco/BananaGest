package org.bananagest.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.bananagest.model.IdentifyUser;
import org.bananagest.model.User;
import org.bananagest.model.UsersData;

/**
 *
 * @author feris
 */
@ManagedBean
@SessionScoped
public class Login {
    
    private String user;
    private String password;
    private String message;
    
    //Actions 
    public void checkUser()
    {
        UsersData data = UsersData.getInstance();
        
        if(user.isEmpty() || password.isEmpty())
        {
            message = "All fields must be filled";
        }
        else
        {
            for (Object obj : data.getMap().values()) 
            {
                User us = (User) obj;
                
                if((us.getName().equals(user) || us.getEmail().equals(user)) 
                   && (us.getPassword().equals(password)))
                {
                    message = "Entro con :"+user+" y "+password; 
                    IdentifyUser id = IdentifyUser.getInstance();
                    
                    id.setIdUser(us.getId());
                    
                    break;
                }
                else
                {
                    message = "The user or password is incorrect";
                }
            } 
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
