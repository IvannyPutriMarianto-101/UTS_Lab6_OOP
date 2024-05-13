package Soal2;

import java.util.Scanner;

public class PalindromeChecker {
    // method untuk cek palindrome
    public static boolean isPalindrome(String str) {
        // untuk hilangkan spasi trus ubah jadi lowercase untuk pengecekan
        str = str.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = str.length() - 1;

        // untuk cek karakter dari depan dan belakang secara berurutan
        while (i < j) {
            // kalau ada yang beda langsung false
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        // kalau semua sama langsung true
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata;
        boolean repeat;

        do {
            // user disuruh untuk input kata kata yang mau diuji palindrome
            System.out.print("Masukkan string: ");
            kata = scanner.nextLine();

            // ini untuk memeriksa kalau kata yang diuji itu palindrome atau bukan
            boolean result = isPalindrome(kata);

            // hasilnya
            if (result) {
                System.out.println("String \"" + kata + "\" adalah palindrom.");
            } else {
                System.out.println("String \"" + kata + "\" bukan palindrom.");
            }

            // tanya ke user apakah mau ulang programnya atau tidak
            System.out.print("Apakah Anda ingin mengulang program? (yes/no): ");
            String choice = scanner.nextLine();
            repeat = choice.equalsIgnoreCase("yes");

        } while (repeat);

        scanner.close();
    }
}

