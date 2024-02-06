package src.model;


import java.util.Random;

public class Customer {

    protected String name;
    protected String surname;
    protected int age;
    protected String country;
    protected String id;

    public Customer(String name, String surname,String country,int age){
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

    public void displayInfo(){
        System.out.println("Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Country: " + this.country + ", Age: " + this.getAge() + ", Id: " + this.getId());
    }
    public String toString(){
        return ("Name: " + this.getName() + ", Surname: " + this.getSurname() + ", Country: " + this.country + ", Age: " + this.getAge() + ", Id: " + this.getId());
    }
}