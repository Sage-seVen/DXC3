<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/style.css">
</head>

<body>

<h1>
Hello world! ${refName}
</h1>

<p>
 	<c:forEach items="${Car}" var="out">
 	${out.sname } ${out.car.name } ${out.car.brandname} </br>
 	</c:forEach>
</p>
</body>
</html>
</body>
</html>