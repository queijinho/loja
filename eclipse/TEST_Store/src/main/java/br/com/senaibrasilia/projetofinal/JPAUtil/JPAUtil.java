package br.com.senaibrasilia.projetofinal.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	//método para salvar
	private static EntityManagerFactory factory = null;
	
	static {
		if (factory == null) {
			factory = Persistence
					.createEntityManagerFactory("loja");
		}		
	}
	 
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();		
	}

}
