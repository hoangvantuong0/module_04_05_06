<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/12/2021
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<form action="/calculator" method="get">
  <input type="text" name="number1" placeholder="Enter number 1">
  <input type="text" name="number2" placeholder="Enter number 2"> </br>
  <input type="submit" name="cal" value="Addition">
  <input type="submit" name="cal" value="Subtraction">
  <input type="submit" name="cal" value="Multiplication">
  <input type="submit" name="cal" value="Division">
</form>
<p>${result}</p>
</body>
</html>