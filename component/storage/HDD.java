package component.storage;
import component.storage.StorageDevice;

public class HDD extends StorageDevice {
    private int rpm; 

    public HDD(String nama, double harga, int kapasitas, int rpm) {
        super(nama, harga, kapasitas);
        this.rpm = rpm;
    }

    public int getRpm() {
        return rpm;
    }
}