package component.storage;
import component.storage.StorageDevice;

public class SSD extends StorageDevice {
    private String tipe; 

    public SSD(String nama, double harga, int kapasitas, String tipe) {
        super(nama, harga, kapasitas);
        this.tipe = tipe;
    }

    public String getTipe() {
        return tipe;
    }
}
