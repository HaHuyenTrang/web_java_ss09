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
<p><strong>Director:</strong> ${movie.director}</p>
<p><strong>Genre:</strong> ${movie.genre}</p>
<p><strong>Description:</strong> ${movie.description}</p>
<p><strong>Duration:</strong> ${movie.duration} minutes</p>
<p><strong>Language:</strong> ${movie.language}</p>

<a href="${pageContext.request.contextPath}/">Back to Home</a>
</body>
</html>
