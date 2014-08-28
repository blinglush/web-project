package com.blinglush.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-16
 * Time: 5:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class SessionCookiesEgServlet extends HttpServlet {

    private static final String  LOGIN_USER = "ritesh";
    private static final String PASSWORD = "dulki";

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String pwd = req.getParameter("password");

        PrintWriter out = resp.getWriter();

        if (username.equals(LOGIN_USER) && pwd.equals(PASSWORD)) {
            HttpSession session = req.getSession();
            session.setAttribute("dulkiSession", "bhuntuli");
            session.setMaxInactiveInterval(30* 2);

            Cookie loginCookie = new Cookie("user", username);
            req.setAttribute("user",username);
            loginCookie.setMaxAge(30 * 10);

            resp.setContentType("text/html");
            resp.addCookie(loginCookie);

//            out.println("Successful loggedin");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/ftl/loginsuccess.ftl");
            rd.forward(req, resp);

        } else {
            out.println("Password failed");
        }



    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
