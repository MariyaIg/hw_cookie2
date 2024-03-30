package com.ignateva.hw_cookie2.servlet;

import com.ignateva.hw_cookie2.entity.UserType;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Time;

@WebServlet(name="SessionServlet", value = "/session-servlet")
public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req, resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            HttpSession session = req.getSession();


            if (session.getAttribute("e_mail") == null) {
                session.setAttribute("e_mail", req.getParameter("e_mail"));

            }
            if (session.getAttribute("pass") == null) {
                session.setAttribute("pass", req.getParameter("pass"));

            }

            Time enterTime = new Time(session.getCreationTime());
            Time lastTime= new Time(session.getLastAccessedTime());

            session.setAttribute("enterTime",enterTime);
            session.setAttribute("lastTime",lastTime);
             session.setAttribute("userType", UserType.USER);

            req.getRequestDispatcher("/success-servlet").forward(req,resp);

        }


}
