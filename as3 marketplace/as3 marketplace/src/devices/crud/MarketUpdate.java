package devices.crud;

import java.sql.*;
import java.util.*;

public class MarketUpdate extends MarketRead{
    public void updateProduct(int id, String category) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/as3help", "postgres", "mercytop38");
            PreparedStatement preparedStatement;
            switch (category) {
                case "Headphones" -> {
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
                    preparedStatement = con.prepareStatement("UPDATE public.\"Headphones\" SET brand = ?, model = ?, price = ?, type = ?, audio_quality = ?, noise_cancel = ? WHERE id = ?");
                    preparedStatement.setString(1, newBrand);
                    preparedStatement.setString(2, newModel);
                    preparedStatement.setDouble(3, newPrice);
                    preparedStatement.setString(4, type);
                    preparedStatement.setString(5, newAudio_quality);
                    preparedStatement.setBoolean(6, newNoise_Cancel);
                    preparedStatement.setInt(7, id);
                }
                case "Smartwatch" -> {
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
                    preparedStatement = con.prepareStatement("UPDATE public.\"Headphones\" SET brand = ?, model = ?, price = ?, type = ?, operating_system = ?, fitness_tracker = ?, heart_rate = ? WHERE id = ?");
                    preparedStatement.setString(1, newBrand);
                    preparedStatement.setString(2, newModel);
                    preparedStatement.setDouble(3, newPrice);
                    preparedStatement.setString(4, type);
                    preparedStatement.setString(5, newOperating_system);
                    preparedStatement.setBoolean(6, newFitness_tracker);
                    preparedStatement.setBoolean(7, newHeart_rate);
                    preparedStatement.setInt(8, id);
                }
                case "Gaming tablet" -> {
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
                    preparedStatement = con.prepareStatement("UPDATE public.\"GamingTablet\" SET brand = ?, model = ?, price = ?, stylus_support = ?, keyboard_support = ?, screen_ratio = ?, memory = ?, ram = ?, gpu = ?, vr_support = ? WHERE id = ?");
                    preparedStatement.setString(1, newBrand);
                    preparedStatement.setString(2, newModel);
                    preparedStatement.setDouble(3, newPrice);
                    preparedStatement.setBoolean(4, newStylusSup);
                    preparedStatement.setBoolean(5, newKeyboardSup);
                    preparedStatement.setString(6, newScreenRatio);
                    preparedStatement.setInt(7, newMemory);
                    preparedStatement.setInt(8, newRam);
                    preparedStatement.setString(9, newGPU);
                    preparedStatement.setBoolean(10, newVRSupport);
                    preparedStatement.setInt(11, id);
                }
                case "Drawing tablet" -> {
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
                    preparedStatement = con.prepareStatement("UPDATE public.\"DrawingTablet\" SET brand = ?, model = ?, price = ?, stylus_support = ?, keyboard_support = ?, screen_ratio = ?, pressure_sensitivity = ?, eraser = ? WHERE id = ?");
                    preparedStatement.setString(1, newBrand);
                    preparedStatement.setString(2, newModel);
                    preparedStatement.setDouble(3, newPrice);
                    preparedStatement.setBoolean(4, newStylusSup);
                    preparedStatement.setBoolean(5, newKeyboardSup);
                    preparedStatement.setString(6, newScreenRatio);
                    preparedStatement.setInt(7, newPressureSensitivity);
                    preparedStatement.setBoolean(8, newEraser);
                    preparedStatement.setInt(9, id);
                }
                case "Business tablet" -> {
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
                    preparedStatement = con.prepareStatement("UPDATE public.\"BusinessTablet\" SET brand = ?, model = ?, price = ?, stylus_support = ?, keyboard_support = ?, screen_ratio = ?, fingerprint_scanner = ?, facial_recognition = ? WHERE id = ?");
                    preparedStatement.setString(1, newBrand);
                    preparedStatement.setString(2, newModel);
                    preparedStatement.setDouble(3, newPrice);
                    preparedStatement.setBoolean(4, newStylusSup);
                    preparedStatement.setBoolean(5, newKeyboardSup);
                    preparedStatement.setString(6, newScreenRatio);
                    preparedStatement.setBoolean(7, newFingerprintScanner);
                    preparedStatement.setBoolean(8, newFacialRecognition);
                    preparedStatement.setInt(9, id);
                }
                case "Mobile phone" -> {
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
                    preparedStatement = con.prepareStatement("UPDATE public.\"MobilePhone\" SET brand = ?, model = ?, price = ?, ram = ?, memory = ?, screen_size = ?, camera = ?, dual_sim = ? WHERE id = ?");
                    preparedStatement.setString(1, newBrand);
                    preparedStatement.setString(2, newModel);
                    preparedStatement.setDouble(3, newPrice);
                    preparedStatement.setInt(4, newRam);
                    preparedStatement.setInt(5, newMemory);
                    preparedStatement.setString(6, newScreenSize);
                    preparedStatement.setString(7, newCamera);
                    preparedStatement.setBoolean(8, newDualSim);
                    preparedStatement.setInt(9, id);
                }
                case "Smartphone" -> {
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
                    preparedStatement = con.prepareStatement("UPDATE public.\"Smartphone\" SET brand = ?, model = ?, price = ?, ram = ?, memory = ?, screen_size = ?, camera = ?, os = ?, face_id = ?, fingerprint_sensor = ? WHERE id = ?");
                    preparedStatement.setString(1, newBrand);
                    preparedStatement.setString(2, newModel);
                    preparedStatement.setDouble(3, newPrice);
                    preparedStatement.setInt(4, newRam);
                    preparedStatement.setInt(5, newMemory);
                    preparedStatement.setString(6, newScreenSize);
                    preparedStatement.setString(7, newCamera);
                    preparedStatement.setString(8, newOS);
                    preparedStatement.setBoolean(9, newFaceID);
                    preparedStatement.setBoolean(10, newFingerprintSensor);
                    preparedStatement.setInt(11, id);
                }
                default -> {
                    System.out.println("Invalid category");
                    return;
                }
            }
            int i = preparedStatement.executeUpdate();
            System.out.println(i + " records updated");
            con.close();
        } catch (Exception e) {
            System.out.println("exception: " + e.getMessage());
        }
    }
}
