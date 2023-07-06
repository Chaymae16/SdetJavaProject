package class17;

public class Laptop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchPad;
    boolean touchScreen;

    public Laptop(String make, String model, double batteryLife, int storage, boolean camera, boolean touchPad, boolean touchScreen) {
        this.make = make;
        this.model = model;
        this.batteryLife = batteryLife;
        this.storage = storage;
        this.camera = camera;
        this.touchPad = touchPad;
        this.touchScreen = touchScreen;
    }
}
