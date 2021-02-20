<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${requestScope.error }
<form action="/ssm02/user/insertuser.do" method="post">
    用户名：<input type="text" name="userName" value="${ub.userName}"/>
    密码：<input type="password" name="userPs" value="${ub.userPs}"/>
    年龄：<input type="text" name="userAge" value="${ub.userAge}"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
