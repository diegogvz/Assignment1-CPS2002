package src.model;

import java.util.Scanner;

public class UI {
    Business business = new Business();
    public UI(){

    }
    public void run(){

        while(true){

            System.out.println("---------WELCOME TO OUR PROGRAM---------");
            System.out.println("1-Resource Management");
            System.out.println("2-Customer Management");
            System.out.println("3-Timetabling");
            System.out.println("4-Accounting and Reporting");
            System.out.println("5-Exit");
            System.out.println("Please, select one opction of the above: ");
            Scanner scan = new Scanner(System.in);
            String option = scan.nextLine();
            try{
                switch (option){
                    case "1":
                        System.out.print("\033[2J\033[H");  //This is for clean the terminal
                        System.out.println("Introduced option 1: Resource Management");
                        menuResource();
                        break;
                    case "2":
                        System.out.print("\033[2J\033[H");  //This is for clean the terminal
                        System.out.println("Introduced option 2: Customer Management");
                        menuCustomer();
                        break;
                    case "3":
                        System.out.print("\033[2J\033[H");  //This is for clean the terminal
                        System.out.println("Introduced option 3: Timetabling");
                        menuTimetabling();
                        break;
                    case "4":
                        System.out.print("\033[2J\033[H");  //This is for clean the terminal
                        System.out.println("Introduced option 4: Accounting and Reporting");

                        break;
                    case "5":
                        System.out.print("\033[2J\033[H");  //This is for clean the terminal
                        System.out.println("Entered exit value, goodbye!");
                        System.exit(0);
                    default:
                        System.out.println("The value entered does not correspond to any of the above functions, please try again.");
                        break;

                }
            }catch (NumberFormatException e){
                System.out.println("Introduce a valid number!\n");
            }

        }
    }

    public void menuResource() {
        int price, height, width;

        System.out.println("1-Create a new advert");
        System.out.println("2-Read a advert");
        System.out.println("3-Update a advert");
        System.out.println("4-Delete a advert");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        try {
            switch (option) {
                case "1":   //Create
                    System.out.println("Enter the price of the advert: ");
                    price = scanner.nextInt();
                    System.out.println("Enter the height of the advert: ");
                    height = scanner.nextInt();
                    System.out.println("Enter the width of the advert: ");
                    width = scanner.nextInt();
                    Advert advert = new Advert();
                    //Add to customer list
                    business.advertList.add(advert);
                    System.out.println("Customer create correctly!\n\n");

                    break;
                case "2":   //Read
                    business.readCustomers();
                    break;

                case "3":   //Update
                    Scanner scanner_update = new Scanner(System.in);
                    business.readCustomers();
                    System.out.println("Select the customer to update: ");
                    int pos = scanner_update.nextInt();
                    scanner_update.nextLine();

                    System.out.println("Enter the price of the advert: ");
                    price = scanner.nextInt();
                    System.out.println("Enter the height of the advert: ");
                    height = scanner.nextInt();
                    System.out.println("Enter the width of the advert: ");
                    width = scanner.nextInt();
                    //Given the customer to modify, set all properties
                    business.updateAdvert(pos,price,height,width);
                    break;

                case "4":   //Delete
                    Scanner scanner_delete = new Scanner(System.in);
                    business.readCustomers();
                    System.out.println("Select the advert to delete: ");
                    int del = scanner_delete.nextInt();
                    business.advertList.remove(del-1);
                    break;

                default:
                    System.out.println("The value entered does not correspond to any of the above functions, please try again.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Introduce a valid number!\n");
        }
    }

    public void menuCustomer() {
        String name, surname, country;
        int age;
        System.out.println("1-Create a new customer");
        System.out.println("2-Read a customer");
        System.out.println("3-Update a customer");
        System.out.println("4-Delete a customer");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();

        try {
            switch (option) {
                case "1": //Create
                    System.out.println("Enter the name of the customer: ");
                    name = scanner.nextLine();
                    System.out.println("Enter the surname of the customer: ");
                    surname = scanner.nextLine();
                    System.out.println("Enter the country of the customer: ");
                    country = scanner.nextLine();
                    System.out.println("Enter the age of the customer: ");
                    age = scanner.nextInt();
                    Customer customer = new Customer(name, surname, country, age);
                    //Add to customer list
                    business.customerList.add(customer);
                    System.out.println("Customer create correctly!\n\n");
                    break;

                case "2": //Read
                    business.readCustomers();
                    break;

                case "3": //Update
                    Scanner scanner_update = new Scanner(System.in);
                    business.readCustomers();
                    System.out.println("Select the customer to update: ");
                    int pos = scanner_update.nextInt();
                    scanner_update.nextLine();
                    System.out.println("Enter the name of the customer: ");
                    name = scanner_update.nextLine();

                    System.out.println("Enter the surname of the customer: ");
                    surname = scanner_update.nextLine();

                    System.out.println("Enter the country of the customer: ");
                    country = scanner_update.nextLine();

                    System.out.println("Enter the age of the customer: ");
                    age = scanner_update.nextInt();

                    //Given the customer to modify, set all properties
                    business.updateCustomer(pos,name,surname,country,age);
                    break;

                case "4": //Delete
                    Scanner scanner_delete = new Scanner(System.in);
                    business.readCustomers();
                    System.out.println("Select the customer to delete: ");
                    int del = scanner_delete.nextInt();
                    business.customerList.remove(del-1);
                    break;

                default:
                    System.out.println("The value entered does not correspond to any of the above functions, please try again.");
                    break;
            }
        } catch (NumberFormatException e) {
            System.out.println("Introduce a valid number!\n");
        }
    }

    public void menuTimetabling(){

    }
}
