package Soal4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            // user input untuk nilai kuat arus
            System.out.print("Masukkan nilai kuat arus (I) : ");
            double kuatArus = scanner.nextDouble();

            // user input untuk nilai panjang kawat
            System.out.print("Masukkan nilai panjang kawat (l) : ");
            double panjangKawat = scanner.nextDouble();

            // user input untuk nilai kuat medan magnet
            System.out.print("Masukkan nilai kuat medan magnet (B) : ");
            double medanMagnet = scanner.nextDouble();

            // user input untuk nilai sudut dalam deraja
            System.out.print("Masukkan nilai sudut (θ) dalam derajat, isi '0' jika tidak ada: ");
            double thetaDegrees = scanner.nextDouble();
            double theta = Math.toRadians(thetaDegrees);

            GayaLorentz gaya;

            // kalau sudutnya 0 maka yang akan di jalankan yaitu gaya lorentz yang pakai medan magnet
            if (theta == 0) {
                gaya = new GayaLorentz(kuatArus, panjangKawat, medanMagnet);
                System.out.println("Gaya Lorentz dengan Medan Magnet: " + gaya.hitungGaya());
            } else {
                // kalau sudutnya tidak 0 maka program yang dijalankan itu gaya lorentz yang pakai besaran sudut
                gaya = new GayaLorentz(kuatArus, panjangKawat, medanMagnet, theta);
                System.out.println("Gaya Lorentz dengan Besaran Sudut: " + gaya.hitungGaya(theta));
            }

            // untuk mengulang program
            System.out.print("Apakah Anda ingin menghitung lagi? (Ya/Tidak): ");
            ulang = scanner.next();

        } while (ulang.equalsIgnoreCase("ya"));
    }
}
