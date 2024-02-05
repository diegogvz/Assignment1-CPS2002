package src.model;

public class BusAdvert extends Advert{

    protected String name;
    public  BusAdvert(String name){
        super();
        super.price = 500;
        super.height = 2;
        super.width = 4;
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
        System.out.println("Type = Bus, "+ "name = '" + name +
                ", price = " + price +
                ", height = " + height +
                ", width = " + width);
    }
    @Override
    public String toString() {
        return "BusAdvert: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", height=" + height +
                ", width=" + width +
                ", name='" + name + '\'';
    }
}
