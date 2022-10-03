<%--
  Created by IntelliJ IDEA.
  User: ilyan
  Date: 01.10.2022
  Time: 22:00
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
    <title>News</title>
    <link href="css/news.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
    <c:forEach var="item" items="${news}">
        <div class="col">
            <div class="card" style="width: 18rem;">
                <img src="${item.getImg()}" class="card-img-top" alt="...">
                <div class="card-body">
                    <h5 class="card-title">${item.getHeader()}</h5>
                    <p class="card-text">${item.getText()}</p>
                    <a href="fullNews?id=${item.getId()}" class="btn btn-primary">Перейти к новости</a>
                </div>
            </div>
        </div>
        </c:forEach>
    </div>
</div>
</body>
</html>
