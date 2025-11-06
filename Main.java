import component.*;
import component.core.*;
import component.storage.*;
import component.peripheral.*;
import system.PC;

public class Main {
    public static void main(String[] args) {
        // Membuat objek PC
        PC myPC = new PC();

        // ==== CORE COMPONENTS ====
        Motherboard motherboard = new Motherboard("ASUS ROG Strix B550-F", 2500000, "AM4", "ATX");
        CPU cpu = new CPU("AMD Ryzen 5 5600", 3200000, 6, 3.5);
        RAM ram = new RAM("Corsair Vengeance 16GB", 1200000, 16, 3200);

        myPC.setMotherboard(motherboard);
        myPC.setCPU(cpu);
        myPC.setRAM(ram);

        // ==== STORAGE DEVICES ====
        HDD hdd = new HDD("Seagate Barracuda", 700000, 1000, 7200);
        SSD ssd = new SSD("Samsung 970 EVO", 1500000, 512, "NVMe");

        myPC.addStorageDevice(hdd);
        myPC.addStorageDevice(ssd);

        // ==== PERIPHERALS ====
        Mouse mouse = new Mouse("Logitech G102", 250000, "USB", 8000);
        Keyboard keyboard = new Keyboard("Razer BlackWidow", 1800000, "USB", "Mechanical");
        Monitor monitor = new Monitor("Dell UltraSharp 24\"", 2500000, 24.0, 144);
        WebCam webcam = new WebCam("Logitech C920", 1000000, "1080p", true);
        WifiCard wifiCard = new WifiCard("TP-Link Archer T6E", 600000, "802.11ac", true);

        myPC.addPeripheral(mouse);
        myPC.addPeripheral(keyboard);
        myPC.addPeripheral(monitor);
        myPC.addPeripheral(webcam);
        myPC.addPeripheral(wifiCard);

        // ==== CETAK HASIL KONFIGURASI ====
        if (myPC.isValidConfiguration()) {
            System.out.println(myPC.getConfigurationDetails());
        } else {
            System.out.println("Konfigurasi PC belum lengkap! Pastikan komponen utama dan storage sudah diatur.");
        }
    }
}
