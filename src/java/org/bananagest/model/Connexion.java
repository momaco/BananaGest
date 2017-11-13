package org.bananagest.model;

import java.sql.Connection;
import java.sql.DriverManager;
import org.javabrain.db.PropertyValues;

/**
 *
 * @author ol
 */
public class Connexion {
    
    private Connection conexion;
    private PropertyValues values;
    
    public Connexion() {
        
        values = new PropertyValues();
    }
    
    public static Connexion getInstance() {
        return ConnexioHolder.INSTANCE;
    }
    
    private static class ConnexioHolder {

        private static final Connexion INSTANCE = new Connexion();
    }
    
    public Connection MySQLConnect(){
        
        try 
        {
            Class.forName(values.getProperty("dbdiver"));
            conexion = DriverManager.getConnection(
            values.getProperty("server"), 
            values.getProperty("user"),
            values.getProperty("password"));
 
        } 
        catch (Exception ex) 
        {
            System.out.println(ex.getMessage());
        }
        
        return conexion;
    }
}
