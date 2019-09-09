<%-- 
    Document   : index
    Created on : Jun 4, 2019, 2:05:37 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">
        <style>
            td {
                padding: 10px;
            }
            
            div{
                width: 50%;
                border: 1px solid black;
                border: radius 5px;
                background-color: lightskyblue;
            }
        </style>
    </head>
    <body>
        <h1><center>RANEN HEALTH MANAGEMENT SYSTEM<i></i></center></h1>
        
        
        <h4><i><center><u>(Enter Your login Details Below)</u></center></i></h4>
    <center>
        <div>
            <form action="login" method="POST">
            <table>
                <tr>
                    <td>User name:</td>
                    <td><input type="text" class="form-control" name = "usern" placeholder="username"</td>
                </tr>
                
                <tr>
                    <td>Password:</td>
                    <td><input type="password" class="form-control" name="pass" placeholder="password"</td>
                </tr>
                <tr>
                    <td>User Level:</td>
                    <td><select name="userlevel">
                            <option>Customer_Care</option>
                            <option>Clinician</option>
                            <option>Lab_Tech</option>
                            <option>Pharmacist</option>
                            <option>Accountant</option>
                            <option>Nursing</option>
                            <option>Administrator</option>
                        </select></td>
                </tr>
                <tr>
                    <td colspan="4" style="text-align: center; width: 70px"> <input type="submit" class="btn btn-success" value="Submit"</td>
                </tr>
            </table> 
                </form>
        </div>
        
    </center>
    
    </body>
</html>

