package src.model;

public class Reservation {

    protected int day_initial;
    protected int month_initial;
    protected int year_initial;
    protected int day_final;
    protected int month_final;
    protected int year_final;

    protected Customer customer;
    protected Advert advert;

    public Reservation(int day_initial, int month_initial, int year_initial, int day_final,
                       int month_final, int year_final, Customer customer, Advert advert) {
        this.day_initial = day_initial;
        this.month_initial = month_initial;
        this.year_initial = year_initial;
        this.day_final = day_final;
        this.month_final = month_final;
        this.year_final = year_final;
        this.customer = customer;
        this.advert = advert;
    }

    public int getDay_initial() {
        return day_initial;
    }

    public int getYear_initial() {
        return year_initial;
    }

    public int getDay_final() {
        return day_final;
    }

    public int getYear_final() {
        return year_final;
    }

    public int getMonth_initial() {
        return month_initial;
    }


    public int getMonth_final() {
        return month_final;
    }


    public Customer getCustomer() {
        return customer;
    }

    public Advert getAdvert() {
        return advert;
    }

    public void displayInfo(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "initial date = " + day_initial +"-"+ month_initial +"-"+ year_initial +
                ", final date = " + day_final +"-"+ month_final +"-"+ year_final +
                ", customer=" + customer +
                ", advert=" + advert ;
    }
}
