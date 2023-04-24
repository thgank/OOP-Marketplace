package devices.factory.interfaces;

import devices.gadgets.*;

public interface GFactory {
    Headphones createHeadphones(String brand, String model, double price, String type, String audioQuality, boolean noiseCancel);
    Smartwatch createSmartwatch(String brand, String model, double price, String type, String operatingSystem, boolean fitnessTracker, boolean heartRate);
}
