<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 22/11/2023
  Time: 1:40 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="cacu" method="post">
    <div>
        <div>
            <p>Nhập số: </p>
            <input type="number" name="a">
            <br>
            <select name="select">
                <option value="addition">+</option>
                <option value="subtraction">-</option>
                <option value="multiplication">*</option>
                <option value="division">/</option>
            </select>
            <p>Nhập số: </p>
            <input type="number" name="b">
            <br>
            <button type="submit">Tính toán</button>
        </div>
    </div>
</form>
</body>
</html>
