<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel='stylesheet' type='text/css' href='css/resetAndsubmit.css'>
<link rel='stylesheet' type='text/css' href='css/style.css'>

<link rel='stylesheet' type='text/css' href='css/submit.css'>
<link rel='stylesheet' type='text/css' href='css/form.css'>
<meta charset="ISO-8859-1">
<jsp:include page="/WEB-INF/frame1/header.jsp"></jsp:include>
<title>Feed Back Form</title>
</head>
<body>
<br><br>
	<div class="fnme">
	<form name="feedBackCover" method="post" action="SaveFeedbackServlet">
	
	<h2 class="h2">Feed Back Form</h2>
	<hr>
	
	<div class="lable">Name :<span>*</span>
	<input type="text" name="name" placeholder="Ex-Edwad Ranasinghe" required><br><br>
	</div>
				

	<div class="lable">Email Address :<span>*</span>
	<input type="text" name="mail"  placeholder="Ex-edwad@gmail.com" required><br><br>
	</div>
		
	<div class="lable">How did you find this site? :<span>*</span>
	<select name="selection" required>
	<option name="selection">Select one.</option>
	<option name="selection">From another Website</option>
	<option name="selection">From a Friend</option>
	<option name="selection">From an Email</option>
	<option name="selection">From any Other way</option>
	</select>
	</div>
	<br>
		
	<div class="lable">How did you rate CORAL PROPERTIES?<span>*</span><br>
	
	<label><input type="radio" name="rateValue" value="Excellent">Exellent</label><br>
	<label><input type="radio" name="rateValue" value="VeryGood">VeryGood</label><br>
	<label><input type="radio" name="rateValue" value="Good">Good</label><br>
	<label><input type="radio" name="rateValue" value="Avreage">Average</label><br>
	<label><input type="radio" name="rateValue" value="poor">Poor</label><br>
	
	</div>
	<br>
		
	<div class="lable">Comments or Suggestions:<span>*</span>
	<textarea name="comment" rows="6" cols="40" required></textarea><br><br>
	</div>
	
	<img src="images/robot/robott.gif" alt="Flowers in Chania" align="center">
	<br><br>
	
	<button class="btn submit">SUBMIT</button>
	<button class="btn reset">RESET</button>
	</form>
	
	
	
	
	
	</div>
	<div class="off">
	<h3>Please rate this page:</h3>
	
	<fieldset class="rating">		
		
	<input type="radio" name="stars" id="4_stars" value="4" >
		
	<label class="stars" for="4_stars">4 stars</label>
		
	<input type="radio" name="stars" id="3_stars" value="3" >
		
	<label class="stars" for="3_stars">3 stars</label>
		
	<input type="radio" name="stars" id="2_stars" value="2" >
		
	<label class="stars" for="2_stars">2 stars</label>
		
	<input type="radio" name="stars" id="1_stars" value="1" >
		
	<label class="stars" for="1_stars">1 star</label>
		
	<input type="radio" name="stars" id="0_stars" value="0" required>
		
	<label class="stars" for="0_stars">0 star</label>
		
	<span  class="label"> Rating: </span>
	
	</fieldset><br><br>
	<button class="off"><a href="display.jsp"><b>View Feedbacks</b></a></button>
	</div>
	<br><br>
<footer>
<jsp:include page="/WEB-INF/frame1/footer.jsp"></jsp:include>
</footer>
</body>
</html>