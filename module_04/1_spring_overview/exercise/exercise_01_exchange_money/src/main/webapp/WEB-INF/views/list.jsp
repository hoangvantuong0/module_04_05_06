<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Title</title>
  <!-- CSS only -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
        crossorigin="anonymous">
</head>
<body>
<div class="col-12">
  <form method="post">
    <div class="mb-3">Exchange Money</div>
    <div class="mb-3">
      <label >USD</label>
      <input type="text"  name="usd"
             placeholder="1$ = 23.000">
    </div>
    <div class="mb-3">
      <label >VND</label>
      <input type="text" value="${vnd}" placeholder="23.000 = 1$">
    </div>
    <div class="mb-3">
      <label></label>
      <button type="submit" class="btn btn-primary">Convert</button>
    </div>

  </form>
</div>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>


</body>
</html>