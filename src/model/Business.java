package src.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Business {
    protected ArrayList<Customer> customerList;
    protected ArrayList<Advert> advertList;

    protected ArrayList<Reservation> reservations;

    public Business(){
        this.customerList = new ArrayList<>();
        this.advertList = new ArrayList<>();
        this.reservations= new ArrayList<>();
    }

    public void updateCustomer(int i,String name,String surname,String country,int age){
        customerList.get(i-1).setName(name);
        customerList.get(i-1).setSurname(surname);
        customerList.get(i-1).setCountry(country);
        customerList.get(i-1).setAge(age);
    }

    public void readCustomers(){
        for(int i=0;i<customerList.size();i++){
            System.out.println("Customer:" + (i+1));
            customerList.get(i).displayInfo();
        }
    }
    public void readReservations(){
        for(int i=0;i<reservations.size();i++){
            System.out.println("Reservation:" + (i+1));
            reservations.get(i).displayInfo();
        }
    }

    public void updateAdvert(int i,int price,int height, int width,String name){
        advertList.get(i-1).setPrice(price);
        advertList.get(i-1).setHeight(height);
        advertList.get(i-1).setWidth(width);
        advertList.get(i-1).setName(name);
    }

    public void readAdvert(){
        for(int i=0;i<advertList.size();i++){
            System.out.println("Advert:" + (i+1));
            advertList.get(i).displayInfo();
        }
    }

    public void buyAd(int day_initial, int month_initial, int year_initial, int day_final,
                      int month_final, int year_final,Customer c, Advert a){
        if (!a.isBought()){
            reservations.add(new Reservation(day_initial,month_initial,
                    year_initial,day_final,month_final,year_final,c,a));
            System.out.println("Reservation created.");
            a.setBought(true);
        }
        else{
            System.out.println("The advert is already taken, it must be free before it " +
                    "can be bought again");
        }

    }

    public void freeAd(Advert a){
        reservations.removeIf(r -> r.getAdvert().equals(a));
    }
}
