package src.model;

public class Advert {
    protected int price;
    protected int height;
    protected int width;

    protected String name;

    protected boolean bought;

    public Advert() {

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getHeight() {
        return height;
    }


    public int getWidth() {
        return width;
    }


    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Advert: " +
                "price=" + price +
                ", height=" + height +
                ", width=" + width +
                ", name='" + name + '\'';
    }

    public void displayInfo(){

    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }
}

