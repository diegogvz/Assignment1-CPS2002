package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import src.model.*;

public class TestBusiness {

    Business b;

    @Before
    public void setUp(){
        b = new Business();
    }
    @After
    public void teardowm(){
        b = null;
    }

    @Test
    public void emptyBusinessTest(){

        Assertions.assertTrue(b.getAdvertList().isEmpty());
        Assertions.assertTrue(b.getCustomerList().isEmpty());
        Assertions.assertTrue(b.getReservations().isEmpty());
    }

    @Test
    public void addAdvertTest(){
        Advert a = new BusAdvert("bus");
        b.addAdvert(a);
        Assertions.assertFalse(b.getAdvertList().isEmpty());
        Assertions.assertTrue(b.getAdvertList().contains(a));
    }

    @Test
    public void removeAdvertTest(){
        Advert a = new BusAdvert("bus");
        b.addAdvert(a);
        Assertions.assertFalse(b.getAdvertList().isEmpty());
        Assertions.assertTrue(b.getAdvertList().contains(a));
        b.removeAdvert(0);
        Assertions.assertTrue(b.getAdvertList().isEmpty());
        Assertions.assertFalse(b.getAdvertList().contains(a));

    }
    @Test
    public void addCustomerTest(){
        Customer c = new Customer("Diego","Garcia","Spain",21);
        b.addCustomer(c);
        Assertions.assertFalse(b.getCustomerList().isEmpty());
        Assertions.assertTrue(b.getCustomerList().contains(c));
    }

    @Test
    public void buyAdvertTest(){
        Customer c = new Customer("Diego","Garcia","Spain",21);
        Advert a = new BusAdvert("bus");
        b.buyAd(1,1,2024,
                31,12,2024,
                c,a);
        Assertions.assertFalse(b.getReservations().isEmpty());
        Assertions.assertEquals(1,b.getReservations().get(0).getDay_initial());
        Assertions.assertEquals(1,b.getReservations().get(0).getMonth_initial());
        Assertions.assertEquals(2024,b.getReservations().get(0).getYear_initial());
        Assertions.assertEquals(31,b.getReservations().get(0).getDay_final());
        Assertions.assertEquals(12,b.getReservations().get(0).getMonth_final());
        Assertions.assertEquals(2024,b.getReservations().get(0).getYear_final());

    }

    @Test
    public void freeAdvertTest(){
        Customer c = new Customer("Diego","Garcia","Spain",21);
        Advert a = new BusAdvert("bus");
        b.buyAd(1,1,2024,
                31,12,2024,
                c,a);
        b.freeAd(a);
        Assertions.assertTrue(b.getReservations().isEmpty());

    }


}
