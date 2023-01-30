package devices.tablets;

public class DrawingTablet extends Tablet {
    private int pressureSensitivity;
    private boolean eraser;

    public DrawingTablet(String brand, String model, double price, boolean stylusSup, boolean keyboardSup, String screenRatio, int pressureSensitivity, boolean eraser) {
        super(brand, model, price, stylusSup, keyboardSup, screenRatio);
        setPressureSensitivity(pressureSensitivity);
        setEraser(eraser);
    }
    public void setEraser(boolean eraser) {
        this.eraser = eraser;
    }

    public void setPressureSensitivity(int pressureSensitivity) {
        this.pressureSensitivity = pressureSensitivity;
    }

    public int getPressureSensitivity() {
        return pressureSensitivity;
    }

    public boolean hasEraser() {
        return eraser;
    }
}

