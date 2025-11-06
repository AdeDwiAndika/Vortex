package system;

import component.*;
import component.core.*;
import component.storage.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class PC {
    // Composition (owned by PC)
    private Motherboard motherboard;
    private CPU cpu;
    private RAM ram;
    
    // Aggregation (shared/independent lifecycle)
    private List<StorageDevice> storageDevices;
    private List<Component> peripherals;
    
    public PC() {
        this.storageDevices = new ArrayList<>();
        this.peripherals = new ArrayList<>();
    }
    
    // Setters untuk core components
    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    
    public void setCPU(CPU cpu) {
        this.cpu = cpu;
    }
    
    public void setRAM(RAM ram) {
        this.ram = ram;
    }
    
    // Methods untuk add storage dan peripheral
    public void addStorageDevice(StorageDevice storage) {
        this.storageDevices.add(storage);
    }
    
    public void addPeripheral(Component peripheral) {
        this.peripherals.add(peripheral);
    }
    
    // Method utama: calculateTotalPrice
    // HASIL REFACTORING
    public double calculateTotalPrice() {
        double total = 0;
        List<Component> allComponents = new ArrayList<>();
        
        // Hitung komponen core
        if (motherboard != null) allComponents.add(motherboard);
        if (cpu != null) allComponents.add(cpu);
        if (ram != null) allComponents.add(ram);

        allComponents.addAll(storageDevices);
        allComponents.addAll(peripherals);
        
        // Hitung storage devices & peripheral
        for (Component c : allComponents) {
            total += c.getHarga();
        }
        
        return total;
    }
    
    // Validasi konfigurasi
    public boolean isValidConfiguration() {
        return motherboard != null && cpu != null && ram != null && !storageDevices.isEmpty(); // Minimal 1 storage
    }

    private String formatRupiah(double nilai) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator('.');
        symbols.setDecimalSeparator(',');

        DecimalFormat df = new DecimalFormat("#,###.00", symbols);
        return "Rp" + df.format(nilai);
    }

    // REFACTORING
    private String getCoreDetails(){
        StringBuilder sb = new StringBuilder();
        if (motherboard != null) sb.append("Motherboard: ").append(motherboard.getComponentInfo()).append("\n");
        if (cpu != null) sb.append("CPU: ").append(cpu.getComponentInfo()).append("\n");
        if (ram != null) sb.append("RAM: ").append(ram.getComponentInfo()).append("\n");
        sb.append("\n");
        return sb.toString();
    }

    private String getStorageDetails() {
        StringBuilder sb = new StringBuilder("Storage Devices:\n");
        for (StorageDevice s : storageDevices) {
            sb.append("- ").append(s.getComponentInfo()).append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }

    private String getPeripheralDetails() {
        StringBuilder sb = new StringBuilder("Peripherals:\n");
        for (Component p : peripherals) {
            sb.append("- ").append(p.getComponentInfo()).append("\n");
        }
        sb.append("\n");
        return sb.toString();
    }
    
    public String getConfigurationDetails() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== PC Configuration ===\n\n");
        sb.append(getCoreDetails());
        sb.append(getStorageDetails());
        sb.append(getPeripheralDetails());
        sb.append("\nTotal Price: ").append(formatRupiah(calculateTotalPrice()));
        sb.append("\n\n=== PC Configuration ===");
        return sb.toString();
    }
}