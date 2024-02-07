package src.model;

import java.util.ArrayList;

public class Business {
    private ArrayList<Customer> customerList;
    private ArrayList<Advert> advertList;

    private ArrayList<Reservation> reservations;

    public Business(){
        this.customerList = new ArrayList<>();
        this.advertList = new ArrayList<>();
        this.reservations= new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public ArrayList<Advert> getAdvertList() {
        return advertList;
    }

    public ArrayList<Reservation> getReservations() {
        return reservations;
    }

    public void addAdvert(Advert a){
        if(a.getName().isBlank()){
            System.out.println("The name of the advert cannot be blank");
        }
        else{
            advertList.add(a);
        }
    }

    public void addCustomer(Customer c){
        customerList.add(c);
    }

    public void removeAdvert(int a){
        if (a<0){
            System.out.println("Cannot look for negative index");
        }
        else{
            advertList.remove(a);
        }
    }
    public void removeCustomer(int index){
        if (index<0){
            System.out.println("Cannot look for negative index");
        }
        else{
            customerList.remove(index);
        }
    }

    public void updateCustomer(int i,String name,String surname,String country,int age){
        if(name.isBlank()||surname.isBlank()||country.isBlank()||age<0){
            throw new IllegalArgumentException();
        }
        customerList.get(i-1).setName(name);
        customerList.get(i-1).setSurname(surname);
        customerList.get(i-1).setCountry(country);
        customerList.get(i-1).setAge(age);
    }

    public void readCustomers(){
        if(!customerList.isEmpty()){
            for(int i=0;i<customerList.size();i++){
                System.out.println("Customer:" + (i+1));
                customerList.get(i).displayInfo();
            }
        }else {
            System.out.println("There are no customers in the system. ");
        }
    }
    public void readReservations(){
        if(!reservations.isEmpty()){
            for(int i=0;i<reservations.size();i++){
                System.out.println("Reservation:" + (i+1));
                reservations.get(i).displayInfo();
            }
        }else{
            System.out.println("There are no reservations in the system. ");
        }
    }

    public void updateAdvert(int i,String name){
        if(i<1){
            System.out.println("A negative cannot be introduced.");
        }
        else  if(name.isBlank()){
            System.out.println("The name of the advert cannot be blank");
        }
        else{
            advertList.get(i-1).setName(name);
        }
    }

    public void readAdverts(){
        if(!advertList.isEmpty()){
            for(int i=0;i<advertList.size();i++){
                System.out.println("Advert:" + (i+1));
                advertList.get(i).displayInfo();
            }
        }
        else{
            System.out.println("There are no adverts in the system. ");
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

    public void incomeReportCustomer(Customer c){
        System.out.print("Customer data: ");
        c.displayInfo();
        int counter = 0;
        int money = 0;
        for (Reservation r:reservations
             ) {
            if(r.getCustomer().equals(c)) {
                counter += 1;
                money += r.getAdvert().getPrice();
            }
        }
        System.out.println("The customer has " + counter + "reservation(s) made.");
        System.out.println("The customer is spending " + money + "€ in total.");

    }

    public void incomeReportAdvert(Advert a){
        System.out.print("Advert data: ");
        a.displayInfo();
        if(a.isBought()){
            System.out.println("The advert is bought ");
            a.displayInfo();
        }
        else{
            System.out.println("The advert is not bought by anyone");
        }

    }
}
