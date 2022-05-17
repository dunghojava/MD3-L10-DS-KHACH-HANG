<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/17/2022
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Danh sach Khach hang</title>
  </head>
  <body>
  <table>
    <tr>
      <th>ten</th>
      <th>ngay sinh</th>
      <th>dia chi</th>
      <th>anh</th>
    </tr>
    <c:forEach items="${khachhangList}" var="item">
      <tr>
        <td>${item.getTen()}</td>
        <td>${item.getNgaysinh()}</td>
        <td>${item.getDiachi()}</td>
        <td><img src="${item.getAnh()}"></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
