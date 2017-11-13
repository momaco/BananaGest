package org.bananagest.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.bananagest.model.Login;
import org.javabrain.web.controls.Content;

/**
 *
 * @author ol
 */
@WebServlet(name = "LoginControl", urlPatterns = {"/LoginControl"})
public class LoginControl extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
        Login login = new Login();
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        
        if ((!user.isEmpty()) && (!password.isEmpty())) 
        {
            if (login.isValid(user, password)) 
            {
                resp.getWriter().write("Entro");
            } 
            else
            {
                resp.getWriter().write(Content.p("Incorrect name or password"));
            }
        }
        else
        {
            resp.getWriter().write(Content.p("All fields must be full"));
        } 
    }
    
}
