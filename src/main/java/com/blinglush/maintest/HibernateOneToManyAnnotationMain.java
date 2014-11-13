package com.blinglush.maintest;

import com.blinglush.helper.HibernateUtil;
import com.blinglush.model.Cart;
import com.blinglush.model.Items;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-20
 * Time: 9:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class HibernateOneToManyAnnotationMain {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.setName("MyCart1");

        Items item1 = new Items("I10", 10, 1, cart);
        Items item2 = new Items("I20", 20, 2, cart);
        Set<Items> itemsSet = new HashSet<Items>();
        itemsSet.add(item1); itemsSet.add(item2);

        cart.setItems1(itemsSet);
        cart.setTotal(10*1 + 20*2);

        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction tx = null;
        try{
            //Get Session
            sessionFactory = HibernateUtil.getSessionAnnotationFactory();
            session = sessionFactory.getCurrentSession();


            System.out.println("Session created");
            //start transaction
            tx = session.beginTransaction();
            //Save the Model object
            session.save(cart);
            session.save(item1);
            session.save(item2);
            //Commit transaction
            tx.commit();
            System.out.println("Cart1 ID="+cart.getId());
            System.out.println("item1 ID="+item1.getId()+", Foreign Key Cart ID="+item1.getCart1().getId());
            System.out.println("item2 ID="+item2.getId()+", Foreign Key Cart ID="+item1.getCart1().getId());

        }catch(Exception e){
            System.out.println("Exception occured. "+e.getMessage());
            e.printStackTrace();
        }finally{
            if(!sessionFactory.isClosed()){
                System.out.println("Closing SessionFactory");
                sessionFactory.close();
            }
        }
    }

}
