package eksepsi;

public class KoleksiSedangDipinjamException extends PustakaException {
    public KoleksiSedangDipinjamException(String judul) {
        super("Mohon maaf, koleksi " + judul + " saat ini sedang dipinjam.");
    }
}