package com.blinglush.controller;

import com.blinglush.model.UserDo;
import com.google.gson.Gson;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * UserDo: shrestar
 * Date: 2014-08-11
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class CreateUserServlet extends HttpServlet {

    private static List<UserDo> userList = new ArrayList<UserDo>();

//    static final Logger logger = Logger.getLogger(CreateUserServlet.class);

    static{
        userList.add(new UserDo("ritesh", "password"));
        userList.add(new UserDo("dulki", "bhuntuli"));
        System.out.println("init called: " +userList.size());
    }

    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        User user = new User(req.getParameter("username"),req.getParameter("password"));
        req.getParameter("username");
        req.getParameter("password");
        req.getParameter("firstname");
        req.getParameter("lastname");
        req.getParameter("email");

//        System.out.println("username: "+user.getUserName()+" password: "+user.getPassWord());

        String contentType = req.getContentType();
        System.out.println("content type: " + contentType);

        req.setAttribute("users", userList);
        req.getRequestDispatcher("/ftl/user.ftl").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String country= req.getParameter("countryname");
        String st = "nepal";

        Map<String, String> mp = new HashMap<String, String>();

        mp.put("1", "Kathmandu");
        mp.put("2", "Dharan");
        mp.put("3", "Birgunj");

        Map<String, String> ct = new HashMap<String, String>();
        ct.put("1", "Washington");
        ct.put("2", "Texas");
        ct.put("3", "New York");

        String json = null;
        if (st.equalsIgnoreCase("nepal")) {
            json = new Gson().toJson(mp);
        }
        if (country.equalsIgnoreCase("us")) {
            json = new Gson().toJson(ct);
        }

        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(json);

    }


}
