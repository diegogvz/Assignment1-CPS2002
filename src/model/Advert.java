package src.model;

public class Advert {
    protected int price;
    protected int height;
    protected int width;

    protected String name;

    protected boolean bought;

    public Advert() {

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
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

