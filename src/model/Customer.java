package src.model;


import java.util.Objects;
import java.util.Random;

public class Customer {

    private String name;
    private String surname;
    private int age;
    private String country;
    private String id;

    public Customer(String name, String surname,String country,int age){
        if(name.isBlank()||surname.isBlank()||country.isBlank()||age<0){
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
        this.id = generateID();
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    public String getCountry(){
        return this.country;
    }

    public String getId(){
        return this.id;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String generateID() {
        String characters = "0123456789";
        StringBuilder id = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 8; ++i) {
            char x = characters.charAt(random.nextInt(characters.length()));
            id.append(x);
        }
        return id.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    public void displayInfo(){
        System.out.println("Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Country: " + this.country + ", Age: " + this.getAge() + ", Id: " + this.getId());
    }
    public String toString(){
        return ("Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Country: " + this.country + ", Age: " + this.getAge() + ", Id: " + this.getId());
    }
}