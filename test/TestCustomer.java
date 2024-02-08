package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import src.model.Customer;

public class TestCustomer {

    Customer customer;
    @Before
    public void setup(){
        customer = new Customer("john","doe", "Malta", 22);
    }

    @After
    public void teardown(){
        customer = null;
    }

    @Test
    public  void gettersTest(){
        Assertions.assertEquals("john", customer.getName());
        Assertions.assertEquals("doe", customer.getSurname());
        Assertions.assertEquals("Malta", customer.getCountry());
        Assertions.assertEquals(22, customer.getAge());
    }

    @Test
    public void settersTest(){
        customer.setName("Mark");
        customer.setSurname("Vella");
        customer.setCountry("Spain");
        customer.setAge(20);
        Assertions.assertEquals("Mark", customer.getName());
        Assertions.assertEquals("Vella", customer.getSurname());
        Assertions.assertEquals("Spain", customer.getCountry());
        Assertions.assertEquals(20, customer.getAge());
    }

    @Test
    public void displayInfoTest(){
        String aux = customer.getId();
        Assertions.assertEquals("Name: john, Surname: doe, Country: Malta, " +
                "Age: 22, Id: " +  aux, customer.toString());
    }

    @Test (expected = IllegalArgumentException.class)
    public void badCustomerName(){
        Customer cust = new Customer("","Due","Malta",20);

    }
}
