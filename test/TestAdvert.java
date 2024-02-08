package test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import src.model.Advert;
import src.model.BillboardAdvert;
import src.model.BusAdvert;
import src.model.ParkAdvert;

public class TestAdvert {
    @Test
    public void testBillboard(){
        Advert ad = new BillboardAdvert("bb");
        Assertions.assertEquals(25,ad.getHeight());
        Assertions.assertEquals(60,ad.getWidth());
        Assertions.assertEquals(3000,ad.getPrice());
        Assertions.assertEquals("bb",ad.getName());
        Assertions.assertEquals("BillboardAdvert: name='bb', price=3000, height=25, width=60, name='bb'", ad.toString());
    }
    @Test
    public void testBus(){
        Advert ad = new BusAdvert("bu");
        Assertions.assertEquals(2,ad.getHeight());
        Assertions.assertEquals(4,ad.getWidth());
        Assertions.assertEquals(500,ad.getPrice());
        Assertions.assertEquals("bu",ad.getName());
        Assertions.assertEquals("BusAdvert: name='bu', price=500, height=2, width=4, name='bu'", ad.toString());

    }
    @Test
    public void testPark(){
        Advert ad = new ParkAdvert("pa");
        Assertions.assertEquals(25,ad.getHeight());
        Assertions.assertEquals(30,ad.getWidth());
        Assertions.assertEquals(1500,ad.getPrice());
        Assertions.assertEquals("pa",ad.getName());
        Assertions.assertEquals("ParkAdvert: name='pa', price=1500, height=25, width=30, name='pa'", ad.toString());
    }
}
