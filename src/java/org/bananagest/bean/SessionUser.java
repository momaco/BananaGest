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
public class SessionUser {
    
    private String userName;

    public String getUserName() {
        
        IdentifyUser id = IdentifyUser.getInstance();
        UsersData data = UsersData.getInstance();
        User user = (User) data.getMap().get(id.getIdUser());
        
        return user.getName();
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
