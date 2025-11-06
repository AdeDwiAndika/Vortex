package component.peripheral;
import component.Component;

public class Monitor extends Component {
    private double ukuranInci;
    private int refreshRate;

    public Monitor(String nama, double harga, double ukuranInci, int refreshRate) {
        super(nama, harga);
        this.ukuranInci = ukuranInci;
        this.refreshRate = refreshRate;
    }

    public double getUkuranInci() {
        return ukuranInci;
    }

    public int getRefreshRate() {
        return refreshRate;
    }
}
