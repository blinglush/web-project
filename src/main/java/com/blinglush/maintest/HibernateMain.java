package com.blinglush.maintest;

import com.blinglush.model.UsersDo;
import com.blinglush.helper.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-20
 * Time: 3:01 PM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateMain {
    public static void main(String[] args) {
        UsersDo emp = new UsersDo();

        emp.setFirstName("hibmain");
        emp.setCreateDt(new Date());
        emp.setEmail("hibmain@test.com");
        emp.setPassword("hibmain");
        //Get Session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //start transaction
        session.beginTransaction();
        //Save the Model object
        session.save(emp);
        //Commit transaction
        session.getTransaction().commit();
        System.out.println("Employee ID="+emp.getId());

        //terminate session factory, otherwise program won't end
        HibernateUtil.getSessionFactory().close();
    }
}
