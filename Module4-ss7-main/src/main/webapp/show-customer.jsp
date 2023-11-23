<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.example.ss7.Customer" %><%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 22/11/2023
  Time: 9:13 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        img{
            display: block;
            height: 120px;
            margin-left: 45%;
        }
        /* Your CSS styles can be added here */
        table {
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            border: 1px solid #dddddd;
            text-align: center;
            padding: 8px;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<table>
    <tr>
        <th>name</th>
        <th>address</th>
        <th>image</th>
    </tr>
<c:forEach var="item" items="${lCustomer}">
    <tr>
        <td>${item.name}</td>
        <td>${item.address}</td>
        <td><img src="${item.image}"></td>
    </tr>
</c:forEach>>
</table>
</body>
</html>
