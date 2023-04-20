

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Pessoa.Pessoa;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		 
		PrintWriter write = response.getWriter();
		ArrayList<Pessoa>lista = new ArrayList<Pessoa>();
		lista.add(new Pessoa("Jessica", "Feminino", 1.43, 47));
		lista.add(new Pessoa("Joaquin", "Masculino", 1.78, 90));
		lista.add(new Pessoa("Carla", "Feminino", 1.50, 81));
		lista.add(new Pessoa("Mario", "Masculino", 1.91, 62));

		String cards = "";
		
		for(Pessoa p: lista){
			
			String classe = p.getGenero().equalsIgnoreCase("masculino")? "preto" : "cinza";
											
			cards += "<div class='" + classe + "'>" +
					
					"Nome: " 		  + p.getNome() +		"</br>"	+
					"IMC:  "		  + p.imc()	    +		"</br>"	+
					
					"</div>";
				 
					
		}
		
		
		write.println("<html>");
		
		write.println("<header>");
		write.println("<title> Aula03 </title>");
		
		write.println("<style>"
				+ ".cinza{background-color:gray;}" 
				+ ".preto{background-color:black;color:white;}"
				+ " </style>");


		write.println("</header>");
		
		write.println("<body>");

		write.println("<h1> Aula03 - Exercício </h1>");
		write.println();

		write.println(cards);

		write.println("</body>");
		
		write.println("</html>");
	}

 


}


