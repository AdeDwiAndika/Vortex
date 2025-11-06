package component.peripheral;
import component.Component;

public class Keyboard extends Component {
    private String tipeKoneksi;
    private String jenisSwitch;

    public Keyboard(String nama, double harga, String tipeKoneksi, String jenisSwitch) {
        super(nama, harga);
        this.tipeKoneksi = tipeKoneksi;
        this.jenisSwitch = jenisSwitch;
    }

    public String getTipeKoneksi() {
        return tipeKoneksi;
    }

    public String getJenisSwitch() {
        return jenisSwitch;
    }
}
