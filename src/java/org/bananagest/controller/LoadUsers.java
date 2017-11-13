package org.bananagest.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.bananagest.model.Connexion;
import org.bananagest.model.User;
import org.bananagest.model.UsersData;

/**
 *
 * @author ol
 */
@WebServlet(name = "LoadUsers", urlPatterns = {"/LoadUsers"})
public class LoadUsers extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        Statement stmt = null;
        ResultSet rs = null;
        
        try 
        {
            Connexion conn = Connexion.getInstance();
            UsersData data = UsersData.getInstance();
            
            stmt = conn.MySQLConnect().createStatement();
            rs = stmt.executeQuery("{call selectUsers}");
            
            while(rs.next())
            {
                data.getMap().put(rs.getInt(1),
                new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)));
            }

        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(LoadUsers.class.getName()).log(Level.SEVERE, null, ex);
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
                Logger.getLogger(LoadUsers.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
 
}
