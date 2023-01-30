package devices.tablets;

public class BusinessTablet extends Tablet {
    private boolean fingerprintScanner;
    private boolean facialRecognition;
    public BusinessTablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio, boolean fingerprintScanner, boolean facialRecognition) {
        super(brand, model, price, stylusSup, keyboardSup, screenRatio);
        setFacialRecognition(facialRecognition);
        setFingerprintScanner(fingerprintScanner);
    }

    public void setFingerprintScanner(boolean fingerprintScanner) {
        this.fingerprintScanner = fingerprintScanner;
    }

    public boolean isFingerprintScanner() {
        return fingerprintScanner;
    }

    public void setFacialRecognition(boolean facialRecognition) {
        this.facialRecognition = facialRecognition;
    }

    public boolean isFacialRecognition() {
        return facialRecognition;
    }
}
