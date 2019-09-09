

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>patient_registration</title>
        
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript">
            function validate(){
                var x=document.getElementById('textfield');
                if(document.getElementById("opdno").value=="" & document.getElementById("fname").value=""){
                    alert("all fields are empty");
                    return false;
                }else{
                    alert("add the empty fields");
                    {
                   return true;
                }

            }
            </script>
</head>
<body>
	        <h1>Ranen Health Management System</h1><hr><hr>
	        <h2>Personal Information</h2>
                                       
    <div class="register">
              <form action="patientregister" id="register" method="POST">
              	

              	<label>OPD NO:</label><br>
                <input type="number" name="opdno" id="num" placeholder="Enter Your OPD NO"><br><br>
                
                <label>Date:</label><br>
                <input type="text" name="tarehe" id="num" placeholder="Enter The Date"><br><br>

                <label>First Name:</label><br>
                <input type="text" name="fname" id="name" placeholder="Enter Your First Name"><br><br>
                
                <label>Middle Names:</label><br>
                <input type="text" name="mname" id="name" placeholder="Enter Your Middle Name"><br><br>

                 <label>Last Names:</label><br>
                <input type="text" name="lname" id="name" placeholder="Enter Your Last Name"><br><br>

                 <label>Age:</label><br>
                <input type="text" name="Age" id="num" placeholder="Enter Your Age"><br><br>
                
                <label>Mobile Number</label>
                <select id="MobileNo">
                	<option>+254</option>
                	<option>+255</option>
                	<option>+256</option>
                	<option>+257</option>
                	<option>+258</option>
                </select>
                <input type="text" name="MobileNo" id="num" placeholder="Enter You phone_number"><br><br>
                
                <label>Sub Location:</label><br>
                <input type="text" name="SubLocation" id="name" placeholder="Enter Your Location"><br><br>

                <label>Location:</label><br>
                <input type="text" name="Location" id="name" placeholder="Enter Your Location"><br><br>

                <label>Address:</label><br>
                <input type="text" name="address" id="name" placeholder="Enter Your Address"><br><br>
    
                <label>Sex:</label><br>
                <label>Male</label><input type="radio" name="Sex" value="male" checked="Male">
                  <label>Female</label><input type="radio" name="Sex" value="female" checked="Female">
                 <label>Others</label><input type="radio" name="Sex" value="others" checked="Others">
                   <br><hr><hr><br>

    
                       <input type="submit"  id="sub"  value="submit"><br><br><br>
                       <a href="home.jsp">Home</a>

                   </form>
         
               </div>
           </body>
           </html>
             
             
