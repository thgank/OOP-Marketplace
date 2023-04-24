package devices.tablets;

public class GamingTablet extends Tablet {
    private String gpu;
    private boolean vrSupport;
    private int memory;
    private int ram;


    public GamingTablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio, int memory, int ram, String gpu, boolean vrSupport) {
        super(brand, model, price, stylusSup, keyboardSup, screenRatio);
        setMemory(memory);
        setRam(ram);
        setGpu(gpu);
        setVrSupport(vrSupport);
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

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public String getGpu() {
        return gpu;
    }

    public void setVrSupport(boolean vrSupport) {
        this.vrSupport = vrSupport;
    }

    public boolean isVrSupport() {
        return vrSupport;
    }

    @Override
    public boolean isStylusSup() {
        return super.isStylusSup();
    }

    @Override
    public boolean isKeyboardSup() {
        return super.isKeyboardSup();
    }
}
