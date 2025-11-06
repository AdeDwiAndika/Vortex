package component.core;
import component.Component;

public class RAM extends Component{
    private int kecepatan;
    private int kapasitas;

    public RAM(String nama, double harga, int kecepatan, int kapasitas){
        super(nama, harga);
        this.kecepatan = kecepatan;
        this.kapasitas = kapasitas;
    }

    public int getKapasitasRam(){
        return kapasitas;
    }

    public int getKecepatanRam(){
        return kecepatan;
    }
}