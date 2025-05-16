<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/15/2025
  Time: 9:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--<head><title>Home</title></head>--%>
<%--<body>--%>
<%--<h2>Welcome, ${customer.username}!</h2>--%>
<%--<p>Email: ${customer.email}</p>--%>
<%--<p>Phone: ${customer.phone}</p>--%>
<%--<p>Address: ${customer.address}</p>--%>
<%--</body>--%>
<head><title>Now Showing</title></head>
<body>
<h2>Now Showing</h2>
<ul>
    <c:forEach var="movie" items="${movies}">
        <li>
            <strong>${movie.title}</strong> - ${movie.director} (${movie.genre})
            | <a href="${pageContext.request.contextPath}/detailMovie?id=${movie.id}">View Details</a>
        </li>
    </c:forEach>
</ul>
</body>
</html>
