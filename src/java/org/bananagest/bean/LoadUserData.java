package org.bananagest.bean;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import org.bananagest.model.Connexion;
import org.bananagest.model.User;
import org.bananagest.model.UsersData;

/**
 *
 * @author feris
 */
@ManagedBean
public class LoadUserData {
    
    public void onLoad() 
    {
        Statement stmt = null;
        ResultSet rs = null;
        
        try 
        {

            Connexion conn = Connexion.getInstance();
            UsersData data = UsersData.getInstance();

            stmt = conn.MySQLConnect().createStatement();
            rs = stmt.executeQuery("{call selectUsers}");

            while (rs.next()) 
            {
                data.getMap().put(rs.getInt(1),
                new User(rs.getInt(1), rs.getString(2), 
                rs.getString(3), rs.getString(4)));
            }
            
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(LoadUserData.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally 
        {

            try 
            {
                stmt.close();
                rs.close();
            } 
            catch (SQLException ex) 
            {
                Logger.getLogger(LoadUserData.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    
}
