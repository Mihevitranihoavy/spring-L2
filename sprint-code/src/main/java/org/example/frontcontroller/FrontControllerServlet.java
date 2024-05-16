package org.example.frontcontroller;

import org.example.framework.AnnotationController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@AnnotationController
public class FrontControllerServlet extends HttpServlet{

    protected void processRequest(HttpServletRequest request , HttpServletResponse response)
            throws ServletException ,IOException{
        String url = request.getRequestURI();

        //Scanner les controlleur

        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        try{
            Class<?>[] classes = loader.loadClass("org.example.frontcontroller.FrontControllerServlet").getClasses();
            for(Class<?> clazz : classes){
                if(clazz.isAnnotationPresent(AnnotationController.class)){
                    System.out.println("Controlleur trouvé : "+ clazz.getName());
                }
            }
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        response.getWriter().write("Vous etes sur l'URL :"+url);


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


