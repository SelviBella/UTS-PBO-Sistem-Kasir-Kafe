/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Model;

/**
 *
 * @author ASUS
 */
public class MenuItem {
    private final String idItem; 
    protected String nama;
    protected double harga;

    
    public MenuItem(String idItem, String nama, double harga) {
        this.idItem = idItem;
        this.nama = nama;
        this.harga = harga;
    }

    
    public String getIdItem() {
        return idItem;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    
    public void tampilkanInfo() {
        System.out.println("ID Menu      : " + idItem);
        System.out.println("Nama Menu    : " + nama);
        System.out.println("Harga        : Rp" + harga);
    }

    
    public double hitungPotongan(double totalBelanja) {
        if (totalBelanja >= 100000) { 
            return totalBelanja * 0.1; 
        }
        return 0;
    }

    
    public double hitungPotongan(double totalBelanja, String kodePromo) {
        if (kodePromo.equals("MABA2026")) { 
            return totalBelanja * 0.15; 
        }
        return hitungPotongan(totalBelanja); 
    }
}
