package component.storage;
import component.Component;

public abstract class StorageDevice extends Component{
    private int kapasitas;

    public StorageDevice(String nama, double harga, int kapasitas){
        super(nama, harga);
        this.kapasitas = kapasitas;
    }

    public int getKapasitas(){
        return kapasitas;
    }
}