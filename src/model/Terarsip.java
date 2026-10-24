package model;

public interface Terarsip {
    String getnomorRak();
    String getlokasiLantai();

    default String ringkasanArsip(){
        return "Rak : " + getnomorRak()+"Lantai :"+ getlokasiLantai();
    }
}
