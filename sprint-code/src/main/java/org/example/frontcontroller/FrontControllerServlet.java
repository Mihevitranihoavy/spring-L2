package org.example.frontcontroller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FrontControllerServlet extends HttpServlet{

    protected void processRequest(HttpServletRequest request , HttpServletResponse response)
            throws ServletException ,IOException{
        String url = request.getRequestURI();
        response.getWriter().write( "Vous ete sur L'URl :" + url);


    }

    @Override

    protected void doGet(HttpServletRequest request , HttpServletResponse response)

            throws ServletException, IOException {
        processRequest(request , response);
    }


    @Override

    protected void doPost(HttpServletRequest request , HttpServletResponse response)

            throws ServletException ,IOException{
        processRequest(request,response);
    }



}


