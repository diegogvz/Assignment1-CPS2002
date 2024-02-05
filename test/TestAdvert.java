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
    }
    @Test
    public void testBus(){
        Advert ad = new BusAdvert("bu");
        Assertions.assertEquals(2,ad.getHeight());
        Assertions.assertEquals(4,ad.getWidth());
        Assertions.assertEquals(500,ad.getPrice());
    }
    @Test
    public void testPark(){
        Advert ad = new ParkAdvert("pa");
        Assertions.assertEquals(25,ad.getHeight());
        Assertions.assertEquals(30,ad.getWidth());
        Assertions.assertEquals(1500,ad.getPrice());
    }
}
