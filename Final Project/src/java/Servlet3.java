
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet3 extends HttpServlet {

 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        response.setContentType("Text/HTML");

        String t=request.getParameter("t8");  

       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Loaded!!");
           String url="jdbc:mysql://localhost:3306/projectdata";
           Connection con=DriverManager.getConnection(url,"root","A123456");
                  String qr="select * from schemes where s_area=?";
           PreparedStatement ps;
            ps= con.prepareStatement(qr);
         
           ps.setString(3,t);
        
           ResultSet rs;
            rs = ps.executeQuery();
  
          
           String s1=rs.getString("ss_name");
          
       }
       catch(ClassNotFoundException e)
       {
        e.printStackTrace();   
    }    
       catch(SQLException e)
       {
        e.printStackTrace();
       }
       
    }

   
 

}
