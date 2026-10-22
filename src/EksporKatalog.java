import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import model.Koleksi;

public class EksporKatalog {
    
    // Method statis agar bisa langsung dipanggil tanpa membuat objek baru
    public static void ekspor(List<Koleksi> daftarKoleksi, String namaBerkas) {
        
        // Inilah yang disebut try-with-resources (deklarasi di dalam tanda kurung)
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaBerkas))) {
            
            writer.println("--- DAFTAR KOLEKSI PERPUSTAKAAN ---");
            writer.println("=========================================================================");
            writer.printf("%-10s | %-30s | %-15s\n", "KODE", "JUDUL", "LAYAK PINJAM");
            writer.println("=========================================================================");
            for (Koleksi k : daftarKoleksi){
               writer.printf("%-10s | %-30s | %-15b\n", k.getKodeKoleksi(), k.getjudul(), k.islayakPinjam());
            }
            System.out.println("Berhasil mengekspor data ke file: " + namaBerkas);
            
        } catch (IOException e) {
            // Menangkap error jika file tidak bisa dibuat atau ditulis
            System.out.println("Gagal menulis ke berkas: " + e.getMessage());
        }
    }
}