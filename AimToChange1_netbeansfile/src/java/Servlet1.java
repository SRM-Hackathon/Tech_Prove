
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Servlet1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw=response.getWriter();
        response.setContentType("Text");
        String t=request.getParameter("t1");   
       try
       {
           Class.forName("com.mysql.jdbc.driver");
           System.out.println("Driver Loaded!!");
           String url="jdbc:mysql://localhost:3306/ProjectData";
           Connection con=DriverManager.getConnection(url,"root","A123456");
           String qr="select * from scholarship where min_age<? AND max_age>? AND caste =? AND percent_10<? AND percent_12<?";
           PreparedStatement ps=con.preparedStatement(qr);
           ps.setInt(1,Integer.parseInt("t3"));
           ps.setInt(2,Integer.parseInt("t4"));
           ps.setString(3,"t5");
           ps.setFloat(4,Float.parseFloat("t6"));
           ps.setFloat(5,Float.parseFloat("t7"));
           ResultSet rs = ps.executeQuary(qr);
  
          
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
    
       