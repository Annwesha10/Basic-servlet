package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/welc")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");//MIME TYPE=multipurpose internet mail extensions
        PrintWriter pw = response.getWriter();
        pw.println("<body bgcolor='cyan' text='black'><h1>Hello World from servlet</h1></body>");
        pw.close();
    }
}
