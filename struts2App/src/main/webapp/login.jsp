<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>

<form action="login.action" method="post">
    <div>
        <label>User:</label>
        <input type="text" name="userName">
    </div>
    <div>
        <label>Password:</label>
        <input type="password" name="password">
    </div>
    <div>
        <input type="submit" value="login">
    </div>
</form>

</body>
</html>
