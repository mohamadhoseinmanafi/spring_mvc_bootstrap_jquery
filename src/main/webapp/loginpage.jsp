<%--
  Created by IntelliJ IDEA.
  User: mWX541909
  Date: 9/18/2018
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>
<p>${rexLoginMessage}</p>

<form action="statuspage.html" method="post">
    Name:<input type="text" name="name"/><br/>
    Password:<input type="password" name="password"/><br/>
    <input type="submit" value="login"/>
</form>

</body>
</html>
