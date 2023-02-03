package devices.gadgets;

import devices.Device;

public class Gadget extends Device {
    private String type;

    public Gadget(String brand, String model, double price, String type) {
        super(brand, model, price);
        setType(type);
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}








// created by Nursultan Serikov SE-2224
