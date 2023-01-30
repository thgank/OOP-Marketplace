package devices;
import java.util.Scanner;
import java.sql.*;

import devices.gadgets.Headphones;
import devices.gadgets.Smartwatch;
import devices.phones.MobilePhone;
import devices.phones.Smartphone;
import devices.tablets.*;
import java.util.HashMap;
import java.util.Map;

public class Market {
    public void initMobilePhone() {
        Scanner scanner = new Scanner(System.in);
        Market market = new Market();
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
        MobilePhone mobilePhone = new MobilePhone(brand, model, price, ram, memory, screenSize, camera, dualSim);
        market.createMobilePhone(mobilePhone);
    }
    public void initHeadphones() {
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
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
        Headphones headphones = new Headphones(brand,model,price,type,audioQuality,noiseCancel);
        market.createHeadphones(headphones);
    }
    public void initSmartwatch() {
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
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
        Smartwatch smartwatch = new Smartwatch(brand, model, price, type, operatingSystem, fitnessTracker, heartRate);
        market.createSmartWatch(smartwatch);
    }
        public void initGameTablet(){
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
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
        GamingTablet gamingTablet = new GamingTablet(brand, model, price, stylusSup, keyboardSup, screenRatio, memory, ram, gpu, vrSupport);
        market.createGamingTablet(gamingTablet);
    }
    public void initSmartPhone(){
        Market market = new Market();
        Scanner scanner = new Scanner(System.in);
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
        Smartphone smartphone = new Smartphone(brand, model, price, ram, memory, screenSize, OS, camera, faceID, fingerprintSensor);
        market.createSmartphone(smartphone);
    }

