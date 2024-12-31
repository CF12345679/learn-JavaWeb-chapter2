package com.casit.chapter2.test;

import com.casit.chapter2.helper.DatabaseHelper;
import com.casit.chapter2.model.Customer;
import com.casit.chapter2.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 'A flying pig' 2024/12/27 17:46
 * 单元测试
 */
public class CustomerServiceTest {
    private final CustomerService customerService;

    public CustomerServiceTest() {
        this.customerService = new CustomerService();
    }

    @Before
    public void init() throws IOException {
        DatabaseHelper.executeSQLFile("mysql/customer_init.sql");
    }
    @Test
    public void getCustomerListTest(){
        List<Customer> customerList = customerService.getCustomerList();
        Assert.assertEquals(3,customerList.size());
    }

    @Test
    public void getCustomerTest(){
        Customer customer = customerService.getCustomer(1);
        Assert.assertNotNull(customer);
    }

    @Test
    public void creatCustomerTest(){
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("name", "customer100");
        fieldMap.put("contact", "John");
        fieldMap.put("telephone", "13546895678");
        fieldMap.put("email", "John@163.com");
        boolean result = customerService.createCustomer(fieldMap);
        Assert.assertTrue(result);
    }
    @Test
    public void updateCustomerTest(){
        Map<String, Object> fieldMap = new HashMap<>();
        fieldMap.put("contact", "Eric");
        boolean result = customerService.updateCustomer(1,fieldMap);
        Assert.assertTrue(result);
    }

    @Test
    public void deleteCustomerTest(){
        boolean result = customerService.deleteCustomer(3);
        Assert.assertTrue(result);
    }
}
