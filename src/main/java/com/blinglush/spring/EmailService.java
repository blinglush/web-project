package com.blinglush.spring;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-25
 * Time: 2:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmailService {

    public void sendEmail(String message, String receiver) {

        System.out.println("Email sent to " + receiver + " with Message " + message);
    }
}
