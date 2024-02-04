package src.model;

import java.util.ArrayList;

public class Business {
    protected ArrayList<Customer> customerList;
    protected ArrayList<Advert> advertList;

    public Business(){
        this.customerList = new ArrayList<>();
        this.advertList = new ArrayList<>();
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

    public void updateAdvert(int i,int price,int height, int width){
        advertList.get(i-1).setPrice(price);
        advertList.get(i-1).setHeight(height);
        advertList.get(i-1).setWidth(width);
    }

    public void readAdvert(){
        for(int i=0;i<advertList.size();i++){
            System.out.println("Customer:" + (i+1));
            //advertList.get(i).displayInfo();
        }
    }
}
