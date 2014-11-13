package com.blinglush.controller;

import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * UserDo: shrestar
 * Date: 2014-08-11
 * Time: 8:49 AM
 * To change this template use File | Settings | File Templates.
 */
public class FileUploadServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Hello <br/>");
        boolean isMultipartContent = ServletFileUpload.isMultipartContent(req);

        if (!isMultipartContent) {
            out.println("you are not trying to upload<br/>");
            return;
        }





        out.flush();
        out.close();
    }
}
