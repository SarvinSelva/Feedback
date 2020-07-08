<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
 h3{
    border:1px solid grey;
    margin:5px;margin-bottom:15px;padding:8px;
    background-color:white;
    color:white;background-color:#444;margin-bottom:5px;
}
</style>
<body>
<center>
<h3>Welcome to Feedback Portal</h3>
</center>
<br><br>
<div class="s">
<form method = "post" action= "/feedback">
	<b>EmployeeName:</b> <input type = "text" name = "empname" placeholder="Enter your name"> <br>
	<br>
	<b>Email:</b> <input type = "email" name = "email" placeholder="Enter your email"> <br>
	<br>
	<b>Organization: </b>  <input type = "comp" name = "comp" placeholder="Enter your company"> <br>
	<br>
	<b>Country:</b>  <input type = "country" name = "country" placeholder="Enter your country"> <br>
	<br>
	<b>Comments:</b>  <input type = "comments" name = "comments" placeholder="Enter your comments" style="width:400px; height:100px;"> <br>
	<br>
	<center><input type = "submit" value = "Submit"> </center>

</form>
</body>
</html>