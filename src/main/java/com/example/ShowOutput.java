package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/show")
public class ShowOutput extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");//MIME TYPE=multipurpose internet mail extensions
        PrintWriter pw = response.getWriter();
        String uname=request.getParameter("username");
        String city=request.getParameter("city");
        city=MessageLocation.getMessageByLoc(city);
        pw.println("<body color='blue' text='white'></body>");
        pw.println("<h2>Username is"+uname+"</h2>");
        pw.println("<h2>"+city+"</h2>");
        pw.close();
    }
}
