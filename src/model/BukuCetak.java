package model;

public class BukuCetak extends Koleksi implements Terarsip {
    // Atribut khusus buku cetak
    private int jumlahHalaman;
    private String nomorRak;
    private boolean sedangDiperbaiki;

    // Constructor
    public BukuCetak(String kodeKoleksi, String judul, int tahunTerbit, int jumlahHalaman, String nomorRak, boolean sedangDiperbaiki) {
    super(kodeKoleksi, judul, tahunTerbit); 
          this.jumlahHalaman = jumlahHalaman;
          this.nomorRak = nomorRak;
          this.sedangDiperbaiki= sedangDiperbaiki;
    }

    // Mengisi aturan abstract dari kelas Koleksi
   @Override
    public boolean islayakPinjam() {
    if (this.sedangDiperbaiki == false) {
        return true;  
    } else {
        return false;
    }
}

    // Mengisi kontrak dari interface Terarsip
    @Override
    public String getNomorRak() {
        return nomorRak; 
    }

    @Override
    public String getLokasiLantai() {
        return "Lantai : 1 "; 
    }

   @Override
public String deskripsi() {
    // Tambahkan pemisah " | " agar teksnya rapi
    return super.deskripsi() + " | Jumlah Halaman : " + this.jumlahHalaman + " hal | " + ringkasanArsip();
}
}