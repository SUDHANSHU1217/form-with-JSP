/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formDemo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Asus
 */
public class RegisterServlet extends HttpServlet{
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
     response.setContentType("text/html");
     PrintWriter out=response.getWriter();
      out.println("<h1>Welcome to Register servlet</h1>");
      String name=request.getParameter("user_name");
      String password=request.getParameter("user_password");
      String email=request.getParameter("user_email");
      String gen=request.getParameter("user_gender");
      String course=request.getParameter("course");
      String cond=request.getParameter("condition");
      
      if(cond.equals("checked")){
          out.println("<h2> NAME :"+name+"</h2>");
          out.println("<h2> PASSWORD :"+password+"</h2>");
          out.println("<h2> EMAIL :"+email+"</h2>");
          out.println("<h2> GENDER :"+gen+"</h2>");
          out.println("<h2> COURSE :"+course+"</h2>");
      }else{
         out.println("<h2>you have not accepted terms and condition</h2>");
      }
      
      
      
      
      
}
}
