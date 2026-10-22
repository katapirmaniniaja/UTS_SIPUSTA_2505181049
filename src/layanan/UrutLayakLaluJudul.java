package layanan;

import model.Koleksi;
import java.util.Comparator;

public class UrutLayakLaluJudul implements Comparator<Koleksi> {

    @Override
    public int compare(Koleksi k1, Koleksi k2) {
        if (k1.islayakPinjam() == k2.islayakPinjam()) {
            return k1.getjudul().compareToIgnoreCase(k2.getjudul());
        }

        if (k1.islayakPinjam()) {
            return -1; // k1 ditaruh di atas
        } else {
            return 1;  // k2 ditaruh di atas
        }
    }
}