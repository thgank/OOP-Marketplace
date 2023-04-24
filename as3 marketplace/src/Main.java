import devices.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> devices = new ArrayList<>();
    public static ArrayList<String> categories = new ArrayList<>();
    public static ArrayList<Integer> productNumbs = new ArrayList<>();
    public static ArrayList<Double> prices = new ArrayList<>();
    public static Market market = Market.getInstance();

    public static void main(String[] args) {
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your name: ");
        String login = scanner.nextLine();
        System.out.println("Type your password: ");
        String password = scanner.nextLine();
        market.createSeller(login, password);
        sellerPart();
    }
    public static void getIn(){
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("--- LIST OF SELLERS ---");
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
    public static void sellOperate(String login) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--- SELL OPERATIONS ---");
            System.out.println("0. Get back to the list. ");
            System.out.println("1. Check your products. ");
            System.out.println("2. Update your products. ");
            System.out.println("3. Create new products. ");
            System.out.println("4. Delete products. ");
            int des = scanner.nextInt();
            if (des == 0) {
                sellerPart();
            } else if (des == 1) {
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
                String category;
                switch (choice) {
                    case 1 -> {
                        category = "Headphones";
                        market.readDevicesByLogin(category, login);
                    }
                    case 2 -> {
                        category = "Smartwatch";
                        market.readDevicesByLogin(category, login);
                    }
                    case 3 -> {
                        category = "GamingTablet";
                        market.readDevicesByLogin(category, login);
                    }
                    case 4 -> {
                        category = "DrawingTablet";
                        market.readDevicesByLogin(category, login);
                    }
                    case 5 -> {
                        category = "BusinessTablet";
                        market.readDevicesByLogin(category, login);
                    }
                    case 6 -> {
                        category = "MobilePhone";
                        market.readDevicesByLogin(category, login);
                    }
                    case 7 -> {
                        category = "Smartphone";
                        market.readDevicesByLogin(category, login);
                    }
                    default -> {
                        System.out.println("Invalid option, try again");
                        sellOperate(login);
                    }
                }
            } else if (des == 2) {
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
                String category;
                switch (choice) {
                    case 1 -> {
                        category = "Headphones";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id, category);
                    }
                    case 2 -> {
                        category = "Smartwatch";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id, category);
                    }
                    case 3 -> {
                        category = "GamingTablet";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id, category);
                    }
                    case 4 -> {
                        category = "DrawingTablet";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id, category);
                    }
                    case 5 -> {
                        category = "BusinessTablet";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id, category);
                    }
                    case 6 -> {
                        category = "MobilePhone";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id, category);
                    }
                    case 7 -> {
                        category = "Smartphone";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.updateProduct(id, category);
                    }
                    default -> {
                        System.out.println("Invalid option, try again");
                        sellOperate(login);
                    }
                }
            } else if (des == 3) {
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
                if (choice < 1 || choice > 7) {
                    sellOperate(login);
                }
                market.initDevice(login, choice);
            } else if (des == 4) {
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
                String category;
                switch (choice) {
                    case 1 -> {
                        category = "Headphones";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category, id);
                    }
                    case 2 -> {
                        category = "Smartwatch";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category, id);
                    }
                    case 3 -> {
                        category = "GamingTablet";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category, id);
                    }
                    case 4 -> {
                        category = "DrawingTablet";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category, id);
                    }
                    case 5 -> {
                        category = "BusinessTablet";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category, id);
                    }
                    case 6 -> {
                        category = "MobilePhone";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category, id);
                    }
                    case 7 -> {
                        category = "Smartphone";
                        market.readDevicesByLogin(category, login);
                        System.out.println("Type ID: ");
                        id = scanner.nextInt();
                        market.deleteDevice(category, id);
                    }
                    default -> {
                        System.out.println("Invalid option, try again");
                        sellOperate(login);
                    }
                }
            }
        }
    }
    public static void buyerPart() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- BUYER PART ---");
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
                    buyerPart();
            }
            System.out.println("The following products are available in the selected category:");
            market.readDevices(category);
            System.out.println("0. Exit");
            System.out.println("1. Sort");
            System.out.println("Enter the product number to see more");
            int productNum = scanner.nextInt();
            if (productNum == 0) {
                buyerPart();
            }
            else if(productNum==1){
                sortDevices(category);
            }
            else {
                market.readDevicesByID(category, productNum);
            }
            System.out.println("0. Exit. ");
            System.out.println("1. Buy it.");
            int dilemma = scanner.nextInt();
            if(dilemma==1){
                categories.add(category);
                devices.add(market.returnModel(category,productNum));
                productNumbs.add(productNum);
                prices.add(market.returnPrice(category,productNum));
                System.out.println("Added to basket successfully!");
                buyerPart();
            }
            else{
                buyerPart();
            }
        }
    public static void sortDevices(String category){
        Scanner scanner = new Scanner(System.in);
        System.out.println("In which way you want to sort devices?");
        System.out.println("0. Exit.");
        System.out.println("1. By price.");
        System.out.println("2. By brand.");
        int choice = scanner.nextInt();
        switch (choice) {
            case 0 -> buyerPart();
            case 1 -> sortByPrice(category);
            case 2 -> sortByBrand(category);
        }
        System.out.println("Enter the product number to see more or 0 to exit.");
        int prodNum = scanner.nextInt();
        if(prodNum==0){
            buyerPart();
        }
        else{
            market.readDevicesByID(category, prodNum);
        }
        System.out.println("0. Exit. ");
        System.out.println("1. Buy it.");
        int dilemma = scanner.nextInt();
        if(dilemma==1){
            categories.add(category);
            devices.add(market.returnModel(category,prodNum));
            productNumbs.add(prodNum);
            prices.add(market.returnPrice(category,prodNum));
            System.out.println("Added to basket successfully!");
            buyerPart();
        }
        else{
            buyerPart();
        }
    }
    public static void sortByPrice(String category){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. By ascending.");
        System.out.println("2. By descending.");
        System.out.println("3. By set prices.");
        int nextChoice = scanner.nextInt();
        switch (nextChoice) {
            case 1 -> market.sortDevicesByPriceAscending(category);
            case 2 -> market.sortDevicesByPriceDescending(category);
            case 3 -> {
                System.out.println("Enter start price: ");
                double startPrice = scanner.nextInt();
                System.out.println("Enter end price: ");
                double endPrice = scanner.nextInt();
                market.sortDevicesBySetPrice(category, startPrice, endPrice);
            }
        }
    }
    public static void sortByBrand(String category){
        Scanner scanner = new Scanner(System.in);
        market.readBrands(category);
        System.out.println("Choice brand: ");
        String brand = scanner.nextLine();
        market.readDevicesByBrand(category, brand);
    }
    public static void removeDevice(int productNum){
        int index = productNumbs.indexOf(productNum);
        if(index != -1){
            devices.remove(index);
            productNumbs.remove(index);
            prices.remove(index);
        }
    }
    public static void confirm() {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        for (Double price : prices) {
            total += price;
        }
        System.out.println("Total price: " + total);
        System.out.println("Confirm purchase (Y/N): ");
        String confirm = scanner.nextLine();
        if (confirm.equals("Y")) {
            System.out.println("The purchase was successful. Have a nice day!");
            try {
                for (int i = 0; i < devices.size(); i++) {
                    String category = categories.get(i);
                    int id = productNumbs.get(i);
                    market.deleteDevice(category, id);
                }
                devices.clear();
                categories.clear();
                productNumbs.clear();
                prices.clear();
            } catch (IndexOutOfBoundsException e) {
                buyerPart();
            }
        } else {
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
        double total = 0;
        for (Double price : prices) {
            total += price;
        }
        for (int i = 0; i < devices.size(); i++) {
            System.out.println("Product "+ (i+1));
            System.out.println("Model "+devices.get(i));
            System.out.println("ID "+ productNumbs.get(i));
            System.out.println("Price "+prices.get(i));
            System.out.println("--------------------");
        }
        System.out.println("Total price: "+total);
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

