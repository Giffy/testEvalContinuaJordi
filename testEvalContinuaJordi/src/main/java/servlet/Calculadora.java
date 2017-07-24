package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





@SuppressWarnings("serial")
public class Calculadora extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
	      response.setContentType("text/html");
	 
	      PrintWriter out = response.getWriter();
	      
	      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	      
	      
	     // assign values to variables            
	      
	      String valor1 = req.getParameter("v1");
	      String valor2 = req.getParameter("v2");
	      String operacion = req.getParameter("o1");
	      
	      String resultado = null;
	      
	      if (valor1=="")  valor1="0";
	      if (valor2=="")  valor2="0";
	      
	      float var1= Float.valueOf(valor1);
		  float var2= Float.valueOf(valor2);
	      
	      
	      if( operacion.equals("add")){
				// Suma
				float suma = ( var1 + var2);
				resultado = "La suma de " + var1 + " y " + var2 + " es " + suma;
			
			}else if(operacion.equals("sub")){
				// Resta
				float resta = ( var1 - var2);					
				resultado = "La resta de " + var1 + " y " + var2 + " es " + resta ;

			}else if(operacion.equals("mul")){
				// Multiplicación
				float multiplica = ( var1 * var2);					
				resultado = "La multiplicación de " + var1 + " y " + var2 + " es " + multiplica ;
			
			}else if(operacion.equals("div")){
				// División
				if(valor2.equals("0")){
					resultado = "Division entre 0, el resultado tiende a infinito";
				}else{		
					float division = ( var1 / var2);					
					
					resultado = "La division de " + var1 + " y "  + var2 + " es "+ division ;
				}
				
			}
				
		
	      out.println(docType +
	 	         "<html>\n" +
	 	            "<head><title>" + "Calculadora en JAVA subida a Google Cloud" + "</title></head>\n" +
	 	            "<body bgcolor = \"#f0f0f0\">\n" +
	 	               "<h1 align = \"center\">" + resultado + "</h1>\n"+
	 	            "</body> </html>"
	 	  );
	}
}
