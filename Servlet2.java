
import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet2 extends HttpServlet {

 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        PrintWriter pw=response.getWriter();
        response.setContentType("Text/HTML");
      
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver Loaded!!");
           String url="jdbc:mysql://localhost:3306/projectdata";
           Connection con=DriverManager.getConnection(url,"root","A123456");
                  String qr="select * from scholarship where s_area=Pension";
           Statement stmt;
            stmt= con.createStatement();
         
         
         
           ResultSet rs;
            rs = stmt.executeQuery(qr);
  out.println("<html>\n" +
"   <head>\n" +
"   	<h1>Aim to Change</h1>\n" +
"   </head>\n" +
"   <style>\n" +
"   ul {\n" +
"  list-style: none;\n" +
"  padding: 0;\n" +
"  margin: 0;\n" +
"  background: #1bc2a2;\n" +
"}\n" +
"\n" +
"ul li {\n" +
"  display: block;\n" +
"  position: relative;\n" +
"  float: left;\n" +
"  background: #1bc2a2;\n" +
"}\n" +
"\n" +
"li ul { display: none; }\n" +
"\n" +
"ul li a {\n" +
"  display: block;\n" +
"  padding: 1em;\n" +
"  text-decoration: none;\n" +
"  white-space: nowrap;\n" +
"  color: #fff;\n" +
"}\n" +
"\n" +
"ul li a:hover { background: #2c3e50; }\n" +
"\n" +
"\n" +
"li:hover > ul {\n" +
"  display: block;\n" +
"  position: absolute;\n" +
"}\n" +
"\n" +
"li:hover li { float: none; }\n" +
"\n" +
"li:hover a { background: #1bc2a2; }\n" +
"\n" +
"li:hover li a:hover { background: #2c3e50; }\n" +
"\n" +
".main-navigation li ul li { border-top: 0; }\n" +
"\n" +
"\n" +
"ul ul ul {\n" +
"  left: 100%;\n" +
"  top: 0;\n" +
"}\n" +
"\n" +
"\n" +
"ul:before,\n" +
"ul:after {\n" +
"  content: \" \"; /* 1 */\n" +
"  display: table; /* 2 */\n" +
"}\n" +
"\n" +
"ul:after { clear: both; }\n" +
"\n" +
"#mainbody\n" +
"        {\n" +
"         background-color:#85C1E9;\n" +
"         font-size:9px;\n" +
"         height:350px;\n" +
"         width:700px;\n" +
"         font-family:'Century Gothic', 'Lucida Grande', sans-serif;\n" +
"         border:groove;\n" +
"        } \n" +
"\n" +
"</style>\n" +
"   <body>\n" +
"   	<ul class=\"main-navigation\">\n" +
"  <li><a href=\"schemes.html\">Categories</a>\n" +
"    <ul>\n" +
"      <li><a href=\"students.html\">Student</a></li>\n" +
"      <li><a href=\"employee.html\">Employee</a>\n" +
"      </li>\n" +
"      <li><a href=\"senior\">Senior Citizen</a>\n" +
"      </li>\n" +
"    </ul>\n" +
"  </li>\n" +
"    <li><a href=\"schems.html\">Other Schemes</a>\n" +
"    <ul>\n" +
"      <li><a href=\"schemes.html\">Agriculture</a>\n" +
"      <ul>\n" +
"          <li><a href=\"#\">Kisan vikas patra</a></li>\n" +
"          <li><a href=\"Pradhan Mantri Fasal Bima Yojana.html\">PM fasal Bima yojna</a></li>\n" +
"          <li><a href=\"#\">Gaun ki Beti</a>\n" +
"          	 <li><a href=\"#\">Training cum production</a>\n" +
"      </li> <li><a href=\"Pilot Project for Agro Climatic Zones .html\">pilet project for agro climatic zones</a>\n" +
"      </li> <li><a href=\"Ground Water Conservation Scheme in Madhya Pradesh.html\">Ground water conservation</a>\n" +
"      </li> <li><a href=\"Integrated Grain Development Program in Madhya Pradesh.html\">Integrated grain development program</a>\n" +
"      </li> <li><a href=\"Training Scheme for SC and ST Farmers \">Training scheme for scheduled cast </a>\n" +
"      </li> <li><a href=\"Soil Testing Scheme in Madhya Pradesh.html\">Soil testing for scheduled cast</a>\n" +
"      </li>\n" +
"     \n" +
"       </ul>\n" +
"        </li>\n" +
"\n" +
"        <li><a href=\"schemes.html\">Scholarship</a>\n" +
"      <ul>\n" +
"          <li><a href=\"Computer-Based Modern Office Management Training Scheme for Youth.html\">Computer based</a></li>\n" +
"          <li><a href=\"Ekloti Beti Ko Shikha Vikas Chatravarti for Girls in Madhya Pradesh.html\">Ekloti Beti</a></li>\n" +
"          <li><a href=\"Free Bicycle Scheme in Madhya Pradesh.html\">Free bicycle</a>\n" +
"          	 <li><a href=\"Hostel Facility Scheme for Scheduled Tribe Students Pursuing Higher Education in New Delhi.html\">Hostal facility</a>\n" +
"      </li> <li><a href=\"Laptop Distribution Scheme for Meritorious Students.html\">Laptop Distribution</a>\n" +
"      </li> <li><a href=\"Sudama Pre Metric Scholarship Scheme for Students in Madhya Pradesh.html\">Sudama pre matric</a>\n" +
"      </li> <li><a href=\"Swami Vivekananda Post Metric Scholarship Scheme in Madhya Pradesh.html\">Swamivivekanad post matric</a>\n" +
"      </li> <li><a href=\"Vikramaditya Free Education Scheme for Talented Poor Students of General.html\">Vikramaditya free education</a>\n" +
"      </li> <li><a href=\"Scholarship for Foreign Studies to Backward Class Students in Madhya Pradesh.html\">Scholarship for foreign studies</a>\n" +
"      </li>\n" +
"     \n" +
"       </ul>\n" +
"        </li>\n" +
"         \n" +
"         \n" +
"\n" +
"      <li><a href=\"schemes.html\">Development</a>\n" +
"      <ul>\n" +
"      	<li><a href=\"pm mudra yojana.html\">PM mudra yojna</a></li>\n" +
"          <li><a href=\"pm jan dhan yojna.html\">PM jan dhan yojna</a></li>\n" +
"          <li><a href=\"adarsh gram.html\">Sansad adarsh gram yojna</a></li>\n" +
"          <li><a href=\"smartcity.html\">Smart city mission</a> </li>\n" +
"      </ul>\n" +
"       </li>\n" +
"      \n" +
"      <li><a href=\"schemes.html\">Energy</a>\n" +
"      	<ul>\n" +
"      	<li><a href=\"gram sichai.html\">PM gram sichai yojna</a></li>\n" +
"          <li><a href=\"dduky.html\">Deen dayal upadhyay gram jyoti yojna</a></li>\n" +
"          <li><a href=\"biogas.html\">National bio gas</a></li>\n" +
"          <li><a href=\"Led.html\">Prakash path-way to light-the national LED program</a> </li>\n" +
"      </ul>\n" +
"      </li>\n" +
"      <li><a href=\"schemes.html\">Pension</a><ul>\n" +
"      	<li><a href=\"orop.html\">One rank one pension</a></li>\n" +
"          <li><a href=\"atalpension.html\">Atal Pension Scheme</a></li>\n" +
"          <li><a href=\"rani lakshmi.html\">Rani Laxmi Bai Pension scheme</a></li>\n" +
"          <li><a href=\"indragandhi.html\">Indragandhi national old age pension</a> </li>\n" +
"      </ul>\n" +
"      </li>\n" +
"      <li><a href=\"schemes.html\">Health</a><ul>\n" +
"      	<li><a href=\"pm jeevanjyoti yojna.html\">Pradhan Mantri Jeevan Jyoti Bima Yojana</a></li>\n" +
"          <li><a href=\"pm surksha bima yojna.html\">Pradhan Mantri Suraksha Bima Yojana (PMSBY)</a></li>\n" +
"          <li><a href=\"jan aushadhi.html\">Pradhan Mantri Jan Aushadhi Yojana (PMJAY)</a></li>\n" +
"          <li><a href=\"indradhanus.html\">Mission Indradhanush</a> </li>\n" +
"           <li><a href=\"soilhealth.html\">Soil Health Card Scheme</a> </li>\n" +
"      </ul>\n" +
"\n" +
"     \n" +
"      <li><a href=\"schemes.html\">Housing</a><ul>\n" +
"      	<li><a href=\"pm awas yojna.html\">PM awas yojna</a></li>\n" +
"          <li><a href=\"garib kalyan.html\">PM garib kalyan yojna</a></li>\n" +
"          <li><a href=\"ujjwala.html\">PM ujjwala yojna</a></li>\n" +
"          <li><a href=\"swadesh.html\">Swadesh darshan yojna</a> </li>\n" +
"      </ul>\n" +
"      </li>\n" +
"    </ul>\n" +
"  </li>\n" +
"  <li><a href=\"index.html\">Back to home</a></li>\n" +
"</ul>\n" +
"\n" +
" <div>\n" +
" <br>\n" +
"</div>\n" +
" <h2><b><i>Government Schemes:-</i></b></h2>\n" +
"<img src=\"sy1.jpg\" alt=\"r\" width=\"600\" height=\"350\" align=\"right\">\n" +
" <div id=\"mainbody\">\n" +
"		<font size=\"4\"><br>\n" +
"Available Schemes:" );
while(rs.next())

System.out.println(rs.getString(1));

           out.println(
"</font>\n" +
"		</div>\n" +
"   </body>\n" +
"</html>");
          
      
          
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
