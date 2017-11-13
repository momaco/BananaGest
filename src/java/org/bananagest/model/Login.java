package org.bananagest.model;

/**
 *
 * @author ol
 */
public class Login {
    
    private UsersData data;

    public Login() {
        data = UsersData.getInstance();
    }
    
    public boolean isValid(String name,String password)
    {
        boolean isUser = false;
        
        for (Object value : data.getMap().values()) {
            
            String nameD = ((User) value).getName();
            String emailD = ((User) value).getEmail();
            String passwordD = ((User) value).getPassword();
            
            if((nameD.equals(name) || emailD.equals(name)) && (passwordD.equals(password)))
            {
                isUser = true;
            }
        }
        
        return isUser;
    }

}
