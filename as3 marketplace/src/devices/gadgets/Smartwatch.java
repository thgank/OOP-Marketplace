package devices.gadgets;

public class Smartwatch  extends Gadget{
    private String operatingSystem;
    private boolean fitnessTracker;
    private boolean heartRate;

    public Smartwatch(String brand, String model, double price, String type, String operatingSystem, boolean fitnessTracker, boolean heartRate) {
        super(brand, model, price, type);
        setOperatingSystem(operatingSystem);
        setFitnessTracker(fitnessTracker);
        setHeartRate(heartRate);
    }


    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setFitnessTracker(boolean fitnessTracker) {
        this.fitnessTracker = fitnessTracker;
    }

    public void setHeartRate(boolean heartRate) {
        this.heartRate = heartRate;
    }

    public boolean isFitnessTracker() {
        return fitnessTracker;
    }

    public boolean isHeartRate() {
        return heartRate;
    }

}






// created by Nursultan Serikov SE-2224
