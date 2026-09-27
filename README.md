# Sistem Kasir Kafe Modern Berbasis Self-Service (Point of Sale)

## Nama: Selvi Bella Dwi Anita
## NIM: 2509116053
## Kelas: B

---

## Deskripsi Proyek
Sistem Kasir Kafe Modern Berbasis Self-Service (Point of Sale) adalah aplikasi CLI (Command Line Interface) yang dirancang untuk mengintegrasikan proses pemesanan mandiri oleh pelanggan dan sistem transaksi kasir dalam satu platform terpadu. 

Aplikasi ini memiliki dua fungsi utama:
1. Sisi Pelanggan (Self-Service): Pelanggan dapat memilih menu makanan atau minuman secara interaktif, sekaligus menentukan tingkat kustomisasi rasa (memilih level pedas untuk makanan dan tingkat kemanisan/sugar level untuk minuman) secara dinamis.
2. Sisi Kasir (Point of Sale): Sistem otomatis mengunci pesanan, menghitung akumulasi total belanjaan di keranjang, mendeteksi potongan diskon promo, mencetak struk belanja resmi, serta memproses validasi nominal pembayaran tunai dan uang kembalian konsumen.

---

## Alur Program & Petunjuk Eksekusi
Program dijalankan melalui kelas utama `MainApp.java` yang berada di package `main`.

### Cara Kerja Sistem:
1. **Tampilan Menu Awal:** Saat dirun, sistem otomatis menampilkan beberapa pilihan menu.
   
   <img width="297" height="93" alt="image" src="https://github.com/user-attachments/assets/e52ee9a4-dedc-45a4-8319-e03967bd86ee" />

   Terdapat beberapa pilihan menu seperti melihat daftar menu, menu untuk pemesanan dan pembayaran dan menu keluar untuk keluar dari program.

   ---

2. **Menu 1 (Tampilkan Katalog):** Menampilkan semua makanan dan minuman yang tersedia beserta informasi standarnya.
   <img width="482" height="722" alt="image" src="https://github.com/user-attachments/assets/ae19cb2f-5bf7-4612-a984-4da2f61d3de2" />

   Terdapat beberapa menu yang tersedia beserta detail menu tersebut seperti harga, level pedas/tingkat kemanisan yang dapat dipilih.

   ---

3. **Menu 2 (Pemesanan & Pembayaran):**
   
   <img width="473" height="712" alt="image" src="https://github.com/user-attachments/assets/e9e039ad-a61c-416f-a130-b98b18ac0f75" />

   - Pelanggan dapat memilih menu berulang kali dan sistem akan otomatis memasukkan ke dalam keranjang. 
   - Jika memilih **Makanan**, sistem memunculkan pilihan tingkat kepedasan (Level 1-4).
   - Jika memilih **Minuman**, sistem memunculkan pilihan tingkat kemanisan (Normal/Less/No Sugar).
   - Tekan angka `0` untuk mengunci pesanan dan langsung masuk ke pencetakan **Struk Belanja**.
   - Masukkan kode promo jika ada (Gunakan kode: `MABA2026` untuk diskon 15%).
   - Masukkan uang tunai untuk membayar. Sistem akan menghitung uang kembalian atau membatalkan transaksi otomatis jika uang kurang.
  
   ---

   <img width="392" height="471" alt="image" src="https://github.com/user-attachments/assets/b157b5d4-2f8c-4c21-997f-f81596f50a7c" />

   Terdapat invoice setelah pelanggan berhasil melakukan pemesanan dan pembayaran.

   ---

   <img width="381" height="86" alt="image" src="https://github.com/user-attachments/assets/2604427a-7b37-443e-924b-0fdc8d6f7400" />

   Tampilan akhir invoice jika memasukkan kode promo, sisitem akan melakukan pemotongan harga dan menampilkan harga akhir dari potongan.

   ---

   <img width="243" height="152" alt="image" src="https://github.com/user-attachments/assets/63f39395-bec7-4e80-af20-dfe0aada50ec" />

   Jika pelanggan memasukkan pilihan menu yang tidak valid, sistem akan mendeteksi dan menampilkan bahwa pilihan tidak valid.

   ---

   <img width="422" height="325" alt="image" src="https://github.com/user-attachments/assets/a3b47aeb-4f81-4928-b1f6-993dcba0cb1b" />

   Jika pembayaran atau uang yang dimasukkan kurang, sistem akan otomatis membatalkan pesanan.

   ---

   <img width="380" height="225" alt="image" src="https://github.com/user-attachments/assets/a6b62b90-9a31-48c5-ab51-2dd1e162ad76" />

   Apabila pelanggan belum memilih menu pemesanan dan langsung melakukan pembayaran.

   ---

5. **Menu 3 (Keluar):** Menutup aplikasi dengan aman.

   <img width="261" height="90" alt="image" src="https://github.com/user-attachments/assets/54e94d80-3b20-4fda-984b-aaa30e7ca864" />

   ---

6. **Pilihan Menu Lain:** Apabila memasukkan pilihan menu yang tidak tersedia pada menu utama/menu awal.

   <img width="223" height="87" alt="image" src="https://github.com/user-attachments/assets/16844ad4-632e-4200-9aef-be9a6288cd24" />

