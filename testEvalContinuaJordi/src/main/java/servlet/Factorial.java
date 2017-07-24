package servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class Factorial extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      
	     //        Print Name and Surname            
	      

	      out.println(docType +
	 	         "<html>\n" +
	 	            "<head><title>" + "JAVA en Google Cloud" + "</title></head>\n" +
	 	            "<body bgcolor = \"#f0f0f0\">\n" );
	       
		   
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
	              
			           	            
	            "</body> </html>"
	      );
	}
}
