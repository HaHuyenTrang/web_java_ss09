<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Trang
  Date: 5/15/2025
  Time: 9:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Movie Details</title></head>
<body>
<h2>${movie.title}</h2>
<p>Genre: ${movie.genre}</p>
<p>Director: ${movie.director}</p>

<h3>Showtimes:</h3>
<table border="1">
    <tr>
        <th>Show Time</th>
        <th>Room</th>
        <th>Available Seats</th>
        <th>Format</th>
    </tr>
    <c:forEach var="s" items="${schedules}">
        <tr>
            <td>${s.showTime}</td>
            <td>
                <c:forEach var="r" items="${rooms}">
                    <c:if test="${r.id == s.screenRoomId}">
                        ${r.screenRoomName}
                    </c:if>
                </c:forEach>
            </td>
            <td>${s.availableSeats}</td>
            <td>${s.format}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
