package devices.factory;

import devices.factory.interfaces.TFactory;
import devices.tablets.*;

public class TabletFactory implements TFactory {
    @Override
    public BusinessTablet createBusinessTablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio, boolean fingerprintScanner, boolean facialRecognition) {
        return new BusinessTablet(brand, model, price, stylusSup, keyboardSup, screenRatio, fingerprintScanner, facialRecognition);
    }

    @Override
    public DrawingTablet createDrawingTablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio, int pressureSensitivity, boolean eraser) {
        return new DrawingTablet(brand, model, price, stylusSup, keyboardSup, screenRatio, pressureSensitivity, eraser);
    }

    @Override
    public GamingTablet createGamingTablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio, int memory, int ram, String gpu, boolean vrSupport) {
        return new GamingTablet(brand, model, price, stylusSup, keyboardSup, screenRatio, memory, ram, gpu, vrSupport);
    }
}
