/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import Model.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<MenuItem> daftarMenu = new ArrayList<>();
        daftarMenu.add(new Makanan("MK001", "Nasi Goreng", 25000, "Level 1-4"));
        daftarMenu.add(new Makanan("MK002", "Mie Goreng", 20000, "Level 1-4"));
        daftarMenu.add(new Minuman("MN001", "Teh Hangat", 5000, "Normal/Less/No Sugar"));
        daftarMenu.add(new Minuman("MN002", "Es Teh", 7000, "Normal/Less/No Sugar"));
        daftarMenu.add(new Minuman("MN003", "Kopi Susu", 10000, "Normal/Less/No Sugar"));
        daftarMenu.add(new Minuman("MN004", "Es Kopi Susu", 15000, "Normal/Less/No Sugar"));
        

        
        ArrayList<MenuItem> keranjangBelanja = new ArrayList<>();

        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== SISTEM KASIR KAFE ICIKIWIR ===");
            System.out.println("1. Tampilkan Daftar Menu Kafe");
            System.out.println("2. Pemesanan & Pembayaran");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            if (pilihan == 1) {
                System.out.println("\n>> DAFTAR KATALOG MENU:");
                for (int i = 0; i < daftarMenu.size(); i++) {
                    System.out.print((i + 1) + ". ");
                    daftarMenu.get(i).tampilkanInfo(); 
                    System.out.println("--------------------------------");
                }
            } 
            else if (pilihan == 2) {
                boolean sedangMemesan = true;
                
                while (sedangMemesan) {
                    System.out.println("\n>> SILAHKAN PILIH MENU:");
                    for (int i = 0; i < daftarMenu.size(); i++) {
                        System.out.println((i + 1) + ". " + daftarMenu.get(i).getNama() + " (Rp" + daftarMenu.get(i).getHarga() + ")");
                    }
                    System.out.println("0. Selesai Memesan & Lanjut Bayar");
                    System.out.print("Masukkan pilihan Anda: ");
                    int nomorUrut = scanner.nextInt();
                    scanner.nextLine(); 

                    if (nomorUrut == 0) {
                        sedangMemesan = false; 
                    } 
                    else if (nomorUrut > 0 && nomorUrut <= daftarMenu.size()) {
                        MenuItem itemTerpilih = daftarMenu.get(nomorUrut - 1);
                        
             
                        if (itemTerpilih instanceof Makanan) {
                            System.out.println("\nPilih Tingkat Kepedasan:");
                            System.out.println("1. Level 1 (Tidak Pedas)");
                            System.out.println("2. Level 2 (Sedang)");
                            System.out.println("3. Level 3 (Pedas)");
                            System.out.println("4. Level 4 (Pedas Mampus)");
                            System.out.print("Pilih level (1-4): ");
                            int lvl = scanner.nextInt();
                            scanner.nextLine(); 
                            
                            String teksLevel = "Normal";
                            if (lvl == 1) teksLevel = "Level 1 (Tidak Pedas)";
                            else if (lvl == 2) teksLevel = "Level 2 (Sedang)";
                            else if (lvl == 3) teksLevel = "Level 3 (Pedas)";
                            else if (lvl == 4) teksLevel = "Level 4 (Pedas Mampus)";

                            
                            Makanan makananBaru = new Makanan(itemTerpilih.getIdItem(), itemTerpilih.getNama(), itemTerpilih.getHarga(), teksLevel);
                            keranjangBelanja.add(makananBaru);
                        }
                        
                        else if (itemTerpilih instanceof Minuman) {
                            System.out.println("\nPilih Tingkat Kemanisan:");
                            System.out.println("1. Normal Sugar");
                            System.out.println("2. Less Sugar");
                            System.out.println("3. No Sugar");
                            System.out.print("Pilih tingkat (1-3): ");
                            int sugarLvl = scanner.nextInt();
                            scanner.nextLine();
                            
                            String teksManis = "Normal Sugar";
                            if (sugarLvl == 1) teksManis = "Normal Sugar";
                            else if (sugarLvl == 2) teksManis = "Less Sugar";
                            else if (sugarLvl == 3) teksManis = "No Sugar";

                            Minuman minumanBaru = new Minuman(itemTerpilih.getIdItem(), itemTerpilih.getNama(), itemTerpilih.getHarga(), teksManis);
                            keranjangBelanja.add(minumanBaru);
                        
                        }
                        System.out.println("Berhasil " + itemTerpilih.getNama() + " dimasukkan ke keranjang belanja.");
                    } else {
                        System.out.println(" Pilihan tidak valid!");
                    }
                }

                
                if (keranjangBelanja.isEmpty()) {
                    System.out.println("Transaksi dibatalkan karena tidak ada item yang dipesan.");
                    continue;
                }

                double totalBelanja = 0;
                System.out.println("\n=================================");
                System.out.println("         STRUK BELANJAAN         ");
                System.out.println("=================================");
                
                for (int i = 0; i < keranjangBelanja.size(); i++) {
                    MenuItem item = keranjangBelanja.get(i);
                    
                        item.tampilkanInfo(); 
                        System.out.println("---------------------------------");
                        totalBelanja += item.getHarga();
                }
                System.out.println("=================================");
                System.out.println("Total Awal        : Rp" + totalBelanja);

                System.out.print("Masukkan kode promo (Ketik '-' jika tidak ada): ");
                String promo = scanner.nextLine();

                double potongan = 0;
                MenuItem hitungDiskonDummy = daftarMenu.get(0); 
                if (promo.equals("-")) {
                    potongan = hitungDiskonDummy.hitungPotongan(totalBelanja);
                } else {
                    potongan = hitungDiskonDummy.hitungPotongan(totalBelanja, promo);
                }

                double totalAkhir = totalBelanja - potongan;
                System.out.println("Potongan Diskon   : Rp" + potongan);
                System.out.println("Total Akhir Bayar : Rp" + totalAkhir);
                System.out.println("=================================");

                System.out.print("Masukkan nominal uang tunai: Rp");
                double uangBayar = scanner.nextDouble();

                if (uangBayar >= totalAkhir) {
                    double kembalian = uangBayar - totalAkhir;
                    System.out.println("SIP! PEMBAYARAN SUKSES! Uang kembalian Anda: Rp" + kembalian);
                } else {
                    System.out.println("YAH! UANG KURANG! Transaksi dibatalkan secara otomatis oleh sistem.");
                }
                
                keranjangBelanja.clear();
            } 
            else if (pilihan == 3) {
                berjalan = false;
                System.out.println("Terima kasih! Program kasir ditutup.");
            } 
            else {
                System.out.println("Pilihan menu salah!");
            }
        }
        scanner.close();
    }
     
}
