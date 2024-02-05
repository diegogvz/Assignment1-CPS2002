package src.model;

public class ParkAdvert extends Advert {

    String name;
    public ParkAdvert(String name) {
        super();
        super.price = 1500;
        super.height = 25;
        super.width = 30;
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void displayInfo(){
        System.out.println("Type = Park, "+ "name = '" + name +
                ", price = " + price +
                ", height = " + height +
                ", width = " + width);
    }
    @Override
    public String toString() {
        return "ParkAdvert: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", height=" + height +
                ", width=" + width +
                ", name='" + name + '\'';
    }
}
