package com.example.computers.Servlets;

import com.example.computers.Data.DataNotepads;
import com.example.computers.Object.Notepad;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "notepads", value = "/notepads")
public class ServletNotepads extends HttpServlet {

    private ArrayList<Notepad> notepads;
    private int count = 0;
    private DataNotepads data = new DataNotepads();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (count != 1) {
            notepads = data.getNotepads();
        }

        response.setContentType("text/html");
        request.setAttribute("notepads", notepads);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/notepads.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
