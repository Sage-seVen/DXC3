<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Sign Up Form by Colorlib</title>

    <!-- Font Icon -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/material-icon/css/material-design-iconic-font.min.css">

    <!-- Main css -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</head>
<body background="${pageContext.request.contextPath}/resources/images/form-img.jpg">

    <div class="main">

        <div class="container">
            <div class="booking-content">
                <div class="booking-form">
                    <form id="booking-form" action="savedata">
                        <h2>Gaming Collection!</h2>
                        <div class="form-group form-input">
                            <input type="text" name="name" id="name" value="" required/>
                            <label for="name" class="form-label">Name of Title</label>
                        </div>
                        <div class="form-group form-input">
                            <input type="text" name="publisher" id="phone" value="" required />
                            <label for="phone" class="form-label">Title Publisher</label>
                        </div>
                        <div class="form-group">
                            <div class="select-list">
                                <select name="genre" id="time" required>
                                    <option value="">Genre</option>
                                    <option value="FPS">FPS</option>
                                    <option value="Strategy">Strategy</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-radio">
                            <label class="label-radio"> Rating </label>
                            <div class="radio-item-list">
                                <span class="radio-item">
                                    <input type="radio" name="rating" value="1" id="number_people_2" />
                                    <label for="number_people_2">1</label>
                                </span>
                                <span class="radio-item active">
                                    <input type="radio" name="rating" value="2" id="number_people_4" checked="checked" />
                                    <label for="number_people_4">2</label>
                                </span>
                                <span class="radio-item">
                                    <input type="radio" name="rating" value="3" id="number_people_6" />
                                    <label for="number_people_6">3</label>
                                </span>
                                <span class="radio-item">
                                    <input type="radio" name="rating" value="4" id="number_people_8" />
                                    <label for="number_people_8">4</label>
                                </span>
                                <span class="radio-item">
                                    <input type="radio" name="rating" value="5" id="number_people_10" />
                                    <label for="number_people_10">5</label>
                                </span>
                            </div>
                        </div>

                        <div class="form-submit">
                            <input type="submit" value="Save Data" class="submit" id="submit"  /> 
                            <input type="submit" value="View Data" class="submit" id="submit"  formaction="viewdata" />
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>

    <!-- JS -->
    
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="js/main.js"></script>
</body><!-- This templates was made by Colorlib (https://colorlib.com) -->
</html>
