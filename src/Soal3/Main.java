package Soal3;

public class Main {
    public static void main(String[] args) {
        // Account
        Account a1 = new Account("A101", "Ligma", 88);
        System.out.println(a1);

        Account a2 = new Account("A102", "Deezma");
        System.out.println(a2);

        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getbalance());

        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);

        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("\n");

    }
}