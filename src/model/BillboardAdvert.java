package src.model;

public class BillboardAdvert extends Advert{
    protected String name;
    public  BillboardAdvert(String name) {
        super();
        super.price = 3000;
        super.height = 25;
        super.width = 60;
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
        System.out.println("Type = Billboard, "+ "name = '" + name +
                ", price = " + price +
                ", height = " + height +
                ", width = " + width);
    }
    @Override
    public String toString() {
        return "BillboardAdvert: " +
                "name='" + name + '\'' +
                ", price=" + price +
                ", height=" + height +
                ", width=" + width +
                ", name='" + name + '\''
                ;
    }
}
