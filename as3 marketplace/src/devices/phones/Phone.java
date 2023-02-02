package devices.phones;

import devices.Device;

public class Phone extends Device {
    private int ram;
    private int memory;
    private String screenSize;
    private String camera;

    public Phone(String brand, String model, double price, int ram, int memory, String screenSize, String camera) {
        super(brand, model, price);
        setRam(ram);
        setMemory(memory);
        setScreenSize(screenSize);
        setCamera(camera);

    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getCamera() {
        return camera;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getScreenSize() {
        return screenSize;
    }
}

