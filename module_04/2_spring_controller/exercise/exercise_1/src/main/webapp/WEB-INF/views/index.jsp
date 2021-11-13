<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Sandwich Condiments</title>
</head>
<body>
<h1>
  Sandwich Condiments
</h1>
<form action="/save">
  <label><input name="condiments" value="lettuce" type="checkbox"/>Lettuce</label> <br/>
  <label><input name="condiments" value="tomato" type="checkbox"/>Tomato</label> <br/>
  <label><input name="condiments" value="mustard" type="checkbox"/>Mustard</label> <br/>
  <label><input name="condiments" value="sprouts" type="checkbox"/>Sprouts</label> <br/>
  <input type="submit" value="save">
</form>
</body>
</html>