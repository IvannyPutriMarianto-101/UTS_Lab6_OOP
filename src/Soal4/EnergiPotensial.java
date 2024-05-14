package Soal4;

import java.util.Scanner;

class EnergiPotensial {
    private double massa;
    private double gravitasi;
    private double ketinggian;

    public EnergiPotensial(double massa, double gravitasi) {
        this.massa = massa;
        this.gravitasi = gravitasi;
    }

    public EnergiPotensial(double massa, double gravitasi, double ketinggian) {
        this.massa = massa;
        this.gravitasi = gravitasi;
        this.ketinggian = ketinggian;
    }

    public double hitungEnergiPotensial() {
        return massa * gravitasi * ketinggian;
    }

    public double hitungEnergiPotensial(double ketinggian) {
        return massa * gravitasi * ketinggian;
    }

    public void display() {
        System.out.println("Energi Potensial: " + hitungEnergiPotensial() + " Joule");
    }
}