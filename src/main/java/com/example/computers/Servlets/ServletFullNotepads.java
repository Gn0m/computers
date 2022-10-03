package com.example.computers.Servlets;

import com.example.computers.Data.DataNotepads;
import com.example.computers.Object.Notepad;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "fullNotepads", value = "/fullNotepads")
public class ServletFullNotepads extends HttpServlet {

    private int count = 0;
    private ArrayList<Notepad> notepads;
    private DataNotepads data = new DataNotepads();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (count != 1) {
            notepads = data.getNotepads();
            count++;
        }

        response.setContentType("text/html");
        int idParam = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("notepad", notepads.get(idParam));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/fullNotepads.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
