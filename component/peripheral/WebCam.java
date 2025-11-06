package component.peripheral;
import component.Component;

public class WebCam extends Component {
    private String resolusi;
    private boolean memilikiMic;

    public WebCam(String nama, double harga, String resolusi, boolean memilikiMic) {
        super(nama, harga);
        this.resolusi = resolusi;
        this.memilikiMic = memilikiMic;
    }

    public String getResolusi() {
        return resolusi;
    }

    public boolean isMemilikiMic() {
        return memilikiMic;
    }
}
