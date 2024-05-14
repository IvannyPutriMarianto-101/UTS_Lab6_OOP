package Soal4;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan massa benda (kg): ");
        double massa = scanner.nextDouble();

        System.out.print("Masukkan percepatan gravitasi (m/s^2): ");
        double gravitasi = scanner.nextDouble();

        System.out.print("Masukkan ketinggian benda (m): ");
        double ketinggian = scanner.nextDouble();

        EnergiPotensial ep1 = new EnergiPotensial(massa, gravitasi);
        EnergiPotensial ep2 = new EnergiPotensial(massa, gravitasi, ketinggian);

        System.out.println("Energi Potensial tanpa ketinggian:");
        ep1.display();

        System.out.println("\nEnergi Potensial dengan ketinggian:");
        ep2.display();

        System.out.print("\nMasukkan ketinggian benda untuk menghitung energi potensial tanpa objek: ");
        double ketinggianTanpaObjek = scanner.nextDouble();
        double hasilEnergiPotensialTanpaObjek = ep1.hitungEnergiPotensial(ketinggianTanpaObjek);
        System.out.println("Energi Potensial tanpa objek: " + hasilEnergiPotensialTanpaObjek + " Joule");

    }
}