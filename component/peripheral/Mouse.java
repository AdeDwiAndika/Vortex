package component.peripheral;
import component.Component;

public class Mouse extends Component{
    private String tipeKoneksi;
    private int dpi;

    public Mouse(String nama, double harga, String tipeKoneksi, int dpi){
        super(nama, harga);
        this.tipeKoneksi = tipeKoneksi;
        this.dpi = dpi;
    }

    public String getTipeKoneksi(){
        return tipeKoneksi;
    }

    public int getDpi(){
        return dpi;
    }
}