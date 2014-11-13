package com.blinglush.spring;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-25
 * Time: 3:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyApplication {

    EmailService es = new EmailService();

    public void processMessage(String msg, String rec) {
        es.sendEmail(msg,rec);
    }

}
