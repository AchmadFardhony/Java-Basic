package org.example.Perulangan;

public class BelajarPerulangan {
    public static void main(String[] args){

        int nilaisiswa = 60;

        if ( nilaisiswa >= 75 ){
            System.out.println("Baik");
        }else if ( nilaisiswa == 60){
            System.out.println("Cukup Baik");
        }else{
            System.out.println("Kurang");
        }

        String JudulFilm = "Narnia";
        int HargaTiket = 100;

        if (JudulFilm == "Lord Of The Rings" && HargaTiket == 100){
            System.out.println("Data nya Benar");
        }else {
            System.out.println("Data Nya Salah");
        }

        if (JudulFilm == "Lord Of The Rings" || HargaTiket == 100){
            System.out.println("Data nya Benar");
        }else {
            System.out.println("Data Nya Salah");
        }

        int day = 3;
        switch (day){
            case 1:
                System.out.println("Hari ini adalah hari senin");
                break;
            case 2:
                System.out.println("Hari ini adalah hari selasa");
                break;
            case 3:
                System.out.println("Hari ini adalah hari rabu");
                break;
            case 4:
                System.out.println("Hari ini adalah hari kamis");
                break;
            case 5:
                System.out.println("Hari ini adalah hari jumat");
                break;
            case 6:
                System.out.println("Hari ini adalah hari sabtu");
                break;
            case 7:
                System.out.println("Hari ini adalah hari minggu");
                break;
            default:
                System.out.println("hari yang di pilih tidak ada");
        }

        for ( int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        int b = 1;
        while ( b <= 5 ){
            System.out.println(b);
            b++;
        }

        int c = 0;
        while ( c <= 10){
            System.out.println(c);
            c+=2;
        }
    }
}
