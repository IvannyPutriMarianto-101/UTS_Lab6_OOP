package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pesawat pesawat1 = new Pesawat("Garuda Indonesia", "Airbus A320", 150);

        pesawat1.displayInfo();

        System.out.print("Masukkan maskapai pesawat baru:");
        String newAirline = scanner.nextLine();
        pesawat1.setMaskapai(newAirline);

        System.out.print("Masukkan jenis pesawat baru:");
        String newType = scanner.nextLine();
        pesawat1.setJenis(newType);

        System.out.print("Masukkan kapasitas penumpang pesawat baru:");
        int newCapacity = scanner.nextInt();
        pesawat1.setKapasitasPenumpang(newCapacity);

        System.out.println(pesawat1.toString());

    }
}