
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>Vie - Eng Dictionary</h1>
<form  method="post">
    <input type="text" name="word" placeholder="input">
    <input type="submit" value="submit">
</form>
<p>${vocabulary}</p>

<c:if test="${error==1}">
    <script>alert("Not found")</script>
</c:if>
</body>
</html>