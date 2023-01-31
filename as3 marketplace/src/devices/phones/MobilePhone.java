package devices.phones;

public class MobilePhone extends Phone {
    private boolean dualSim;
    public MobilePhone(String brand, String model, double price, int ram, int memory, String screenSize, String camera, boolean dualSim) {
        super(brand, model, price, ram, memory, screenSize, camera);
        setDualSim(dualSim);
    }

    public void setDualSim(boolean dualSim) {
        this.dualSim = dualSim;
    }

    public boolean isDualSim() {
        return dualSim;
    }
}
