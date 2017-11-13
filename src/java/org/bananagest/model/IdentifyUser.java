package org.bananagest.model;

/**
 *
 * @author ol
 */
public class IdentifyUser {
    
    private int idUser = 0;

    private IdentifyUser() {
    }
    
    public static IdentifyUser getInstance() {
        return IdentifyUserHolder.INSTANCE;
    }
    
    private static class IdentifyUserHolder {

        private static final IdentifyUser INSTANCE = new IdentifyUser();
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
    
    
}
