package org.example.Scanner;

import java.util.Scanner;

public class BelajarScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("===MENU PILIHAN===");
        System.out.println("1. Penambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Keluar");

        System.out.print("Masukkan Pilihan anda :");
        Integer Pilihan = scanner.nextInt();

        System.out.print("Masukkan angka Pertama : ");
        Integer angka1 = scanner.nextInt();
        System.out.print("Masukkan angka Kedua : ");
        Integer angka2 = scanner.nextInt();

        Integer Hasil = 0;

        switch (Pilihan){
            case 1:
                Hasil = angka1 + angka2;
                System.out.println("Hasil Penjumlahan adalah : "+Hasil);
                break;
            case 2:
                Hasil = angka1 - angka2;
                System.out.println("Hasil Pengurangan adalah : "+Hasil);
                break;
            case 3:
                Hasil = angka1 * angka2;
                System.out.println("Hasil Perkalian adalah : "+Hasil);
                break;
            case 4:
                Hasil = angka1 / angka2;
                System.out.println("Hasil Pembagian adalah : "+Hasil);
                break;
            case 5:
                scanner.close();
            default:
                System.out.println("Pilihan Tidak Valid");
                scanner.close();
            }
        }
}
