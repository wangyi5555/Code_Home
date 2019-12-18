<%--
  Created by IntelliJ IDEA.
  User: Wrysunny
  Date: 2019/11/12
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/shiro/login" method="post">
    <label>账号：</label>
    <input type="text" name="username">
    <br>
    <label>密码：</label>
    <input type="text" name="password">
    <br>
    <input type="submit">
    <input type="reset">
</form>
</body>
</html>
