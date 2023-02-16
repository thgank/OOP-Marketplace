package devices.phones;

public class Smartphone extends Phone {
    private String OS;
    private boolean faceID;
    private boolean fingerprintSensor;

    public Smartphone(String brand, String model, double price, int ram, int memory, String screenSize, String camera, String OS, boolean faceID, boolean fingerprintSensor) {
        super(brand, model, price, ram, memory, screenSize, camera);
        setOS(OS);
        setFaceID(faceID);
        setFingerprintSensor(fingerprintSensor);
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
    public String getOS() {
        return OS;
    }
    public void setFingerprintSensor(boolean fingerprintSensor) {
        this.fingerprintSensor = fingerprintSensor;
    }


    public void setFaceID(boolean faceID) {
        this.faceID = faceID;
    }

    public boolean isFaceID() {
        return faceID;
    }

    public boolean isFingerprintSensor() {
        return fingerprintSensor;
    }

}
