import devices.*;
import devices.gadgets.Headphones;
import devices.gadgets.Smartwatch;
import devices.phones.MobilePhone;
import devices.phones.Smartphone;
import devices.tablets.BusinessTablet;
import devices.tablets.DrawingTablet;
import devices.tablets.GamingTablet;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> devices = new ArrayList<>();
    public static ArrayList<String> categories = new ArrayList<>();
    public static ArrayList<Integer> productNums = new ArrayList<>();
    public static ArrayList<Double> prices = new ArrayList<>();

    public static void main(String[] args) {
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the TakePhone store!");
        login();
    }


    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Time to sign up! Are you buyer (1), or a seller? (2)");
        int choice = scanner.nextInt();
        if (choice == 1) {
            buyerPart();
        } else if (choice == 2) {
            sellerPart();
        } else {
            System.out.println("Invalid choice, please try again.");
            login();
        }
    }
    public static void newSeller(){
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String login = scanner.nextLine();
        System.out.println("Type your password: ");
        String password = scanner.nextLine();
        market.createSeller(login, password);
    }
    public static void getIn(){
        Scanner scanner = new Scanner(System.in);
        Market market = new Market();
        System.out.println("Enter your login:");
        String login = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        if (market.checkPassword(login, password)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied. Incorrect login or password.");
            sellerPart();
        }
        sellOperate(login);
    }
    public static void sellerPart() {
        Scanner scanner = new Scanner(System.in);
        Market market = new Market();
        System.out.println("-- LIST OF SELLERS --");
        market.showSellers();
        System.out.println("0. Get back to login. ");
        System.out.println("1. Create a new seller. ");
        System.out.println("2. Login. ");
        int dilemma = scanner.nextInt();
        if(dilemma==0){
            login();
        }
        else if(dilemma==1){
            newSeller();
        }
        else if(dilemma==2){
            getIn();
        }
        else{
            System.out.println("Invalid option. ");
            sellerPart();
        }

    }
    public static void sellOperate(String login){
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("0. Get back to the list. ");
            System.out.println("1. Check your products. ");
            System.out.println("2. Update your products. ");
            System.out.println("3. Create new products. ");
            System.out.println("4. Delete products. ");
            int des = scanner.nextInt();
            if (des == 0) {
                sellerPart();
            }
            else if (des == 1) {
                System.out.println("What exact product you want to check? ");
                System.out.println("1. Headphones");
                System.out.println("2. Smartwatch");
                System.out.println("3. Gaming tablet");
                System.out.println("4. Drawing tablet");
                System.out.println("5. Business tablet");
                System.out.println("6. Mobile phone");
                System.out.println("7. Smartphone");
                System.out.println("8. Get back");
                int choice = scanner.nextInt();
                String category = "";
                switch (choice) {
                    case 1:
                        category = "Headphones";
                        market.readDevicesByLogin(category,login);
                        break;
                    case 2:
                        category = "Smartwatch";
                        market.readDevicesByLogin(category,login);
                        break;
                    case 3:
                        category = "GamingTablet";
                        market.readDevicesByLogin(category,login);
                        break;
                    case 4:
                        category = "DrawingTablet";
                        market.readDevicesByLogin(category,login);
                        break;
                    case 5:
                        category = "BusinessTablet";
                        market.readDevicesByLogin(category,login);
                        break;
                    case 6:
                        category = "MobilePhone";
                        market.readDevicesByLogin(category,login);
                        break;
                    case 7:
                        category = "Smartphone";
                        market.readDevicesByLogin(category,login);
                        break;
                    default:
                        System.out.println("Invalid option, try again");
                        sellOperate(login);
                }
            }
            else if(des == 2){
                System.out.println("What exact product you want to update? ");
                System.out.println("1. Headphones");
                System.out.println("2. Smartwatch");
                System.out.println("3. Gaming tablet");
                System.out.println("4. Drawing tablet");
                System.out.println("5. Business tablet");
                System.out.println("6. Mobile phone");
                System.out.println("7. Smartphone");
                System.out.println("8. Get back");
                int choice = scanner.nextInt();
                int id;
                String category = "";
                switch (choice) {
                    case 1:
                        category = "Headphones";
                        market.readDevicesByLogin(category,login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id,category);
                        break;
                    case 2:
                        category = "Smartwatch";
                        market.readDevicesByLogin(category,login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id,category);
                        break;
                    case 3:
                        category = "GamingTablet";
                        market.readDevicesByLogin(category,login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id,category);
                        break;
                    case 4:
                        category = "DrawingTablet";
                        market.readDevicesByLogin(category,login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id,category);
                        break;
                    case 5:
                        category = "BusinessTablet";
                        market.readDevicesByLogin(category,login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id,category);
                        break;
                    case 6:
                        category = "MobilePhone";
                        market.readDevicesByLogin(category,login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id,category);
                        break;
                    case 7:
                        category = "Smartphone";
                        market.readDevicesByLogin(category,login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id,category);
                        break;
                    default:
                        System.out.println("Invalid option, try again");
                        sellOperate(login);
                }
            }
            else if(des == 3) {
                System.out.println("What exact product you want to create ");
                System.out.println("1. Headphones");
                System.out.println("2. Smartwatch");
                System.out.println("3. Gaming tablet");
                System.out.println("4. Drawing tablet");
                System.out.println("5. Business tablet");
                System.out.println("6. Mobile phone");
                System.out.println("7. Smartphone");
                System.out.println("8. Get back");
                int choice = scanner.nextInt();
                int id;
                switch (choice) {
                    case 1:
                        market.initHeadphones(login);
                        break;
                    case 2:
                        market.initSmartwatch(login);
                        break;
                    case 3:
                        market.initGameTablet(login);
                        break;
                    case 4:
                        market.initDrawTablet(login);
                        break;
                    case 5:
                        market.initBusTablet(login);
                        break;
                    case 6:
                        market.initMobilePhone(login);
                        break;
                    case 7:
                        market.initSmartPhone(login);
                        break;
                    default:
                        System.out.println("Invalid option, try again");
                        sellOperate(login);
                }
            }
            else if(des==4) {
                System.out.println("What exact product you want to delete? ");
                System.out.println("1. Headphones");
                System.out.println("2. Smartwatch");
                System.out.println("3. Gaming tablet");
                System.out.println("4. Drawing tablet");
                System.out.println("5. Business tablet");
                System.out.println("6. Mobile phone");
                System.out.println("7. Smartphone");
                System.out.println("8. Get back");
                int choice = scanner.nextInt();
                int id;
                String category = "";
                switch (choice) {
                    case 1:
                        category = "Headphones";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category,id);
                        break;
                    case 2:
                        category = "Smartwatch";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category,id);
                        break;
                    case 3:
                        category = "GamingTablet";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category,id);
                        break;
                    case 4:
                        category = "DrawingTablet";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category,id);
                        break;
                    case 5:
                        category = "BusinessTablet";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category,id);
                        break;
                    case 6:
                        category = "MobilePhone";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category,id);
                        break;
                    case 7:
                        category = "Smartphone";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category,id);
                        break;
                    default:
                        System.out.println("Invalid option, try again");
                        sellOperate(login);
                }
            }
        }
    }
    public static void buyerPart() {
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BUYER PART ---");
        while (true) {
            System.out.println("Choose the product category you are interested in:");
            System.out.println("1. Headphones");
            System.out.println("2. Smartwatch");
            System.out.println("3. Gaming tablet");
            System.out.println("4. Drawing tablet");
            System.out.println("5. Business tablet");
            System.out.println("6. Mobile phone");
            System.out.println("7. Smartphone");
            System.out.println("8. Print basket: ");
            System.out.println("0. Get back to login: ");
            System.out.println("Enter the category:");
            int choice = scanner.nextInt();
            String category = scanner.nextLine();
            switch (choice) {
                case 0:
                    login();
                case 1:
                    category = "Headphones";
                    break;
                case 2:
                    category = "Smartwatch";
                    break;
                case 3:
                    category = "GamingTablet";
                    break;
                case 4:
                    category = "DrawingTablet";
                    break;
                case 5:
                    category = "BusinessTablet";
                    break;
                case 6:
                    category = "MobilePhone";
                    break;
                case 7:
                    category = "Smartphone";
                    break;
                case 8:
                    printBasket();
                default:
                    System.out.println("Invalid option, try again");
                    buyerPart();
            }
            System.out.println("The following products are available in the selected category:");
            market.readDevices(category);
            System.out.println("Enter the product number to see more, or 0 to exit:");
            int productNum = scanner.nextInt();
            if (productNum == 0) {
                buyerPart();
            } else {
                market.readDevicesByID(category, productNum);
            }
            System.out.println("0. Exit. ");
            System.out.println("1. Buy it.");
            int dilemma = scanner.nextInt();
            if(dilemma==1){
                categories.add(category);
                devices.add(market.returnModel(category,productNum));
                productNums.add(productNum);
                prices.add(market.returnPrice(category,productNum));
                System.out.println("Added to basket successfully!");
                buyerPart();
            }
            else{
                buyerPart();
            }
        }
    }
    public static void removeDevice(int productNum){
        int index = productNums.indexOf(productNum);
        if(index != -1){
            devices.remove(index);
            productNums.remove(index);
            prices.remove(index);
        }
    }
    public static void confirm(){
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for (Double price : prices) {
            total += price;
        }
        System.out.println("Total price: " + total);
        System.out.println("Confirm purchase (Y/N): ");
        String confirm = scanner.nextLine();
        if(confirm.equals("Y")){
            System.out.println("The purchase was successful. Have a nice day!");
            for(int i = 0; i < categories.size(); i++){
                String category = categories.get(i);
                int id = productNums.get(i);
                market.deleteDevice(category, id);
            }
            devices.clear();
            productNums.clear();
            prices.clear();
            buyerPart();
        }
        else{
            printBasket();
        }
    }
    public static void remove(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which ID? ");
        int id = scanner.nextInt();
        removeDevice(id);
        System.out.println("Removed successfully!");
        printBasket();
    }
    public static void printBasket(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < devices.size(); i++) {
            System.out.println("Product "+ (i+1));
            System.out.println("Model "+devices.get(i));
            System.out.println("ID "+productNums.get(i));;
            System.out.println("Price "+prices.get(i));
            System.out.println("--------------------");
        }
        System.out.println("0. Get Back");
        System.out.println("1. Make a purchase.");
        System.out.println("2. Delete products.");
        int des = scanner.nextInt();
        if(des==1){
            confirm();
        }
        else if(des==2){
            remove();
        }
    }
}

