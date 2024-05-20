package Soal4;

/* Rumus Gaya Lorentz dalam fisika mendefinisikan gaya yang bekerja pada partikel bermuatan yang bergerak dalam medan elektromagnetik.
   Ada 2 rumus yang akan digunakan:
   1. Rumus Gaya Lorentz dengan Medan Magnet:
        F = I * l * B
   2. Rumus Gaya Lorentz dengan Besar Sudut:
        F = I * l * B * sin(theta)

        Keterangan:
        F = Gaya Lorentz (Newton)
        I = Kuat Arus Listrik (Ampere)
        l = Panjang Kawat (meter)
        B = Medan Magnet (Tesla)
        theta = Besar Sudut
*/

public class GayaLorentz {
    private double kuatArus;
    private double panjangKawat;
    private double medanMagnet;
    private double theta;

    // constructor untuk kuatArus, panjangKawat, dan medanMagnet
    public GayaLorentz(double kuatArus, double panjangKawat, double medanMagnet){
        this.kuatArus = kuatArus;
        this.panjangKawat = panjangKawat;
        this.medanMagnet = medanMagnet;
    }

    // constructor untuk kuatArus, panjangKawat, medanMagnet, theta
    public GayaLorentz(double kuatArus, double panjangKawat, double medanMagnet, double theta){
        this.kuatArus = kuatArus;
        this.panjangKawat = panjangKawat;
        this.medanMagnet = medanMagnet;
        this.theta = theta;
    }

    // rumus gaya lorentz dengan medan magnet
    public double hitungGaya(){
        return kuatArus * panjangKawat * medanMagnet;
    }

    // rumus gaya lorentz dengan besaran sudut
    public double hitungGaya(double theta){
        this.theta = theta;
        return kuatArus * panjangKawat * medanMagnet * Math.sin(theta);
    }
}
