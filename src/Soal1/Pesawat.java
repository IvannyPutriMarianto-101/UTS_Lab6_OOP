package Soal1;

import java.util.Scanner;
public class Pesawat {
    private String maskapai;
    private String jenis;
    private int kapasitasPenumpang;

    public Pesawat(String maskapai, String jenis, int kapasitasPenumpang) {
        this.maskapai = maskapai;
        this.jenis = jenis;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public void setMaskapai(String maskapai){
        this.maskapai = maskapai;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    public void setKapasitasPenumpang(int kapasitasPenumpang){
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    public String getMaskapai(){
        return maskapai;
    }

    public String getJenis(){
        return jenis;
    }

    public int getKapasitasPenumpang(){
        return kapasitasPenumpang;
    }

    public void displayInfo(){
        System.out.println("Pesawat: " + maskapai + " " + jenis + ", Kapasitas Penumpang " + kapasitasPenumpang);
    }

    @Override
    public String toString(){
        return "Pesawat: " + maskapai + " " + jenis + ", Kapasitas Penumpang " + kapasitasPenumpang;
    }
}