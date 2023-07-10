package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import model.Cliente;

public class Main {

	public static void main(String[] args) {
			
			Cliente c = new Cliente("Carolina", "121.121.121.12", "1988-12-02", "21-9999-2222");
			SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Session session = sessionFactory.openSession();
			session.beginTransaction();
			session.save(c);
			session.close();
			
			System.out.println("Executado com sucesso");
			

		
		
	}

}
