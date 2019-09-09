<%-- 
    Document   : PatientCheck
    Created on : Jun 13, 2019, 3:09:14 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>home page</title>
        
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <style type="text/css">
		body{ 
			margin: 0;
			background-color: #eee; 

		}
		h1{
			background-color: #2e87d4;
			color:#fff;
			text-align: center;
			padding: 20px;

		}
		div{
			margin: 200px auto;
			background-color: #fff;
			text-align: center;
			border: 1px solid #c3c3c3;

		}
		a{
			padding: 20px;
			margin: 20px;
			border-radius: 3px;
			background-color: #66c35a;
			text-decoration: none;
			display: inline-block;
			color: #fff;
		}
		a:hover{
			background-color: #ce4cba;
			transition: all 0.3s;

		}
	</style>
</head>
<body>
<h1>RANEN HEALTH MANAGEMENT SYSTEM</h1>
<div>
	<a href="patient_registration.jsp">New Patient</a>
	<a href="">Regular Patient</a>
        <a href="medical_information.jsp">Vitals</a><a href="index.jsp">Home Page</a>
        


</div>
</body>
</html>

