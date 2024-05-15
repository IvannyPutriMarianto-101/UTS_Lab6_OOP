package Soal1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // membuat objek Scanner untuk membaca input pengguna
        Scanner scanner = new Scanner(System.in);

        // membuat objek pesawat dengan nilai awal
        Pesawat pesawat1 = new Pesawat("Garuda Indonesia", "Airbus A320", 150);
        // menampilakan informasi pesawat1
        pesawat1.displayInfo();

        // untuk user input
        System.out.print("Masukkan maskapai pesawat baru: ");
        String newAirline = scanner.nextLine();

        // untuk user input
        System.out.print("Masukkan jenis pesawat baru: ");
        String newType = scanner.nextLine();

        // untuk user input
        System.out.print("Masukkan kapasitas penumpang pesawat baru: ");
        int newCapacity = scanner.nextInt();

        // mengubah informasi pesawat1 dengan inputan yang telah di input oleh user
        pesawat1.setInfo(newAirline, newType, newCapacity);
        // menampilkan informasi terbaru
        pesawat1.displayInfo();
    }
}

// Penjelasan Naratif
// Dalam program ini, kita mendefinisikan kelas Pesawat yang berfungsi untuk menyimpan dan mengelola informasi mengenai sebuah pesawat terbang.
// Kelas Pesawat mengenkapsulasi atribut seperti maskapai, jenis, dan kapasitas penumpang. Konstruktor kelas ini menerima tiga parameter untuk menginisialisasi atribut-atribut tersebut. Ini memastikan bahwa saat objek Pesawat dibuat, nilai-nilai awal untuk maskapai, jenis, dan kapasitas penumpang diatur.
// Metode setter digunakan untuk mengubah nilai dari atribut-atribut tersebut setelah objek dibuat. Ada beberapa metode setter: setMaskapai untuk mengubah nama maskapai, setJenis untuk mengubah jenis pesawat, dan setKapasitasPenumpang untuk mengubah kapasitas penumpang. Selain itu, ada metode setInfo yang di-overload, memungkinkan perubahan nilai untuk maskapai dan jenis, atau maskapai, jenis, dan kapasitas penumpang sekaligus.
// Metode getter disediakan untuk mengakses nilai dari atribut-atribut tersebut. Metode getMaskapai mengembalikan nilai maskapai, getJenis mengembalikan nilai jenis, dan getKapasitasPenumpang mengembalikan nilai kapasitas penumpang.
// Metode displayInfo digunakan untuk menampilkan informasi lengkap tentang pesawat dalam format yang mudah dibaca di konsol. Metode ini mencetak informasi pesawat, termasuk nama maskapai, jenis pesawat, dan kapasitas penumpang.
// Metode toString di-override untuk memberikan representasi string dari objek Pesawat. Ini mempermudah penampilan informasi objek dalam bentuk string, misalnya saat mencetak objek tersebut.
// Secara keseluruhan, program ini memungkinkan pengelolaan data pesawat dengan cara yang fleksibel dan terstruktur. Ini mendukung pembaruan data secara dinamis dan penyajian informasi dengan jelas, serta mempromosikan prinsip enkapsulasi dalam pemrograman berorientasi objek.
