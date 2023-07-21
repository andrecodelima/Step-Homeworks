package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Carro;

public class Main {

	public static void main(String[] args) {
		 
		 Carro carro = new Carro("Gol",1998,"preto","dc3151");
		    Configuration configuration = new Configuration().configure("file:/C:/Users/lima/eclipse-workspace/Estacionamento_Hibernate_Web/src/resources/hibernate.cfg.xml");

		    SessionFactory sessionFactory = configuration.buildSessionFactory();

		    Session session = sessionFactory.openSession();
		    Transaction transaction = null;

		    try {
		        transaction = session.beginTransaction();
		        session.persist(carro);
		        transaction.commit();
		    } catch (Exception e) {
		        if (transaction != null) {
		            transaction.rollback();
		        }
		        e.printStackTrace();
		    } finally {
		        session.close();
		        sessionFactory.close();
		    }
		}

}
