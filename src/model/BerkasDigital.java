package model;

public class BerkasDigital extends Koleksi {
    // Atribut khusus
    private int ukuranMB;
    private String tautanUnduh;

    // Constructor
    public BerkasDigital(String kodeKoleksi, String judul, int tahunTerbit, int ukuranMB, String tautanUnduh) {
        super(kodeKoleksi, judul, tahunTerbit);
        this.ukuranMB=ukuranMB;
        this.tautanUnduh=tautanUnduh;
    }

    // Aturan kelayakan dari Koleksi
    @Override
    public boolean islayakPinjam() {
        return true;
    }

    // Memperluas deskripsi
    @Override
    public String deskripsi() {
        return super.deskripsi() + " | "+"Ukuran MB :" + this.ukuranMB + " MB | Link: " + this.tautanUnduh;
    }
}