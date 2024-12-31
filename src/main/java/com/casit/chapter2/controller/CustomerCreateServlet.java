package com.casit.chapter2.controller;

import com.casit.chapter2.model.Customer;
import com.casit.chapter2.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by 'A flying pig' 2024/12/27 17:06
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {
    private CustomerService customerService;
    @Override
    public void init() throws ServletException {
        //避免创建多个实例
        this.customerService = new CustomerService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      super.doGet(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
