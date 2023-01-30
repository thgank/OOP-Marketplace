import devices.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> devices = new ArrayList<>();
    public static ArrayList<String> categories = new ArrayList<>();
    public static ArrayList<Integer> productNums = new ArrayList<>();
    public static ArrayList<Double> prices = new ArrayList<>();
    public static ArrayList<String> sellers = new ArrayList<>();

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

    public static void sellerPart() {
        if (sellers.isEmpty()) {
            sellers.add("PhoneDeal");
            sellers.add("GadgetsEverywhere");
            sellers.add("ZhakaPhones");
            sellers.add("AnuarShop");
        }
        System.out.println("List of sellers: " + sellers);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to add a new seller? (yes/no)");
        String answer = scanner.nextLine();

        if (answer.equalsIgnoreCase("yes")) {
            createSeller();
            sellerPart();
        }
    }

    public static void createSeller() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the new seller: ");
        String newSeller = scanner.nextLine();
        sellers.add(newSeller);
    }
    public static void buyerPart() {
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Buyer Part ---");
        while (true) {
            System.out.println("Choose the product category you are interested in:");
            System.out.println("1. Headphones");
            System.out.println("2. Smartwatch");
            System.out.println("3. Gaming tablet");
            System.out.println("4. Drawing tablet");
            System.out.println("5. Business tablet");
            System.out.println("6. Mobile phone");
            System.out.println("7. Smartphone");
            System.out.println("8. print basket: ");
            System.out.println("Enter the category:");
            int choice = scanner.nextInt();
            String category = scanner.nextLine();
            switch (choice) {
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
            System.out.println("If you want to buy it, press 1, if you want to exit press 0.");
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

