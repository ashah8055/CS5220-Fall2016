<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>
	<div class="row" >
		<div class="col-sm-3"	>
			<table border="2"  >
				<tr>
				<th rowspan="2"><u>Admin Panel</u>
				
				</tr>
				<tr>
				<th><br><br>
				</tr>
				
				<tr>
					<th><a href="AdminHome">Home</a>
				</tr>
				<tr>
					<th><a href="AdminOverview" >Overview</a>
				</tr>
				<tr>
					<th><a href="AdminRateCategory" >Rate Category</a>
				</tr>
				
				<tr>
					<th><a href="AdminManageReservation">Manage<br>Reservation</a>
				</tr>
				<tr>
					<th><a href="AdminReports">Reports</a>
				</tr>
				<tr>
					<th><a href="AdminFeedbackManagement">Feedback<br>Management</a>
				</tr>
				<tr>
					<th><a href="AdminContentManagement">Content<br>Management</a>
				</tr>
			</table>
		</div>
		<div class="col-sm-7">
		<h4>Manage Reservation</h4><br><hr>
		<form action="">
		<table>
		<tr>
		
		<td><a href="ReservationDetail">Add Reservation</a>
		</tr>
		<tr>
		<td>Confirmation Number :
		<td><input type="text" name="txtconfirmnumber">
		</tr>
		<tr>
		<td><input type="submit" value="cancel Reservation">
		</td>
		</tr>
		</table>
				</form>
		</div>
	</div>


</body>
</html>