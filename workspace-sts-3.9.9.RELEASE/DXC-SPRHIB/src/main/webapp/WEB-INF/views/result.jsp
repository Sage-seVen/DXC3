<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/style.css">
</head>

<body>

<h1>
Hello Backend! ${refName}
</h1>

<p>
 	<c:forEach items="${Car}" var="out">
 	${out.name } ${out.genre } ${out.publisher} ${out.rating} </br>
 	</c:forEach>
</p>
</body>
</html>
</body>
</html>