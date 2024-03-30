
<%@ page import="static jdk.internal.org.jline.utils.InfoCmp.Capability.user1" %><%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 16.03.2024
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user page</title>
</head>
<body>
<h1>"Это страница зарегистированного пользователя"</h1>
<form method = POST action="calc-servlet" >
    <h1>"введите ссылку на файл"</h1>
    <label for="filepath" class="col-sm-2 col-form-label">Path</label>
    <div class="col-sm-10">
        <input type="text"  class="form-control" id="filepath" name="filepath">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<a href="index.jsp">на главную</a>
<a href="Session.jsp">записи сессии</a>
<a href="cookie.jsp"> messages from cookie</a>
</body>
</html>
