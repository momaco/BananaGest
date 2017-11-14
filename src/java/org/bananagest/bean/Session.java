package org.bananagest.bean;

import javax.faces.bean.ManagedBean;
import org.bananagest.model.IdentifyUser;
import org.bananagest.model.User;
import org.bananagest.model.UsersData;

/**
 *
 * @author feris
 */
@ManagedBean(name = "session")
public class Session {
    
    private userName;
    
    public void getUserName()
    {
        return "Fernando";
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    
}
