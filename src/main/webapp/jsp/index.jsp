<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<table width="600" align="center">
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>操作</th>
    </tr>
        <C:forEach var="u" items="${userinfoList}">
    <tr>
        <td>${u.userId}</td>
        <td>${u.userName}</td>
        <td>${u.userPs}</td>
        <td>${u.userAge}</td>
        <td>
            <%--<a href="http://localhost:8080/ssm02/user/pupdate.do?userId=${u.userId }">修改</a>--%>
            <a href="/ssm02/user/pupdate.do?userId=${u.userId }">修改</a>
                <%--<a href="user/login.do">修改</a>--%>
                <a href="/ssm02/user/deleteuser.do?userId=${u.userId }">删除</a>
                <a href="/ssm02/jsp/insert.jsp">新增</a>
        </td>
        </C:forEach>
    </tr>
</table>
<h2>Hello World!</h2>
${userbean.userName }
<hr/>
${info}
</body>
</html>
