package org.example.Logic;

public class BelajarLogic {
    public static void main (String [] args){

        // Mencetak Bilangan Genap
        for ( int i = 0; i <= 10; i++ ){
            if ( i % 2 == 0 ) {
                System.out.println(i);
            }
        }

        // Mencetak Bilangan Ganjil
        for ( int i = 0; i <= 10; i++ ){
            if ( i % 2 != 0 ){
                System.out.println(i);
            }
        }

        // Mencetak Fizz, Buzz dan Fizzbuzz di kelipatan 3 dn 5
        for ( int i = 0; i <= 100; i++ ){
            if ( i % 3 == 0 && i % 5 == 0  ){
                System.out.println("FizzBuzz");
            } else if ( i % 3 == 0 ) {
                System.out.println("Fizz");
            } else  if ( i % 5 == 0 ){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        int angka [] = { 10,20,30,40,50 };
        int sum = 0;

        for ( int i = 0; i < angka.length; i++ ){
            sum += angka[i];
        }

        int jumlahdata = angka.length;
        int ratarata = sum / jumlahdata;

        System.out.println("Hasil Penjumlahan Array adalah : " +sum);
        System.out.println("Rata Rata Penjumlahan Array adalah : " +ratarata);

        // Membalikan Kata
        String Original = "Indonesia Raya";
        String Reversed = "";

        for ( int i = 0; i < Original.length(); i++ ){
            Reversed = Original.charAt(i) + Reversed;
        }

        System.out.println("Hasil dari pembalikan kata adalah : " +Reversed);

        // Hitung Jumlah Huruf dan Kata
        String Kalimat = "Aku sangat cinta indonesia";

        System.out.println("Total Huruf adalah : "+Kalimat.length());
        System.out.println("Total Kalimat adalah : "+Kalimat.split("\\s").length);





    }
}
