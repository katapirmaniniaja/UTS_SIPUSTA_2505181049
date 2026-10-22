package model;

public class Majalah extends Koleksi implements Terarsip {
    // Atribut khusus majalah
    private String edisi;
    private String bulanTerbit;
    private String nomorRak;
    private boolean edisiTerbaru;

    // Constructor
    public Majalah(String kodeKoleksi, String judul, int tahunTerbit, String edisi, String bulanTerbit, String nomorRak, boolean edisiTerbaru) {
        super(kodeKoleksi, judul, tahunTerbit); // Memanggil constructor induk
        this.edisi=edisi;
        this.bulanTerbit=bulanTerbit;
        this.nomorRak=nomorRak;
        this.edisiTerbaru=edisiTerbaru;
    }

    // Aturan kelayakan dari kelas Koleksi
    @Override
    public boolean islayakPinjam() {
        if(edisiTerbaru == false){
            return true;
        }else{
            return false; }
    }

    // Kontrak fisik dari interface Terarsip
    @Override
    public String getNomorRak() {
        return nomorRak; 
    }

    @Override
    public String getLokasiLantai() {
        return "Lantai 2"; 
    }

    // Memperluas deskripsi
    @Override
    public String deskripsi() {
        return super.deskripsi() + " | " + "Edisi : "+ this.edisi+ " | " +"Bulan Terbit : "+ this.bulanTerbit + " | " + ringkasanArsip();
    }
}