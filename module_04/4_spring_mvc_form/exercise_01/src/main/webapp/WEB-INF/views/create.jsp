<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
  <title>Create a new employee</title>
</head>
<body>
<h3>Language</h3>
<%--@elvariable id="employee" type=""--%>
<form:form action="/save" method="post" modelAttribute="email">
  <table>
    <tr>
      <td>
        Languages:
      </td>
      <td>
        <form:select path="language">
          <form:options items="${languageList}"></form:options>
        </form:select>
      </td>
    </tr>
    <tr>
      <td>
        Page size:
      </td>
      <td>Show
        <form:select path="pageSize">
          <form:options items="${pageSizeList}"></form:options>
        </form:select>
        emails per page
      </td>
    </tr>
    <tr>
      <td>
        Spams filter:
      </td>
      <td>
        <form:checkbox path="spamsFilter"></form:checkbox>Enable spams filter
      </td>
    </tr>
    <tr>
      <td>
        Signature:
      </td>
      <td>
        <form:textarea path="signature"></form:textarea>
      </td>
    </tr>

    <tr>
      <td></td>
      <td>
        <button type="submit">Save</button>
        <button onclick="location.href='/'" type="button">Cancel</button>
      </td>
    </tr>

  </table>
</form:form>
</body>
</html>