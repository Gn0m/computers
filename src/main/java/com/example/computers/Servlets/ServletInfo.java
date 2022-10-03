package com.example.computers.Servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "info", value = "/info")
public class ServletInfo extends HttpServlet {

    private String [] strings = {"AsusTek Computer Inc.","Место расположения штаб квартиры: Китай",
            "Число сотрудников: 17000+","Название компании ASUS происходит от слова Pegasus (Пегас) – " +
            "так звали крылатого коня из древнегреческой мифологии, символизирующего мудрость и знания, поэтому бренд ASUS " +
            "воплощает в себе силу, дух творчества и чистоту этого существа. С каждым новым продуктом компании ASUS покоряются все новые вершины. " +
            "За последние десятилетия тайваньская индустрия информационных технологий пережила огромный рост, выдвинув эту страну в число " +
            "лидеров глобального рынка. Одним из локомотивов роста стала компания ASUS, образованная в качестве производителя" +
            " материнских плат с минимальным количеством сотрудников, а сейчас насчитывающая более 17 тысяч человек персонала по всему миру." +
            " ASUS выпускает продукты почти во всех отраслях, относящихся к категории ИТ: компьютерные компоненты и " +
            "периферийные устройства, ноутбуки, планшетные компьютеры, серверы и смартфоны. Секретом успеха ASUS " +
            "является стремление к инновациям. Среди революционных продуктов компании можно отметить смартфон PadFone, " +
            "покоривший публику на выставке Computex 2011, а также последовавшие за ним гибридные мобильные решения TAICHI и Transformer Book."};

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        request.setAttribute("strings", strings);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/generalInfo.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