    public void initDrawTablet(){
        Scanner scanner = new Scanner(System.in);
        Market market = new Market();
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
        DrawingTablet drawingTablet = new DrawingTablet(brand, model, price, stylusSup, keyboardSup, screenRatio, pressureSensitivity, true);
        market.createDrawingTablet(drawingTablet);
    }
    public void initBusTablet(){
        Scanner scanner = new Scanner(System.in);
        Market market = new Market();
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
        BusinessTablet businessTablet = new BusinessTablet(brand, model, price, stylusSup, keyboardSup, screenRatio, fingerprintScanner, facialRecognition);
        market.createBusTablet(businessTablet);
    }
    public void readDevices(String tableName) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + tableName + "\"");
            while (rs.next()) {
                System.out.println("ID: "+rs.getInt("id"));
                System.out.println("Model: "+rs.getString("model"));
                System.out.println("----------------------");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public double returnPrice(String tableName, int ID) {
        int price = 0;
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT price FROM public.\"" + tableName + "\" WHERE id = "+ID);
            while (rs.next()) {
                price = rs.getInt("price");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
        return price;
    }
    public String returnModel(String tableName, int ID) {
        String model = "";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT model FROM public.\"" + tableName + "\" WHERE id = "+ID);
            while (rs.next()) {
                model = rs.getString("model");
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
        return model;
    }
    public void readDevicesByID(String tableName, int ID) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM public.\"" + tableName + "\" WHERE id = "+ID);
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    if (metaData.getColumnType(i) == Types.BOOLEAN) {
                        boolean columnValue = rs.getBoolean(i);
                        System.out.println(columnValue ? "true" : "false");
                    } else {
                        System.out.println(metaData.getColumnName(i) + ": " +rs.getObject(i));
                    }
                }
                System.out.println();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void deleteDevice(String category, int id) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            PreparedStatement st = con.prepareStatement("DELETE FROM public.\""+category+"\" WHERE id = ?");
            st.setInt(1, id);
            int result = st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void createGamingTablet(GamingTablet gamingTablet) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            String sql = "INSERT INTO public.\"GamingTablet\" (brand, model, price, stylus_support, keyboard_support, screen_ratio, memory, ram, gpu, vr_support) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
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
            st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }

    }
    public void createBusTablet(BusinessTablet businessTablet) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            String sql = "INSERT INTO public.\"BusinessTablet\" (brand, model, price, stylus_support, keyboard_support, screen_ratio, fingerprint_scanner, facial_recognition) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, businessTablet.getBrand());
            st.setString(2, businessTablet.getModel());
            st.setDouble(3, businessTablet.getPrice());
            st.setBoolean(4, businessTablet.isStylusSup());
            st.setBoolean(5, businessTablet.isKeyboardSup());
            st.setString(6, businessTablet.getScreenRatio());
            st.setBoolean(7, businessTablet.isFingerprintScanner());
            st.setBoolean(8, businessTablet.isFacialRecognition());
            st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void createDrawingTablet(DrawingTablet drawingTablet) {
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            String sql = "INSERT INTO public.\"DrawingTablet\" (brand, model, price, stylus_support, keyboard_support, screen_ratio,pressure_sensitivity, eraser) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, drawingTablet.getBrand());
            st.setString(2, drawingTablet.getModel());
            st.setDouble(3, drawingTablet.getPrice());
            st.setBoolean(4, drawingTablet.isStylusSup());
            st.setBoolean(5, drawingTablet.isKeyboardSup());
            st.setString(6, drawingTablet.getScreenRatio());
            st.setInt(7, drawingTablet.getPressureSensitivity());
            st.setBoolean(8, drawingTablet.hasEraser());
            st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void createMobilePhone(MobilePhone mobilephone){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            String sql = "INSERT INTO public.\"MobilePhone\" (brand, model, price, ram, memory, screen_size, camera, dual_sim) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, mobilephone.getBrand());
            st.setString(2, mobilephone.getModel());
            st.setDouble(3, mobilephone.getPrice());
            st.setInt(4, mobilephone.getRam());
            st.setInt(5, mobilephone.getMemory());
            st.setString(6, mobilephone.getScreenSize());
            st.setString(7, mobilephone.getCamera());
            st.setBoolean(8, mobilephone.isDualSim());
            st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void createSmartphone(Smartphone smartphone){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            String sql = "INSERT INTO public.\"Smartphone\" (brand, model, price, ram, memory, screen_size, camera, os, face_id, fingerprint_sensor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
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
            st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void createSmartWatch(Smartwatch smartwatch){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            String sql = "INSERT INTO public.\"Smartwatch\" (brand, model, price, type, operating_system, fitness_tracker, heart_rate) VALUES (?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, smartwatch.getBrand());
            st.setString(2, smartwatch.getModel());
            st.setDouble(3, smartwatch.getPrice());
            st.setString(4, smartwatch.getType());
            st.setString(5, smartwatch.getOperatingSystem());
            st.setBoolean(6, smartwatch.isHeartRate());
            st.setBoolean(7, smartwatch.isFitnessTracker());
            st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void createHeadphones(Headphones headphones){
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            String sql = "INSERT INTO public.\"Headphones\" (brand, model, price, type, audio_quality, noise_cancel) VALUES (?, ?, ?, ?, ?, ?);";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, headphones.getBrand());
            st.setString(2, headphones.getModel());
            st.setDouble(3, headphones.getPrice());
            st.setString(4, headphones.getType());
            st.setString(5, headphones.getAudioQuality());
            st.setBoolean(6, headphones.isNoiseCancel());
            st.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
    public void updateProduct(int id, String category) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            PreparedStatement pstmt = null;
            switch (category) {
                case "Headphones": {
                    System.out.println("Enter the new brand: ");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter the new model: ");
                    String newModel = scanner.nextLine();
                    System.out.println("Enter the new price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine(); // consume the line separator
                    System.out.println("Enter the new type: ");
                    String type = scanner.nextLine();
                    System.out.println("Enter the new audio quality: ");
                    String newAudio_quality = scanner.nextLine();
                    System.out.println("Enter the new noise cancelling support (true/false): ");
                    boolean newNoise_Cancel = scanner.nextBoolean();
                    pstmt = con.prepareStatement("UPDATE public.\"Headphones\" SET brand = ?, model = ?, price = ?, type = ?, audio_quality = ?, noise_cancel = ? WHERE id = ?");
                    pstmt.setString(1, newBrand);
                    pstmt.setString(2, newModel);
                    pstmt.setDouble(3, newPrice);
                    pstmt.setString(4, type);
                    pstmt.setString(5, newAudio_quality);
                    pstmt.setBoolean(6, newNoise_Cancel);
                    pstmt.setInt(7, id);
                    break;
                }
                case "Smartwatch": {
                    System.out.println("Enter the new brand: ");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter the new model: ");
                    String newModel = scanner.nextLine();
                    System.out.println("Enter the new price: ");
                    double newPrice = scanner.nextDouble();
                    scanner.nextLine(); // consume the line separator
                    System.out.println("Enter the new type: ");
                    String type = scanner.nextLine();
                    System.out.println("Enter the new operating system: ");
                    String newOperating_system = scanner.nextLine();
                    System.out.println("Enter the new fitness tracker (true/false): ");
                    boolean newFitness_tracker = scanner.nextBoolean();
                    System.out.println("Enter the new heart rate (true/false): ");
                    boolean newHeart_rate = scanner.nextBoolean();
                    pstmt = con.prepareStatement("UPDATE public.\"Headphones\" SET brand = ?, model = ?, price = ?, type = ?, operating_system = ?, fitness_tracker = ?, heart_rate = ? WHERE id = ?");
                    pstmt.setString(1, newBrand);
                    pstmt.setString(2, newModel);
                    pstmt.setDouble(3, newPrice);
                    pstmt.setString(4, type);
                    pstmt.setString(5, newOperating_system);
                    pstmt.setBoolean(6, newFitness_tracker);
                    pstmt.setBoolean(7, newHeart_rate);
                    pstmt.setInt(8, id);
                    break;
                }
                case "Gaming tablet": {
                    System.out.println("Enter the new brand: ");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter the new model: ");
                    String newModel = scanner.nextLine();
                    System.out.println("Enter the new price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.println("Enter the new stylus support (true/false): ");
                    boolean newStylusSup = scanner.nextBoolean();
                    System.out.println("Enter the new keyboard support (true/false): ");
                    boolean newKeyboardSup = scanner.nextBoolean();
                    System.out.println("Enter the new screen ratio: ");
                    String newScreenRatio = scanner.nextLine();
                    System.out.println("Enter the new memory: ");
                    int newMemory = scanner.nextInt();
                    System.out.println("Enter the new RAM: ");
                    int newRam = scanner.nextInt();
                    System.out.println("Enter the new GPU: ");
                    String newGPU = scanner.nextLine();
                    System.out.println("Enter the new VR support (true/false): ");
                    boolean newVRSupport = scanner.nextBoolean();
                    pstmt = con.prepareStatement("UPDATE public.\"GamingTablet\" SET brand = ?, model = ?, price = ?, stylus_support = ?, keyboard_support = ?, screen_ratio = ?, memory = ?, ram = ?, gpu = ?, vr_support = ? WHERE id = ?");
                    pstmt.setString(1, newBrand);
                    pstmt.setString(2, newModel);
                    pstmt.setDouble(3, newPrice);
                    pstmt.setBoolean(4, newStylusSup);
                    pstmt.setBoolean(5, newKeyboardSup);
                    pstmt.setString(6, newScreenRatio);
                    pstmt.setInt(7, newMemory);
                    pstmt.setInt(8, newRam);
                    pstmt.setString(9, newGPU);
                    pstmt.setBoolean(10, newVRSupport);
                    pstmt.setInt(11, id);
                    break;
                }
                case "Drawing tablet": {
                    System.out.println("Enter the new brand: ");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter the new model: ");
                    String newModel = scanner.nextLine();
                    System.out.println("Enter the new price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.println("Enter the new stylus support (true/false): ");
                    boolean newStylusSup = scanner.nextBoolean();
                    System.out.println("Enter the new keyboard support (true/false): ");
                    boolean newKeyboardSup = scanner.nextBoolean();
                    System.out.println("Enter the new screen ratio: ");
                    String newScreenRatio = scanner.nextLine();
                    System.out.println("Enter the new pressure sensitivity: ");
                    int newPressureSensitivity = scanner.nextInt();
                    System.out.println("Enter the new eraser support (true/false): ");
                    boolean newEraser = scanner.nextBoolean();
                    pstmt = con.prepareStatement("UPDATE public.\"DrawingTablet\" SET brand = ?, model = ?, price = ?, stylus_support = ?, keyboard_support = ?, screen_ratio = ?, pressure_sensitivity = ?, eraser = ? WHERE id = ?");
                    pstmt.setString(1, newBrand);
                    pstmt.setString(2, newModel);
                    pstmt.setDouble(3, newPrice);
                    pstmt.setBoolean(4, newStylusSup);
                    pstmt.setBoolean(5, newKeyboardSup);
                    pstmt.setString(6, newScreenRatio);
                    pstmt.setInt(7, newPressureSensitivity);
                    pstmt.setBoolean(8, newEraser);
                    pstmt.setInt(9, id);
                    break;
                }
                case "Business tablet": {
                    System.out.println("Enter the new brand: ");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter the new model: ");
                    String newModel = scanner.nextLine();
                    System.out.println("Enter the new price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.println("Enter the new stylus support (true/false): ");
                    boolean newStylusSup = scanner.nextBoolean();
                    System.out.println("Enter the new keyboard support (true/false): ");
                    boolean newKeyboardSup = scanner.nextBoolean();
                    System.out.println("Enter the new screen ratio: ");
                    String newScreenRatio = scanner.nextLine();
                    System.out.println("Enter the new fingerprint scanner support (true/false): ");
                    boolean newFingerprintScanner = scanner.nextBoolean();
                    System.out.println("Enter the new facial recognition support (true/false): ");
                    boolean newFacialRecognition = scanner.nextBoolean();
                    pstmt = con.prepareStatement("UPDATE public.\"BusinessTablet\" SET brand = ?, model = ?, price = ?, stylus_support = ?, keyboard_support = ?, screen_ratio = ?, fingerprint_scanner = ?, facial_recognition = ? WHERE id = ?");
                    pstmt.setString(1, newBrand);
                    pstmt.setString(2, newModel);
                    pstmt.setDouble(3, newPrice);
                    pstmt.setBoolean(4, newStylusSup);
                    pstmt.setBoolean(5, newKeyboardSup);
                    pstmt.setString(6, newScreenRatio);
                    pstmt.setBoolean(7, newFingerprintScanner);
                    pstmt.setBoolean(8, newFacialRecognition);
                    pstmt.setInt(9, id);
                    break;
                }
                case "Mobile phone": {
                    System.out.println("Enter the new brand: ");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter the new model: ");
                    String newModel = scanner.nextLine();
                    System.out.println("Enter the new price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.println("Enter the new RAM: ");
                    int newRam = scanner.nextInt();
                    System.out.println("Enter the new memory: ");
                    int newMemory = scanner.nextInt();
                    System.out.println("Enter the new screen size: ");
                    String newScreenSize = scanner.nextLine();
                    System.out.println("Enter the new camera: ");
                    String newCamera = scanner.nextLine();
                    System.out.println("Enter the new dual sim support (true/false): ");
                    boolean newDualSim = scanner.nextBoolean();
                    pstmt = con.prepareStatement("UPDATE public.\"MobilePhone\" SET brand = ?, model = ?, price = ?, ram = ?, memory = ?, screen_size = ?, camera = ?, dual_sim = ? WHERE id = ?");
                    pstmt.setString(1, newBrand);
                    pstmt.setString(2, newModel);
                    pstmt.setDouble(3, newPrice);
                    pstmt.setInt(4, newRam);
                    pstmt.setInt(5, newMemory);
                    pstmt.setString(6, newScreenSize);
                    pstmt.setString(7, newCamera);
                    pstmt.setBoolean(8, newDualSim);
                    pstmt.setInt(9, id);
                    break;
                }
                case "Smartphone": {
                    System.out.println("Enter the new brand: ");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter the new model: ");
                    String newModel = scanner.nextLine();
                    System.out.println("Enter the new price: ");
                    double newPrice = scanner.nextDouble();
                    System.out.println("Enter the new RAM: ");
                    int newRam = scanner.nextInt();
                    System.out.println("Enter the new Memory: ");
                    int newMemory = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the new Screen Size: ");
                    String newScreenSize = scanner.nextLine();
                    System.out.println("Enter the new Camera: ");
                    String newCamera = scanner.nextLine();
                    System.out.println("Enter the new OS: ");
                    String newOS = scanner.nextLine();
                    System.out.println("Enter the new Face ID support (true/false): ");
                    boolean newFaceID = scanner.nextBoolean();
                    System.out.println("Enter the new Fingerprint Sensor support (true/false): ");
                    boolean newFingerprintSensor = scanner.nextBoolean();
                    pstmt = con.prepareStatement("UPDATE public.\"Smartphone\" SET brand = ?, model = ?, price = ?, ram = ?, memory = ?, screen_size = ?, camera = ?, os = ?, face_id = ?, fingerprint_sensor = ? WHERE id = ?");
                    pstmt.setString(1, newBrand);
                    pstmt.setString(2, newModel);
                    pstmt.setDouble(3, newPrice);
                    pstmt.setInt(4, newRam);
                    pstmt.setInt(5, newMemory);
                    pstmt.setString(6, newScreenSize);
                    pstmt.setString(7, newCamera);
                    pstmt.setString(8, newOS);
                    pstmt.setBoolean(9, newFaceID);
                    pstmt.setBoolean(10, newFingerprintSensor);
                    pstmt.setInt(11, id);
                    break;
                }
                default:
                    System.out.println("Invalid category");
                    return;
            }
            int i = pstmt.executeUpdate();
            System.out.println(i + " records updated");
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
}

