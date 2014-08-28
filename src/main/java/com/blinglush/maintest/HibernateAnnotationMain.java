package com.blinglush.maintest;

import com.blinglush.model.UsersDo;
import com.blinglush.helper.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-20
 * Time: 3:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateAnnotationMain {

    public static void main(String[] args) {

        UsersDo emp = new UsersDo();

        emp.setFirstName("Dulki");
        emp.setCreateDt(new Date());
        emp.setEmail("dulki.shrestha@gmail.com");
        emp.setPassword("dulki");

        //Get Session
        SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
        Session session = sessionFactory.getCurrentSession();
        //start transaction
        session.beginTransaction();
        //Save the Model object
        session.save(emp);
        //Commit transaction
        session.getTransaction().commit();
        System.out.println("Employee ID="+emp.getId());

        //terminate session factory, otherwise program won't end
        sessionFactory.close();

    }


}
