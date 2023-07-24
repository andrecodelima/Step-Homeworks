package main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AppEngine")
public class AppEngine extends HttpServlet {       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException {
		
		response.setContentType("text/plain");
		response.getWriter().println("Hello App Engine Test! ");
	}
	
	//Coletando as informações do SO
	public static String getInfoSystem() {
		
		//Pegando a data e hora atual
		long millis = System.currentTimeMillis();
		Date date   = new Date(millis);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateFormated = dateFormat.format(date);
		
		//System.getProperty recupera as informações do SO.
		String texto = "<div class='box-msg'>"
							+ "Java Version: " + System.getProperty("java.version") 	+ "<br>"
							+ " OS: " 	 	   + System.getProperty("os.name")		    + "<br>"
							+ " User: "	 	   + System.getProperty("user.name")		+ "<br>"
							+ " Data: "		   + dateFormated							+
						
					  "</div>";	
					
		return texto;	 

				}
				
		
	}

 

