<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/style2.css">
</head>
<body>

<!--  <form action="getdatanew">
	Name : <input type="text" name="name">
	password : <input type="text" name="password">
	email : <input type="text" name="email">
	phone : <input type="text" name="phone">
	city : <input type="text" name="address.city">
	state : <input type="text" name="address.state">
	<input type="submit" value="Send">
</form> -->

<div class="form-style-10">
<h1>Sign Up Now!<span>Sign up and tell us what you think of the site!</span></h1>
<form action ="getdatanew">
    <div class="section"><span>1</span>First Name & Address</div>
    <div class="inner-wrap">
        <label>Your Full Name <input type="text" name="name" /></label>
        <label>City <input type="text" name="address.city" /></label>
        <label>State <input type="text" name="address.state" /></label>
    </div>

    <div class="section"><span>2</span>Email & Phone</div>
    <div class="inner-wrap">
        <label>Email Address <input type="email" name="email" /></label>
        <label>Phone Number <input type="text" name="phone" /></label>
    </div>

    <div class="section"><span>3</span>Passwords</div>
        <div class="inner-wrap">
        <label>Password <input type="password" name="password" /></label>
    </div>
    <div class="button-section">
     <input type="submit" name="Sign Up" value="Send" />
     <span class="privacy-policy">
     <input type="checkbox" name="field7">You agree to our Terms and Policy. 
     </span>
    </div>
</form>
</div>
</body>
</html>


