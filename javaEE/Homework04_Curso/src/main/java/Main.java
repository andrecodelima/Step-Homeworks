
import java.util.ArrayList;

import model.DAO;
import model.JavaBeans;

public class Main {

	public static void main(String[] args) {
		
//		Testes (EM FUNCIONAMENTO)
		
		DAO.Cadastrar();
		
		ArrayList<JavaBeans>list = DAO.allAlunos();
		for(JavaBeans aluno : list) {
			
			DAO.exibir(aluno);
		}

	}

}
