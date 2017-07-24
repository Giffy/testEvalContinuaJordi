package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class TestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      
	     //        Print Name and Surname            
	      
	      String firstName = req.getParameter("fname");
	      String lastName = req.getParameter("lname");
	      
	      String fullName = firstName + " " + lastName;

	      out.println(docType +
	 	         "<html>\n" +
	 	            "<head><title>" + "JAVA en Google Cloud" + "</title></head>\n" +
	 	            "<body bgcolor = \"#f0f0f0\">\n" +
	 	               "<h1 align = \"center\">" + fullName + "</h1>\n");
	      
	      //        Date and Time        
	      
		  String title = "Display Current Date & Time";
		  Date date = new Date();
	      
	      out.println(docType +
	         
	    		   "<center><h1>" + title + "</h1></center>" +
	               "<h2 align = \"center\">" + date.toString() + "</h2>\n" +
	               
		  //        Foto            
	               
/*	      "<center><img src=ok-fingers-ok-dita.jpg_1097337557.jpg height=150 ><br><br>" );
	       
		   
	      //        Calculo factorial            
	      

	      String num = req.getParameter("fnum");
	      if (num.equals("")) num="0";
		  float a =  Float.valueOf(num);
					
		  int d=1;
		  for (int i=1; i<a+1; i++){
				d= d*i;
		  }
				       
		  out.println(docType +
	       	       
	       "El factorial es " + d + "</center>"+
	               */
			           	            
	            "</body> </html>"
	      );
	}
}
