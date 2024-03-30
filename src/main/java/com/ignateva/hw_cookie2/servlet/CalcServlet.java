package com.ignateva.hw_cookie2.servlet;

import com.ignateva.hw_cookie2.FileManager;
import com.ignateva.hw_cookie2.TextOperations;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CalcServlet", value = "/calc-servlet")
public class CalcServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/user.jsp").forward(req, resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        FileManager fileManager=new FileManager();
        File file = new File(req.getParameter("filepath"));
        String text= fileManager.ReadFile(file).toString();
        TextOperations textOperations= new TextOperations();
        textOperations.findQuestions(text);
        List<String> questions = new ArrayList<>(textOperations.findQuestions(text));

        String message = "";

       for (int i = 0; i < questions.size(); i++) {
            message += questions.get(i);
        }
       String res = message.replace(" ", "_");
       String q= res.replace(",","_");
       Cookie cookie= new Cookie("message", q);
       resp.addCookie(cookie);
        cookie.setMaxAge(30*30);
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><body>");

        out.println("<h1> вопросительные предложения: " + questions +"</h1>");
        out.println("<h1> текст: " + text +"</h1>");
       out.println("<a href=\"cookie.jsp\"> messages from cookie</a>");

        out.println("</body></html>");


    }
}
