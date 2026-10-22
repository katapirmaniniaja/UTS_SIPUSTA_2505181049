package model;

public abstract class Koleksi {
    protected String kodeKoleksi;
    protected String judul;
    protected int tahunTerbit;
    protected boolean statusDipinjam;

    public Koleksi(String kodeKoleksi, String judul, int tahunTerbit) {
        this.kodeKoleksi = kodeKoleksi;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
        this.statusDipinjam = false;
    }

    public abstract boolean islayakPinjam();

    public String deskripsi() {
        return String.format("[%s] %s (%d) - Layak Pinjam: %b", 
               kodeKoleksi, judul, tahunTerbit, islayakPinjam());
    }

    public String getKodeKoleksi() {
        return this.kodeKoleksi;
    }

    public String getjudul() {
        return this.judul;
    }

    public boolean getStatusDipinjam() {
        return this.statusDipinjam;
    }

    public void setStatusDipinjam(boolean status) {
        this.statusDipinjam = status;
    }
}