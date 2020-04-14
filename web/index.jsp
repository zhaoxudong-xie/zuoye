<%--
  Created by IntelliJ IDEA.
  User: 大名：斯巴达
  Date: 2020/4/10
  Time: 13:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>展示学员</title>
    <script src="js/jquery-2.1.0.min.js"></script>
  </head>
  <body>
  <table border="1" >
    <tr class="success">
      <th>编号</th>
      <th>姓名</th>
      <th>性别</th>
      <th>年龄</th>
      <th>学号</th>
      <th>QQ</th>
      <th>邮箱</th>
    </tr>

    <c:forEach items="${student}" var="student" varStatus="s">
      <tr>
        <td>${s.count}</td>
        <td>${student.name}</td>
        <td>${student.sex}</td>
        <td>${student.age}</td>
        <td>${student.stuId}</td>
        <td>${student.QQ}</td>
        <td>${student.email}</td>
      </tr>

    </c:forEach>


  </table>
  <a
          href="${pageContext.request.contextPath}/zhuxiaoServlet" >注销
  </a>
  </body>
</html>
