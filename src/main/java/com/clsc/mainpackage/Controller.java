package com.clsc.mainpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {

@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
User ud=new User();
ud.storeUserCredentials(req.getParameter("user_ID"),req.getParameter("user_name" ), req.getParameter("user_password"));
resp.getOutputStream().println("User Inserted");
}
}

