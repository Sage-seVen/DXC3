<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/style2.css">
</head>
<body>



<form>

<c:choose>
    <c:when test="${var==true}">
	ShowRoom Name : <input type="text" name="sname" value="${sname}" disabled="disabled">
	ShowRoom Name : <input type="hidden" name="sname" value="${sname}">
    </c:when>    
    <c:otherwise>

	ShowRoom Name : <input type="text" name="sname">
    </c:otherwise>
</c:choose>

	Car Name : <input type="text" name="car.Name">
	Brand Name : <input type="text" name="car.Brandname">
	<input type="submit" value="Add Car" formaction="addcar">
	<input type="submit" value="View List" formaction="viewcar">
</form> 

</body>
</html>
