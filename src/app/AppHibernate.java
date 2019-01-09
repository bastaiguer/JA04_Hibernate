/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.entity.Profesor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author joshu
 */
public class AppHibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SessionFactory sessionFactory;
        Profesor profe;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        
        profe = new Profesor(1,"Eufrasio","Jamau","Gracia");
        
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(profe);
        
        session.getTransaction().commit();
    }
    
}
