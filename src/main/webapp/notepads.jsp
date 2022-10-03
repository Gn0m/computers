<%--
  Created by IntelliJ IDEA.
  User: ilyan
  Date: 01.10.2022
  Time: 22:36
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
    <title>Notepads</title>
    <link href="css/notepads.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
        <c:forEach var="item" items="${notepads}">
            <div class="col">
                <div class="card" style="width: 18rem;">
                    <c:forEach var="notebook" items="${item.getImg()}" begin="0" end="0">
                        <img src="${notebook}" class="card-img-top" alt="...">
                    </c:forEach>

                    <div class="card-body">
                        <h5 class="card-title">${item.getName()}</h5>
                        <a href="fullNotepads?id=${item.getId()}" class="btn btn-primary">Перейти к новости</a>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
</body>
</html>