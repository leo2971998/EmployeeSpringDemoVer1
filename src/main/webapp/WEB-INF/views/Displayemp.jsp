<%--
  Created by IntelliJ IDEA.
  User: Anh Tu Nguyen
  Date: 8/24/2022
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>Empno</th>
        <th>Ename</th>
        <th>Job</th>
        <th>HireDate</th>
    </tr>
    <a:forEach var="e" items="${Elist}">
        <tr>
            <td>${e.empno}</td>
            <td>${e.ename}</td>
            <td>${e.job}</td>
            <td>${e.hireDate}</td>
        </tr>
    </a:forEach>
</table>
</body>
</html>
