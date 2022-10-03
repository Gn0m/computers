<%--
  Created by IntelliJ IDEA.
  User: ilyan
  Date: 02.10.2022
  Time: 21:10
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
    <title>Full notepads</title>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container">
    <div class="row">
            <c:forEach var="img" items="${notepad.getImg()}">
                <div class="col">
                <div class="card" style="width: 18rem;">
                    <img src="${img}" class="card-img-top" alt="...">
                </div>
                </div>
            </c:forEach>
    </div>
    <div class="row" style="margin-top: 50px">
        <div class="col">
            <h4>${notepad.getName()}</h4>
            <ul>
                <c:forEach var="feature" items="${notepad.getFeatures()}">
                    <li>${feature}</li>
                </c:forEach>
            </ul>
        </div>
    </div>
</div>
</body>
</html>
