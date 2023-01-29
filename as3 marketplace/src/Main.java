import devices.*;
import devices.tablets.*;
import devices.gadgets.*;
import devices.phones.*;
import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the TakePhone store!");
        System.out.println("Time to sign up! Are you buyer (1), or a seller?(2)");
        int choice = scanner.nextInt();
        if (choice == 1) {
            System.out.println("Welcome to the Hardware Store! You are now a buyer.");
            while(true) {
                System.out.println("Please select a category:");
                System.out.println("1. Headphones");
                System.out.println("2. Smartwatches");
                System.out.println("3. Gaming Tablets");
                System.out.println("4. Drawing Tablets");
                System.out.println("5. Business Tablets");
                System.out.println("6. Mobile Phones");
                System.out.println("7. Smartphones");
                int category = scanner.nextInt();
                switch (category) {
                    case 1:
                        System.out.println("You selected Headphones. Please select a product to view its details.");
                        market.readDevices("Headphones");
                        break;
                    case 2:
                        System.out.println("You selected Smartwatches. Please select a product to view its details.");
                        // Code to display available smartwatches and view details
                        break;
                    case 3:
                        System.out.println("You selected Gaming Tablets. Please select a product to view its details.");
                        market.readDevices("GamingTablet");
                        break;
                    case 4:
                        System.out.println("You selected Drawing Tablets. Please select a product to view its details.");
                        // Code to display available drawing tablets and view details
                        break;
                    case 5:
                        System.out.println("You selected Business Tablets. Please select a product to view its details.");
                        // Code to display available business tablets and view details
                        break;
                    case 6:
                        System.out.println("You selected Mobile Phones. Please select a product to view its details.");
                        // Code to display available mobile phones and view details
                        break;
                    case 7:
                        // Code to display available smartphones and view details
                        System.out.println("You selected Smartphones. Please select a product to view its details.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                        break;
                }
            }
        }
    }
}

