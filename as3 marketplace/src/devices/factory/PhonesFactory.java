package devices.factory;

import devices.factory.interfaces.MFactory;
import devices.phones.*;

public class PhonesFactory implements MFactory {
    @Override
    public MobilePhone createMobilePhone(String brand, String model, double price, int ram, int memory, String screenSize, String camera, boolean dualSim) {
        return new MobilePhone(brand, model, price, ram, memory, screenSize, camera, dualSim);
    }

    @Override
    public Smartphone createSmartphone(String brand, String model, double price, int ram, int memory, String screenSize, String camera, String OS, boolean faceID, boolean fingerprintSensor) {
        return new Smartphone(brand, model, price, ram, memory, screenSize, camera, OS, faceID, fingerprintSensor);
    }
}
