<%--
  Created by IntelliJ IDEA.
  User: Wrysunny
  Date: 2019/11/22
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    姓名:<input type="text" name="name"/><br/>
    文件:<input type="file" name="file"/><br/>
    <input type="submit" value=" 提 交 "/> </form>
</body>
</html>
