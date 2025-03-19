package Pertemuan4_Lat8;

interface Kendaraan {
    void berjalan();
}

// Implementasi pertama
class Mobil implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Mobil berjalan dengan roda 4.");
    }
}

// Implementasi kedua
class Motor implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Motor berjalan dengan roda 2.");
    }
}

// latihan8c class
public class latihan8c {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new Motor();
        
        kendaraan1.berjalan();
        kendaraan2.berjalan();
    }
}
