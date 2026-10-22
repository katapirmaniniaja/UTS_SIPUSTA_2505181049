package eksepsi;

public class KoleksiTidakLayakException extends PustakaException {
    public KoleksiTidakLayakException(String judul) {
        super("Mohon maaf, koleksi '" + judul + "' tidak dapat dipinjam karena tidak memenuhi syarat kelayakan.");
    }
}