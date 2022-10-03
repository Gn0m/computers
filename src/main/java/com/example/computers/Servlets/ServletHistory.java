package com.example.computers.Servlets;

import com.example.computers.Data.DateDescription;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "history", value = "/history")
public class ServletHistory extends HttpServlet {

    private DateDescription dateDescription = new DateDescription();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setAttribute("map", dateDescription.getMap());
        request.setAttribute("info",dateDescription.getInfo());
        request.setAttribute("headers",dateDescription.getHeaders());
        request.setAttribute("imgs",dateDescription.getImgs());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/history.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
