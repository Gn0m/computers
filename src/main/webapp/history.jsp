<%@ page import="com.example.computers.Data.DateDescription" %>
<%@ page import="com.example.computers.Object.Img" %><%--
  Created by IntelliJ IDEA.
  User: ilyan
  Date: 01.10.2022
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8"
            crossorigin="anonymous"></script>
    <title>History</title>
    <link href="css/generalInfoStyle.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row" style="margin-bottom: 25px">
        <p><b>ASUS</b>${info}</p>
    </div>
    <div class="row">
        <div class="col">

            <c:forEach var="item" items="${headers}" begin="0" end="0">

                <h3>${item.key}</h3>

                <c:forEach var="value" items="${item.value}">
                    <p>${value}</p>
                    <br>
                </c:forEach>

                <c:forEach var="img" items="${imgs}" begin="0" end="0">
                    <figure>
                        <p><img style="text-align: center" src="${img.getUrl()}" alt="${img.getName()}"></p>
                        <figcaption style="text-align: center">${img.getName()}</figcaption>
                    </figure>

                </c:forEach>
            </c:forEach>

            <c:forEach var="item" items="${headers}" begin="1" end="1">

                <h3>${item.key}</h3>

                <c:forEach var="value" items="${item.value}">
                    <p>${value}</p>
                    <br>
                </c:forEach>

                <c:forEach var="img" items="${imgs}" begin="1" end="1">
                    <figure>
                        <p><img style="text-align: center" src="${img.getUrl()}" alt="${img.getName()}"></p>
                        <figcaption style="text-align: center">${img.getName()}</figcaption>
                    </figure>

                </c:forEach>
            </c:forEach>
        </div>
        <div class="col">
            <ul>
                <c:forEach var="item" items="${map}">
                    <li style="list-style-type: none"><b>${item.key}</b></li>
                    <c:forEach var="value" items="${item.value}">
                        <li>${value}</li>
                    </c:forEach>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
