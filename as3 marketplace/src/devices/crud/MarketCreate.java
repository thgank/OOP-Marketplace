package devices.crud;
import java.util.*;
import java.sql.*;
import devices.gadgets.*;
import devices.phones.*;
import devices.tablets.*;
import devices.factory.*;


public class MarketCreate {
    public static GadgetsFactory gadgetsFactory = new GadgetsFactory();
    public static PhonesFactory phonesFactory = new PhonesFactory();
    public static TabletFactory tabletFactory = new TabletFactory();
    public void initDevice(String login, int choice) {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case 1 -> {
                System.out.println("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.println("Enter model: ");
                String model = scanner.nextLine();
                System.out.println("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter type: ");
                String type = scanner.nextLine();
                System.out.println("Enter Audio Quality");
                String audioQuality = scanner.nextLine();
                System.out.println("Enter Noise Cancel (true/false): ");
                boolean noiseCancel = Boolean.parseBoolean(scanner.nextLine());
                Headphones headphones = gadgetsFactory.createHeadphones(brand, model, price, type, audioQuality, noiseCancel);
                try {
                    Class.forName("org.postgresql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
                    String sql = "INSERT INTO public.\"Headphones\" (brand, model, price, type, audio_quality, noise_cancel, seller) VALUES (?, ?, ?, ?, ?, ?, ?);";
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, headphones.getBrand());
                    st.setString(2, headphones.getModel());
                    st.setDouble(3, headphones.getPrice());
                    st.setString(4, headphones.getType());
                    st.setString(5, headphones.getAudioQuality());
                    st.setBoolean(6, headphones.isNoiseCancel());
                    st.setString(7, login);
                    st.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println("exception: " + e.getMessage());
                }
            }
            case 2 -> {
                System.out.println("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.println("Enter model: ");
                String model = scanner.nextLine();
                System.out.println("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter type: ");
                String type = scanner.nextLine();
                System.out.println("Enter operating system: ");
                String operatingSystem = scanner.nextLine();
                System.out.println("Enter Heart Rate (true/false): ");
                boolean heartRate = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter Fitness Tracker (true/false): ");
                boolean fitnessTracker = Boolean.parseBoolean(scanner.nextLine());
                Smartwatch smartwatch = gadgetsFactory.createSmartwatch(brand, model, price, type, operatingSystem, fitnessTracker, heartRate);
                try {
                    Class.forName("org.postgresql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
                    String sql = "INSERT INTO public.\"Smartwatch\" (brand, model, price, type, operating_system, fitness_tracker, heart_rate, seller) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, smartwatch.getBrand());
                    st.setString(2, smartwatch.getModel());
                    st.setDouble(3, smartwatch.getPrice());
                    st.setString(4, smartwatch.getType());
                    st.setString(5, smartwatch.getOperatingSystem());
                    st.setBoolean(6, smartwatch.isHeartRate());
                    st.setBoolean(7, smartwatch.isFitnessTracker());
                    st.setString(8, login);
                    st.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println("exception: " + e.getMessage());
                }
            }
            case 3 -> {
                System.out.println("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.println("Enter model: ");
                String model = scanner.nextLine();
                System.out.println("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter stylus support (true/false): ");
                boolean stylusSup = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter keyboard support (true/false): ");
                boolean keyboardSup = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter screen ratio: ");
                String screenRatio = scanner.nextLine();
                System.out.println("Enter memory: ");
                int memory = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter ram: ");
                int ram = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter GPU: ");
                String gpu = scanner.nextLine();
                System.out.println("Enter VR support (true/false): ");
                boolean vrSupport = Boolean.parseBoolean(scanner.nextLine());
                GamingTablet gamingTablet = tabletFactory.createGamingTablet(brand, model, price, stylusSup, keyboardSup, screenRatio, memory, ram, gpu, vrSupport);
                try {
                    Class.forName("org.postgresql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
                    String sql = "INSERT INTO public.\"GamingTablet\" (brand, model, price, stylus_support, keyboard_support, screen_ratio, memory, ram, gpu, vr_support, seller) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, gamingTablet.getBrand());
                    st.setString(2, gamingTablet.getModel());
                    st.setDouble(3, gamingTablet.getPrice());
                    st.setBoolean(4, gamingTablet.isStylusSup());
                    st.setBoolean(5, gamingTablet.isKeyboardSup());
                    st.setString(6, gamingTablet.getScreenRatio());
                    st.setInt(7, gamingTablet.getMemory());
                    st.setInt(8, gamingTablet.getRam());
                    st.setString(9, gamingTablet.getGpu());
                    st.setBoolean(10, gamingTablet.isVrSupport());
                    st.setString(11, login);
                    st.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println("exception: " + e.getMessage());
                }
            }
            case 4 -> {
                System.out.println("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.println("Enter model: ");
                String model = scanner.nextLine();
                System.out.println("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter stylus support (true/false): ");
                boolean stylusSup = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter keyboard support (true/false): ");
                boolean keyboardSup = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter screen ratio: ");
                String screenRatio = scanner.nextLine();
                System.out.println("Enter Sensure Pressitivity: ");
                int pressureSensitivity = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter eraser support (true/false): ");
                boolean eraser = Boolean.parseBoolean(scanner.nextLine());
                DrawingTablet drawingTablet = tabletFactory.createDrawingTablet(brand, model, price, stylusSup, keyboardSup, screenRatio, pressureSensitivity, eraser);
                try {
                    Class.forName("org.postgresql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
                    String sql = "INSERT INTO public.\"DrawingTablet\" (brand, model, price, stylus_support, keyboard_support, screen_ratio,pressure_sensitivity, eraser, seller) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, drawingTablet.getBrand());
                    st.setString(2, drawingTablet.getModel());
                    st.setDouble(3, drawingTablet.getPrice());
                    st.setBoolean(4, drawingTablet.isStylusSup());
                    st.setBoolean(5, drawingTablet.isKeyboardSup());
                    st.setString(6, drawingTablet.getScreenRatio());
                    st.setInt(7, drawingTablet.getPressureSensitivity());
                    st.setBoolean(8, drawingTablet.hasEraser());
                    st.setString(9, login);
                    st.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println("exception: " + e.getMessage());
                }
            }
            case 5 -> {
                System.out.println("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.println("Enter model: ");
                String model = scanner.nextLine();
                System.out.println("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter stylus support (true/false): ");
                boolean stylusSup = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter keyboard support (true/false): ");
                boolean keyboardSup = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter screen ratio: ");
                String screenRatio = scanner.nextLine();
                System.out.println("Enter Facial Recognition scanner support (true/false): ");
                boolean facialRecognition = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter Finger Print scanner support (true/false): ");
                boolean fingerprintScanner = Boolean.parseBoolean(scanner.nextLine());
                BusinessTablet businessTablet = tabletFactory.createBusinessTablet(brand, model, price, stylusSup, keyboardSup, screenRatio, fingerprintScanner, facialRecognition);
                try {
                    Class.forName("org.postgresql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
                    String sql = "INSERT INTO public.\"BusinessTablet\" (brand, model, price, stylus_support, keyboard_support, screen_ratio, fingerprint_scanner, facial_recognition, seller) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, businessTablet.getBrand());
                    st.setString(2, businessTablet.getModel());
                    st.setDouble(3, businessTablet.getPrice());
                    st.setBoolean(4, businessTablet.isStylusSup());
                    st.setBoolean(5, businessTablet.isKeyboardSup());
                    st.setString(6, businessTablet.getScreenRatio());
                    st.setBoolean(7, businessTablet.isFingerprintScanner());
                    st.setBoolean(8, businessTablet.isFacialRecognition());
                    st.setString(9, login);
                    st.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println("exception: " + e.getMessage());
                }
            }
            case 6 -> {
                System.out.println("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.println("Enter model: ");
                String model = scanner.nextLine();
                System.out.println("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter memory: ");
                int memory = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter ram: ");
                int ram = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter screen size: ");
                String screenSize = scanner.nextLine();
                System.out.println("Enter camera: ");
                String camera = scanner.nextLine();
                System.out.println("Enter Dual Sim (true/false): ");
                boolean dualSim = Boolean.parseBoolean(scanner.nextLine());
                MobilePhone mobilePhone = phonesFactory.createMobilePhone(brand, model, price, ram, memory, screenSize, camera, dualSim);
                try {
                    Class.forName("org.postgresql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
                    String sql = "INSERT INTO public.\"MobilePhone\" (brand, model, price, ram, memory, screen_size, camera, dual_sim, seller) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, mobilePhone.getBrand());
                    st.setString(2, mobilePhone.getModel());
                    st.setDouble(3, mobilePhone.getPrice());
                    st.setInt(4, mobilePhone.getRam());
                    st.setInt(5, mobilePhone.getMemory());
                    st.setString(6, mobilePhone.getScreenSize());
                    st.setString(7, mobilePhone.getCamera());
                    st.setBoolean(8, mobilePhone.isDualSim());
                    st.setString(9, login);
                    st.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println("exception: " + e.getMessage());
                }

            }
            case 7 -> {
                System.out.println("Enter brand: ");
                String brand = scanner.nextLine();
                System.out.println("Enter model: ");
                String model = scanner.nextLine();
                System.out.println("Enter price: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter memory: ");
                int memory = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter ram: ");
                int ram = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter screen size: ");
                String screenSize = scanner.nextLine();
                System.out.println("Enter OS: ");
                String OS = scanner.nextLine();
                System.out.println("Enter camera: ");
                String camera = scanner.nextLine();
                System.out.println("Enter Face ID (true/false): ");
                boolean faceID = Boolean.parseBoolean(scanner.nextLine());
                System.out.println("Enter Fingerprint Sensor (true/false): ");
                boolean fingerprintSensor = Boolean.parseBoolean(scanner.nextLine());
                Smartphone smartphone = phonesFactory.createSmartphone(brand, model, price, ram, memory, screenSize, OS, camera, faceID, fingerprintSensor);
                try {
                    Class.forName("org.postgresql.Driver");
                    Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
                    String sql = "INSERT INTO public.\"Smartphone\" (brand, model, price, ram, memory, screen_size, camera, os, face_id, fingerprint_sensor, seller) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
                    PreparedStatement st = con.prepareStatement(sql);
                    st.setString(1, smartphone.getBrand());
                    st.setString(2, smartphone.getModel());
                    st.setDouble(3, smartphone.getPrice());
                    st.setInt(4, smartphone.getRam());
                    st.setInt(5, smartphone.getMemory());
                    st.setString(6, smartphone.getScreenSize());
                    st.setString(7, smartphone.getCamera());
                    st.setString(8, smartphone.getOS());
                    st.setBoolean(9, smartphone.isFaceID());
                    st.setBoolean(10, smartphone.isFingerprintSensor());
                    st.setString(11, login);
                    st.executeUpdate();
                    con.close();
                } catch (Exception e) {
                    System.out.println("exception: " + e.getMessage());
                }
            }
        }
        System.out.println("Created successfully!");
    }
    public void createSeller(String name, String password) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "password");
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO public.sellers(login, password) VALUES ('" + name + "', '" + password + "')");
            System.out.println("Seller created successfully!");
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
}
