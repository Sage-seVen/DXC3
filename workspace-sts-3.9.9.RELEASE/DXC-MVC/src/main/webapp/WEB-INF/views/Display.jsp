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
welcome ${customer.name} <br>
your contact info is ${customer.email} ${customer.phone}<br>
and your password is ${customer.password} plz change it<br>
 
 ${customer.address.city}
 ${customer.address.state}
 
</p>
</body>
</html>
</body>
</html>