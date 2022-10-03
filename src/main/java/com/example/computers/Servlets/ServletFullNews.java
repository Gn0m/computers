package com.example.computers.Servlets;

import com.example.computers.Data.DataNews;
import com.example.computers.Object.News;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "fullNews", value = "/fullNews")
public class ServletFullNews extends HttpServlet {
    private ArrayList<News> news = new ArrayList<>();
    private int count = 0;
    private DataNews data = new DataNews();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (count < 1) {
            news = data.getNews();
        }
        response.setContentType("text/html");
        int idParam = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("news", news.get(idParam));
        RequestDispatcher dispatcher = request.getRequestDispatcher("/fullNews.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
