package component.core;
import component.Component;

public class Motherboard extends Component{
    private String socket;
    private String ukuran;
    
    public Motherboard(String nama, double harga, String socket, String ukuran){
        super(nama, harga);
        this.socket = socket;
        this.ukuran = ukuran;
    }

    public String getSocket(){
        return socket;
    }

    public String getUkuran(){
        return ukuran;
    }
}