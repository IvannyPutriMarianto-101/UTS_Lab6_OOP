package Soal4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String ulang;

        do {
            System.out.print("Masukkan nilai kuat arus (I) : ");
            double kuatArus = scanner.nextDouble();

            System.out.print("Masukkan nilai panjang kawat (l) : ");
            double panjangKawat = scanner.nextDouble();

            System.out.print("Masukkan nilai kuat medan magnet (B) : ");
            double medanMagnet = scanner.nextDouble();

            System.out.print("Masukkan nilai sudut (θ) dalam derajat, isi '0' jika tidak ada: ");
            double thetaDegrees = scanner.nextDouble();
            double theta = Math.toRadians(thetaDegrees);

            GayaLorentz gaya;

            if (theta == 0) {
                gaya = new GayaLorentz(kuatArus, panjangKawat, medanMagnet);
                System.out.println("Gaya Lorentz dengan Medan Magnet: " + gaya.hitungGaya());
            } else {
                gaya = new GayaLorentz(kuatArus, panjangKawat, medanMagnet, theta);
                System.out.println("Gaya Lorentz dengan medan magnet: " + gaya.hitungGaya(theta));
            }

            System.out.print("Apakah Anda ingin menghitung lagi? (Ya/Tidak): ");
            ulang = scanner.next();

        } while (ulang.equalsIgnoreCase("ya"));
    }
}
