/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Makanan extends MenuItem {
    private String levelPedas;
    
    public Makanan(String idItem, String nama, double harga, String levelPedas) {
        super(idItem, nama, harga);
        this.levelPedas = levelPedas;
    }
    
    public void setLevelPedas(String levelPedas) {
        this.levelPedas = levelPedas;
    }

    
    @Override
    public void tampilkanInfo() {
        System.out.println("--- [KATEGORI: MAKANAN] ---");
        super.tampilkanInfo(); 
        System.out.println("Level Pedas  : " + levelPedas);
    }
    
}
