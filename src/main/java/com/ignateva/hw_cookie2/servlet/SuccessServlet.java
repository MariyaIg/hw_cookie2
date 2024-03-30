package com.ignateva.hw_cookie2.servlet;

import com.ignateva.hw_cookie2.entity.UserType;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="SuccessServlet", value = "/success-servlet")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/session-servlet").forward(req, resp);
        HttpSession session = req.getSession();
//        session.setAttribute("userType", UserType.USER);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");
        out.println("<h1> Вы успешно зарегистировались</h1>");

        out.println("</body></html>");


        req.getRequestDispatcher("/user.jsp").forward(req,resp);



    }
}
