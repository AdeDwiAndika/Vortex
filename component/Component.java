package component;

public abstract class Component{
    protected String nama;
    protected double harga;

    public Component(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public String getComponentInfo() {
        return nama + " - Rp" + harga;
    }

}