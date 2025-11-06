package component.core;
import component.Component;

public class CPU extends Component{
    private int cores;
    private double clockSpeed;

    public CPU(String nama, double harga, int cores, double clockSpeed){
        super(nama, harga);
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    public int getCores(){
        return cores;
    }

    public double getClockSpeed(){
        return clockSpeed;
    }
}