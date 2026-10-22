package model;

public interface Terarsip {
    String getNomorRak();
    String getLokasiLantai();

    default String ringkasanArsip(){
        return "Rak : " + getNomorRak()+"Lantai :"+ getLokasiLantai();
    }
}
