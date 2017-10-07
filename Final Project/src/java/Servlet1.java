
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet1 extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        PrintWriter pw=response.getWriter();
        response.setContentType("text/html");
        int min=Integer.parseInt(request.getParameter("t3"));
        int max=Integer.parseInt(request.getParameter("t4"));
        String t=request.getParameter("t5");  
        float per10=Float.parseFloat(request.getParameter("t6"));
        float per12=Float.parseFloat(request.getParameter("t7"));
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Loaded!!");
           String url="jdbc:mysql://localhost:3306/projectdata";
           Connection con=DriverManager.getConnection(url,"root","A123456");
                  String qr="select * from scholarship where min_age<? AND max_age>? AND caste =? AND percent_10<? AND percent_12<?";
           PreparedStatement ps;
            ps= con.prepareStatement(qr);
           ps.setInt(1,min);
           ps.setInt(2,max);
           ps.setString(3,t);
           ps.setFloat(4,per10);
           ps.setFloat(5,per12);
           ResultSet rs;
            rs = ps.executeQuery();
  
          
           String s1=rs.getString("ss_name");
           
          
       }
       catch(ClassNotFoundException | SQLException e)
       {
    }
       
    }

   


}
