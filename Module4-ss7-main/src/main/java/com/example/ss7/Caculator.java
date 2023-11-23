package com.example.ss7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "/", value = "/cacu")
public class Caculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double a = Double.parseDouble(req.getParameter("a"));
        double b = Double.parseDouble(req.getParameter("b"));
        String calculation = req.getParameter("select");
        switch (calculation) {
            case "addition":
                req.setAttribute("value", (a+b));
                req.getRequestDispatcher("show-value.jsp").forward(req,resp);
                return;
            case "subtraction":
                req.setAttribute("value", (a-b));
                req.getRequestDispatcher("show-value.jsp").forward(req,resp);
                return;
            case "multiplication":
                req.setAttribute("value", (a*b));
                req.getRequestDispatcher("show-value.jsp").forward(req,resp);
                return;
            case "division":
                req.setAttribute("value", (a/b));
                req.getRequestDispatcher("show-value.jsp").forward(req,resp);
                return;
        }
    }
}
