<%--
  Created by IntelliJ IDEA.
  User: Мария
  Date: 23.03.2024
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login page</title>
</head>
<body>
<h1>Please enter login and password</h1>
<form method = POST action="session-servlet" >

    <div class="mb-3 row">
        <label for="Email" class="col-sm-2 col-form-label">Email</label>
        <div class="col-sm-10">
            <input type="text"  class="form-control" id="Email" name="e_mail">
        </div>
    </div>
    <div class="mb-3 row">
        <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="inputPassword" name = "pass">
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>

</form>


<a href="index.jsp">на главную</a>
</body>
</html>
