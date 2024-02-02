package test;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestCustomer {

    @BeforeEach
    public void setup(){
        customer = new customer("john","doe", "Malta", 22);
    }

    @AfterEach
    public void teardown(){
        customer = null;
    }

    @Test
    public static void gettersTest(){
        Assertions.assertEquals("john", customer.getName());
        Assertions.assertEquals("doe", customer.getSurname());
        Assertions.assertEquals("Malta", customer.getCountry());
        Assertions.assertEquals(22, customer.getAge());
    }

    @Test
    public static void settersTest(){
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
    public static void displayInfoTest(){
        String aux = customer.getId();
        Assertions.assertEquals("Name: john, Surname: doe, Country:Malta, " +
                "Age: 22, Id: " +  aux,customer.displayInfo() );
    }
}
