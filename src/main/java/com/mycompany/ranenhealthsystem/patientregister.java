
package com.mycompany.ranenhealthsystem;

import com.mycompany.ranenhealthsystem.data.DatabaseConnection;
import com.mycompany.ranenhealthsystem.service.RegisterService;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class patientregister extends HttpServlet {
    String query;
Connection conn;
Statement stmt;
ResultSet res;
DatabaseConnection dbconn;


   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                        dbconn=new DatabaseConnection();
   
         String tarehe = request.getParameter("tarehe");
         String opdno = request.getParameter("opdno");
         String fname = request.getParameter("fname");
         String mname = request.getParameter("mname");
         String lname = request.getParameter("lname");
         String Age = request.getParameter("Age");
         String MobileNo = request.getParameter("MobileNo");
         String SubLocation = request.getParameter("SubLocation");    
         String Location = request.getParameter("Location");
         String Address = request.getParameter("address");
         String Sex = request.getParameter("Sex");
         
         /*String strQuery="SELECT COUNT(*) FROM patientinformation where opdno = '"+opdno+"'";
         
         Result rs = st.executeQuery(strQuery);
         rs.next();
         String Countrow = rs.getString(1);
         out.println(Countrow);
         
         if(Countrow.equals("0")){
             int i= st.exexcuteUpdate("insert into rhc.patientinformation(OpdNo,Date,FirstName,MiddleName,LastName,Age,MobileNo,SubLocation,Location,Address,Sex");
         }*/
         
         
           System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAA"+opdno+tarehe+fname+mname+lname+Age+MobileNo+SubLocation+Location+Address+Sex);
conn=dbconn.setConnection();

 System.out.println("OOOOO"+conn);
stmt=conn.createStatement();
query= "insert into rhc.patientinformation(OpdNo,Date,FirstName,MiddleName,LastName,Age,MobileNo,SubLocation,Location,Address,Sex)"+" values('"+opdno+"','"+tarehe+"','"+fname+"','"+mname+"','"+lname+"','"+Age+"','"+MobileNo+"','"+SubLocation+"','"+Location+"','"+Address+"','"+Sex+"')";
int i=stmt.executeUpdate(query);
 if (i!=0){
 out.println("<script type=\"text/javascript\">");
 out.println("alert ('New Patient Added Succesfully');");
 out.println("location='medical_information.jsp';");
 out.println("</script>");
 //out.println("<html><body><b>Successfully Inserted" + "</b></body></html>"); 
 }
 
 else
 {
 out.println("<script type=\"text/javascript\">");
 out.println("alert ('Please Correct Errors and try again');");
 out.println("location=home.jsp';");
 out.println("</script>");
 }   
conn.close();
}  
                catch (Exception ex){
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<"+ex.getMessage());
                    Logger.getLogger(RegisterService.class.getName()).log(Level.SEVERE, null, ex);
                
                
//RequestDispatcher rd= request.getRequestDispatcher("/error.jsp");
//rd.forward(request, response);
}finally {
//RequestDispatcher rd= request.getRequestDispatcher("index.jsp");
// rd.forward(request, response);
out.close();
}
}
    

            
        
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
