package Soal1;

public class Pesawat {
    // pendeklarasian variabel
    private String maskapai;
    private String jenis;
    private int kapasitasPenumpang;

    // ini merupakan kontruktor untuk menginisialisasi objek pesawat
    public Pesawat(String maskapai, String jenis, int kapasitasPenumpang) {
        this.maskapai = maskapai;
        this.jenis = jenis;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

   // setter untuk mengubah nilai variabel maskapai
    public void setMaskapai(String maskapai){
        this.maskapai = maskapai;
    }

    // setter untuk mengubah nilai variabel jenis
    public void setJenis(String jenis){
        this.jenis = jenis;
    }

    // setter untuk mengubah nilai variabel kapasitas penumpang
    public void setKapasitasPenumpang(int kapasitasPenumpang){
        this.kapasitasPenumpang = kapasitasPenumpang;
    }

    // method untuk mengubah nilai maskapai dan jenis
    public void setInfo(String maskapai, String jenis) {
        this.maskapai = maskapai;
        this.jenis = jenis;
    }

    // method overloading untuk mengubah nilai maskapai, jenis dan kapasitas penumpang
    public void setInfo(String maskapai, String jenis, int kapasitasPenumpang) {
        this.maskapai = maskapai;
        this.jenis = jenis;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    // getter untuk mendapatkan nilai maskapai
    public String getMaskapai(){
        return maskapai;
    }

    // getter untuk mendapatkan nilai jenis
    public String getJenis(){
        return jenis;
    }

    // getter untuk mendapatkan nilai kapasitas penumpang
    public int getKapasitasPenumpang(){
        return kapasitasPenumpang;
    }

    // method untuk menampilkan infromasi pesawat
    public void displayInfo(){
        System.out.println("Pesawat: " + maskapai + " " + jenis + ", Kapasitas Penumpang " + kapasitasPenumpang);
    }

    // override method toString untuk mengembalikan informasi pesawat sebagai string
    @Override
    public String toString(){
        return "Pesawat: " + maskapai + " " + jenis + ", Kapasitas Penumpang " + kapasitasPenumpang;
    }
}