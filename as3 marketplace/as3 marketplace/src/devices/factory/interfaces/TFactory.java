package devices.factory.interfaces;
import devices.tablets.*;

public interface TFactory {
    BusinessTablet createBusinessTablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio, boolean fingerprintScanner, boolean facialRecognition);
    DrawingTablet createDrawingTablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio, int pressureSensitivity, boolean eraser);
    GamingTablet createGamingTablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio, int memory, int ram, String gpu, boolean vrSupport);
}
