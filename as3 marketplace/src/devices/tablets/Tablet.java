package devices.tablets;

import devices.Device;

public class Tablet extends Device {
    private boolean stylusSup;
    private boolean keyboardSup;
    private String screenRatio;



    public Tablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio) {
        super(brand, model, price);
        setStylusSup(stylusSup);
        setKeyboardSup(keyboardSup);
        setScreenRatio(screenRatio);
    }


    public void setScreenRatio(String screenRatio) {
        this.screenRatio = screenRatio;
    }

    public String getScreenRatio() {
        return screenRatio;
    }

    public boolean isKeyboardSup() {
        return keyboardSup;
    }

    public boolean isStylusSup() {
        return stylusSup;
    }

    public void setStylusSup(boolean stylusSup) {
        this.stylusSup = stylusSup;
    }

    public void setKeyboardSup(boolean keyboardSup) {
        this.keyboardSup = keyboardSup;
    }
}
