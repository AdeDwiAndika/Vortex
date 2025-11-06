package component.peripheral;
import component.Component;

public class WifiCard extends Component {
    private String standarWiFi;
    private boolean memilikiBluetooth;

    public WifiCard(String nama, double harga, String standarWiFi, boolean memilikiBluetooth) {
        super(nama, harga);
        this.standarWiFi = standarWiFi;
        this.memilikiBluetooth = memilikiBluetooth;
    }

    public String getStandarWiFi() {
        return standarWiFi;
    }

    public boolean isMemilikiBluetooth() {
        return memilikiBluetooth;
    }
}
