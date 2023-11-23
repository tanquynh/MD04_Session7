package com.example.ss7;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListCustomer", value = "/customer")
public class ListCustomer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1,"John","London", "https://upload.wikimedia.org/wikipedia/commons/8/85/John_Lennon_1969_%28cropped%29.jpg"));
        customers.add(new Customer(2,"John","London", "https://upload.wikimedia.org/wikipedia/commons/8/85/John_Lennon_1969_%28cropped%29.jpg"));
        customers.add(new Customer(3,"John","London", "https://upload.wikimedia.org/wikipedia/commons/8/85/John_Lennon_1969_%28cropped%29.jpg"));
        customers.add(new Customer(4,"John","London", "https://upload.wikimedia.org/wikipedia/commons/8/85/John_Lennon_1969_%28cropped%29.jpg"));
        req.setAttribute("lCustomer", customers);
        req.getRequestDispatcher("show-customer.jsp").forward(req,resp);
    }
}
