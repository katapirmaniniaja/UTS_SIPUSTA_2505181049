import eksepsi.PustakaException;
import layanan.KatalogPerpustakaan;
import layanan.UrutLayakLaluJudul;
import model.BerkasDigital;
import model.BukuCetak;
import model.Majalah;

public class Main {
    public static void main(String[] args) {
      
        KatalogPerpustakaan katalog = new KatalogPerpustakaan();

        BukuCetak bk1 = new BukuCetak("BK-001", "Pemrograman Web", 2022, 620, "rak A-12", false);
        BukuCetak bk2 = new BukuCetak("BK-002", "Basis Data Relasional", 2021, 410, "rak B-04", true);
        BukuCetak bk3 = new BukuCetak("BK-003", "PBO 2", 2025, 450, "rak C-03", false);

        Majalah mj1 = new Majalah("MJ-001", "Info Teknologi Edisi 88", 2026, "edisi 88", "Agustus", "rak C-01", true);
        Majalah mj2 = new Majalah("MJ-002", "Info Teknologi Edisi 87", 2026, "edisi 87", "Juli", "rak C-01", false);
        
        BerkasDigital bd1 = new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2024, 15, "unduh.polmed.ac.id/bd001");
        BerkasDigital bd2 = new BerkasDigital("BD-002", "Jurnal Rekayasa Perangkat", 2025, 8, "unduh.polmed.ac.id/bd002");

        katalog.tambahKoleksi(bk1);
        katalog.tambahKoleksi(bk2);
        katalog.tambahKoleksi(bk3);
        katalog.tambahKoleksi(mj1);
        katalog.tambahKoleksi(mj2);
        katalog.tambahKoleksi(bd1);
        katalog.tambahKoleksi(bd2);

        System.out.println("=== STATUS AWAL KOLEKSI ===");
        katalog.cetakStatus();
        System.out.println();

       
        System.out.println("=== SETELAH DIURUTKAN ===");
        katalog.urut(new UrutLayakLaluJudul());
        katalog.cetakStatus();
        System.out.println();

        System.out.println("=== UJI PEMINJAMAN ===");
        try {
            
            katalog.pinjam(bk1); 
            
           
            katalog.pinjam(bk1); 
        } catch (PustakaException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            katalog.pinjam(bk2); 
        } catch (PustakaException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();

        EksporKatalog.ekspor(katalog.getDaftarKoleksi(), "katalog.txt");
    }
}