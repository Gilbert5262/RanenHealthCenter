<%-- 
    Document   : medical_information
    Created on : Jun 19, 2019, 1:12:06 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>medical_information page</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
	<script type="text/javascript">
		function active(){
			var searchBar = document.getElementById('searchBar');
			if (searchBar.value == 'OPD NO...') {
				searchBar.value = ''
				searchBar.placeholder = 'OPD NO...'
			}
		}
		function inactive(){
			var searchBar = document.getElementById('searchBar');
			if (searchBar.value == '') {
				searchBar.value = 'OPD NO...'
				searchBar.placeholder = ''
			}
		}
	</script>
		
    </head>
    <body>
        
        <h1>Medical Information</h1><br><br>
       <div class="register">
              <form action="Medical" id="register" method="POST">
              	<input type="text" id="searchBar" placeholder="OPDNO" value="OPD NO..." maxlength="25" autocomplete="off" onmousedown="active()" onblur="inactive()" /><input type="submit" id="searchbtn" value="Go!" /><br><br><br>

              
                       <a href="home.jsp">Home</a>
              </form>
       </div>
    </body>
</html>
