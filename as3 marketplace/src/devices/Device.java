package devices;

public abstract class Device {
    private static int idCounter = 0;
    private String brand;
    private String model;
    private double price;
    private int id;

    public Device(String brand, String model, double price) {
        setBrand(brand);
        setModel(model);
        setPrice(price);
        setId(++idCounter);
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }
}
