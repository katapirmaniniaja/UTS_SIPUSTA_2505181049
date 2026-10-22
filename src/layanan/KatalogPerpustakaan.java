package layanan;
import model.Koleksi;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import eksepsi.*;

public class KatalogPerpustakaan {
    // Menampung semua koleksi dalam satu daftar
    private List<Koleksi> daftarKoleksi;

    // Constructor
    public KatalogPerpustakaan() {
        this.daftarKoleksi = new ArrayList<>();
    }

    // Method untuk menambah koleksi ke dalam list
    public void tambahKoleksi(Koleksi k) {
        this.daftarKoleksi.add(k);
    }

    // Method untuk mengambil daftar koleksi (getter)
    public List<Koleksi> getDaftarKoleksi() {
        return this.daftarKoleksi;
    }

    public void cetakStatus() {
        for (Koleksi k : daftarKoleksi) {
           System.out.println(k.deskripsi());
        }
    }
    public void urut(Comparator<Koleksi> c) {
     this.daftarKoleksi.sort(c);
    }
    public void pinjam(Koleksi k) throws PustakaException {
    // 1. Cek apakah koleksi sedang dipinjam
    if (k.getStatusDipinjam()) {
        throw new KoleksiSedangDipinjamException(k.getjudul());
    }
    
    // 2. Cek apakah koleksi tidak layak pinjam
    if (!k.islayakPinjam()) {
        throw new KoleksiTidakLayakException(k.getjudul());
    }
    
    k.setStatusDipinjam(true);
    System.out.println("Berhasil meminjam koleksi: " + k.getjudul());
}
}