/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Minuman extends MenuItem {
    private String tingkatKemanisan;
    
    public Minuman(String idItem, String nama, double harga, String tingkatKemanisan) {
        super(idItem, nama, harga);
        this.tingkatKemanisan = tingkatKemanisan;
    }
    
    public void setTingkatKemanisan(String tingkatKemanisan) {
        this.tingkatKemanisan = tingkatKemanisan;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("--- [KATEGORI: MINUMAN] ---");
        super.tampilkanInfo();
        System.out.println("Tingkat Kemanisan : " + tingkatKemanisan);
    }
}
