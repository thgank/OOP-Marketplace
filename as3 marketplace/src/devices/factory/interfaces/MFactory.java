package devices.factory.interfaces;
import devices.phones.*;

public interface MFactory {
    MobilePhone createMobilePhone(String brand, String model, double price, int ram, int memory, String screenSize, String camera, boolean dualSim);
    Smartphone createSmartphone(String brand, String model, double price, int ram, int memory, String screenSize, String camera, String OS, boolean faceID, boolean fingerprintSensor);
}
