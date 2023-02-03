package devices.gadgets;

public class Headphones extends Gadget {
    private String audioQuality;
    private boolean noiseCancel;

    public Headphones(String brand, String model, double price, String type, String audioQuality, boolean noiseCancel) {
        super(brand, model, price, type);
        setAudioQuality(audioQuality);
        setNoiseCancel(noiseCancel);
    }


    public void setAudioQuality(String audioQuality) {
        this.audioQuality = audioQuality;
    }

    public String getAudioQuality() {
        return audioQuality;
    }

    public void setNoiseCancel(boolean noiseCancel) {
        this.noiseCancel = noiseCancel;
    }

    public boolean isNoiseCancel() {
        return noiseCancel;
    }
}









// created by Nursultan Serikov SE-2224
