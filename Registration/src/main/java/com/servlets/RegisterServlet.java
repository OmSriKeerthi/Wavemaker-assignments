package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class RegisterServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        String uname=request.getParameter("uname");
        String pwd=request.getParameter("pwd");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/admin","root","akdeae@431");
            PreparedStatement pstmt=con.prepareStatement("insert into register values(?,?)");
            pstmt.setString(1,uname);
            pstmt.setString(2,pwd);
            int res= pstmt.executeUpdate();
            out.println("<h1>"+res+" Insertion is success</h1>");


        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
