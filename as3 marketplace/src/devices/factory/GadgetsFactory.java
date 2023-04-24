package devices.factory;

import devices.factory.interfaces.GFactory;
import devices.gadgets.*;

public class GadgetsFactory implements GFactory {
    @Override
    public Headphones createHeadphones(String brand, String model, double price, String type, String audioQuality, boolean noiseCancel) {
        return new Headphones(brand, model, price, type, audioQuality, noiseCancel);
    }

    @Override
    public Smartwatch createSmartwatch(String brand, String model, double price, String type, String operatingSystem, boolean fitnessTracker, boolean heartRate) {
        return new Smartwatch(brand, model, price, type, operatingSystem, fitnessTracker, heartRate);
    }
}
