<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<link rel="icon" type="image/png" href="${pageContext.request.contextPath}/resources/images/icons/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/util.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css">
<!--===============================================================================================-->
</head>

<body>

<h1>
Hello Backend! 
</h1></br>
<h3>Entries found matching Title name - "${ref1.name }"</h3>

<div class="bg-contact3" style="background-image: url('${pageContext.request.contextPath}/resources/images/bg-01.jpg');">
		<div class="container-contact3">
		

	<table border=3>
	 	<tr><th>Title Name</th><th>Genre</th><th>Publisher</th><th>Rating</th></tr>
	 	<tr>
	 	<td>${ref1.name }</td><td> ${ref1.genre } </td><td>${ref1.publisher} </td><td>${ref1.rating}</td> 
	 	</tr>
	</table>
	
</div>
</div>
</body>
</html>
</body>
</html>