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
                        menuReporting();
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
        int type;
        String name;

        System.out.println("1-Create a new advert");
        System.out.println("2-Read a advert");
        System.out.println("3-Update a advert");
        System.out.println("4-Delete a advert");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();


            switch (option) {
                case "1":   //Create
                    Advert advert;
                    System.out.println("Enter the type (1=Billboard, 2=Bus, 3=Park) of the advert: ");
                    type = scanner.nextInt();
                    switch (type){
                        case 1:
                            System.out.println("Enter the name of the advert: ");
                            name = scanner.next();
                            advert = new BillboardAdvert(name);
                            //Add to customer list
                            business.addAdvert(advert);
                            break;
                        case 2:
                            System.out.println("Enter the name of the advert: ");
                            name = scanner.next();
                            advert = new BusAdvert(name);
                            //Add to customer list
                            business.addAdvert(advert);
                            break;
                        case 3:
                            System.out.println("Enter the name of the advert: ");
                            name = scanner.next();
                            advert = new ParkAdvert(name);
                            //Add to customer list
                            business.addAdvert(advert);
                            break;
                        default:
                            System.out.println("The value entered does not correspond to any of the above functions, please try again.");
                            break;
                    }
                    System.out.println("Advert created correctly!\n\n");
                    break;
                case "2":   //Read
                    business.readAdverts();
                    break;

                case "3":   //Update
                    Scanner scanner_update = new Scanner(System.in);
                    business.readCustomers();
                    System.out.println("Select the advert to update: ");
                    business.readAdverts();
                    int pos = scanner_update.nextInt();
                    scanner_update.nextLine();
                    System.out.println("Enter the name of the advert: ");
                    name = scanner.nextLine();
                    business.updateAdvert(pos,name);
                    break;

                case "4":   //Delete
                    Scanner scanner_delete = new Scanner(System.in);
                    business.readCustomers();
                    System.out.println("Select the advert to delete: ");
                    int del = scanner_delete.nextInt();
                    business.removeAdvert(del-1);
                    break;

                default:
                    System.out.println("The value entered does not correspond to any of the above functions, please try again.");
                    break;
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
                    business.addCustomer(customer);
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
                    business.updateCustomer(pos, name, surname, country, age);
                    break;

                case "4": //Delete
                    Scanner scanner_delete = new Scanner(System.in);
                    business.readCustomers();
                    System.out.println("Select the customer to delete: ");
                    int del = scanner_delete.nextInt();
                    business.removeCustomer(del - 1);
                    break;

                default:
                    System.out.println("The value entered does not correspond to any of the above functions, please try again.");
                    break;
            }
        }catch(Exception e){
            System.out.println("No field can be empty and numbers must be introduced when introducing ages");
        }
    }

    public void menuTimetabling(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1-Reserve add for customer.");
        System.out.println("2-Delete reservation.");

            switch (sc.nextInt()){
                case 1:
                    if(business.getCustomerList().isEmpty() || business.getAdvertList().isEmpty()){
                        System.out.println("There are no customers or adverts in the system");
                        break;
                    }
                    System.out.println("These are all the customers in the system.");
                    business.readCustomers();

                    System.out.println("Which customer you want to use? ");
                    int cus = sc.nextInt();
                    Customer c;
                    if(cus>=1){
                        c = business.getCustomerList().get(cus-1);
                    }
                    else{
                        System.out.println("index cannot be less than 1");
                        break;
                    }

                    System.out.println("These are all the adverts in the system.");
                    business.readAdverts();

                    System.out.println("Which advert you want to buy? ");
                    int ad = sc.nextInt();
                    Advert advert;
                    if(ad>=1){
                        advert = business.getAdvertList().get(ad-1);

                    }
                    else{
                        System.out.println("index cannot be less than 1");
                        break;
                    }
                    System.out.println("From what date you want to start the reservation? (DD-MM_YY)");
                    String aux = sc.next();
                    String [] s = aux.split("-");
                    int ini_day = Integer.parseInt(s[0]);
                    int ini_month = Integer.parseInt(s[1]);
                    int ini_year = Integer.parseInt(s[2]);

                    System.out.println("From what date you want to end the reservation? (DD-MM_YY)");
                    aux = sc.next();
                    s = aux.split("-");
                    int final_day = Integer.parseInt(s[0]);
                    int final_month = Integer.parseInt(s[1]);
                    int final_year = Integer.parseInt(s[2]);

                    business.buyAd(ini_day,ini_month,ini_year,final_day,final_month,
                            final_year,c,advert);
                    break;
                case 2:
                    System.out.println("These are all the reservations in the system\n" +
                            "Which one you want to delete?");
                    business.readReservations();
                    int number = sc.nextInt();
                    business.getReservations().get(number-1).getAdvert().setBought(false);
                    business.getReservations().remove(business.getReservations().get(number-1));
                    break;
                default:
                    System.out.println("Introduce a valid number!");
                    break;
            }


    }

    public void menuReporting(){
        System.out.println("1-Show reservations");
        System.out.println("2-Income report from customer");
        System.out.println("3-Income report from advert");

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int aux;
        switch (value){
            case 1:
                business.readReservations();
                break;
            case 2:
                System.out.println("Which customer do you want to use?");
                business.readCustomers();
                aux = sc.nextInt();
                business.incomeReportCustomer(business.getCustomerList().get(aux-1));
                break;
            case 3:
                System.out.println("Which advert do you want to use?");
                business.readAdverts();
                aux = sc.nextInt();
                business.incomeReportAdvert(business.getAdvertList().get(aux-1));
                break;
            default:
                System.out.println("Introduce a valid number!");
                break;
        }
    }
}
