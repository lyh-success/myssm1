<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/17
  Time: 11:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
 <a href="account/findall">查询</a>

    <form action="account/save" method="post">
        姓名:<input type="text" name="name"/><br/>
        金额:<input type="text" name="money"/><br/>
        <input type="submit" value="提交"/><br/>
    </form>
</body>
</html>
