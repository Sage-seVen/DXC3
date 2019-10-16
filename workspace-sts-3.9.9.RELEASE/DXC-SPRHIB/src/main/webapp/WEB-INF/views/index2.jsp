<!DOCTYPE html>
<html lang="en">
<head>
	<title>Contact V3</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
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

	<div class="bg-contact3" style="background-image: url('${pageContext.request.contextPath}/resources/images/bg-01.jpg');">
		<div class="container-contact3">
			<div class="wrap-contact3">
				<form class="contact3-form validate-form">
					<span class="contact3-form-title">
						Gaming Collection!
					</span>

					<div class="wrap-contact3-form-radio">
						<div class="contact3-form-radio m-r-42">
							<input class="input-radio3" id="radio1" type="radio" name="choice" value="say-hi" checked="checked">
							<label class="label-radio3" for="radio1">
								View
							</label>
						</div>

						<div class="contact3-form-radio">
							<input class="input-radio3" id="radio2" type="radio" name="choice" value="get-quote">
							<label class="label-radio3" for="radio2">
								Create
							</label>
						</div>
						
						
					</div>

					<div class="wrap-input3 validate-input" data-validate="Name is required">
						<input class="input3" type="text" name="name" placeholder="Title Name">
						<span class="focus-input3"></span>
					</div>

					<div class="wrap-input3 input3-select validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input3" type="text" name="publisher" placeholder="Title Publisher">
						<span class="focus-input3"></span>
					</div>

					<div class="wrap-input3 input3-select">
						<div>
							<select class="selection-2" name="genre">
								<option>Genre</option>
								<option>First Person Shooter</option>
								<option>Strategy</option>
								<option>Multiplayer</option>
							</select>
						</div>
						<span class="focus-input3"></span>
					</div>

					<div class="wrap-input3 input3-select">
						<div>
							<select class="selection-2" name="rating">
								<option>Rating</option>
								<option>1 </option>
								<option>2 </option>
								<option>3 </option>
								<option>4 </option>
								<option>5 </option>
							</select>
						</div>
						<span class="focus-input3"></span>
					</div>

					<!-- <div class="wrap-input3 validate-input" data-validate = "Message is required">
						<textarea class="input3" name="message" placeholder="Your Message"></textarea>
						<span class="focus-input3"></span>
					</div> -->


						<!-- <div class="wrap-contact3-form-radio">
						<div class=" input3-select contact3-form-radio m-r-42">
						<button class="contact3-form-btn" formaction="savedata">
							kuchb
						</button>			
						</div>
						</div>
							
							
						<div class="wrap-contact3-form-radio">
						 <div class=" input3-select contact3-form-radio m-r-42 ">
						<button class="contact3-form-btn" formaction="savedata">
							Update1
						</button>
						</div> 
						</div>  -->





					<div class=" input3-select container-contact3-form-btn">
						<button class="contact3-form-btn" formaction="savedata">
							Save
						</button>
					</div>
					<div class="container-contact3-form-btn">
						<button class="contact3-form-btn" formaction="viewdataid">
							Search
						</button>
					</div>
					
					<div class=" input3-select container-contact3-form-btn">
						<button class="contact3-form-btn" formaction="updateid">
							Update
						</button>
	
	
					</div>
					
					<div class="container-contact3-form-btn">
						<button class="contact3-form-btn" formaction="deleteid">
							Delete
						</button>
					</div>
					
					<div class="container-contact3-form-btn">
						<button class="contact3-form-btn" formaction="viewdata">
							View All
						</button>
					</div>
				</form>
			</div>
		</div>
	</div>


	<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/popper.js"></script>
	<script src="${pageContext.request.contextPath}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/vendor/select2/select2.min.js"></script>
	<script>
		$(".selection-2").select2({
			minimumResultsForSearch: 20,
			dropdownParent: $('#dropDownSelect1')
		});
	</script>
<!--===============================================================================================-->
	<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>

	<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-23581568-13');
</script>

</body>
</html>
