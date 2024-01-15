package controller;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();
	
	public static SessionFactory buildSessionFactory() {
		
		try {
			return new Configuration().configure().buildSessionFactory(
					new StandardServiceRegistryBuilder().configure().build());
			
		}catch(Throwable ex) {
			System.out.println(ex);
		}
		return null;
	}
	public static org.hibernate.SessionFactory getSessionFactory(){
		return sessionFactory;
	}

}
