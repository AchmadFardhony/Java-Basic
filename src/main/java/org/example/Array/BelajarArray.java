package org.example.Array;

import java.util.ArrayList;

public class BelajarArray {
    public static void main ( String [] args) {

        //Array 1 Dimensi
        String[] Presiden = {"Soekarno", "Soeharto", "SBY"};

        Presiden[2] = "Jokowi";
        System.out.println(Presiden[2]);
        System.out.println(Presiden.length);

        for (int i = 0; i < Presiden.length; i++) {
            System.out.println(Presiden[i]);
        }

        for (String i : Presiden) {
            System.out.println(i);
        }

        //Array 2 Dimensi
        String[][] Buah = {{"apel", "jeruk", "mangga"}, {"semangka", "melon"}};

        Buah[1][1] = "Anggur";
        System.out.println(Buah[1][1]);
        System.out.println(Buah.length);

        for (int i = 0; i < Buah.length; i++) {
            for (int j = 0; j < Buah[i].length; j++) {
                System.out.println(Buah[i][j]);  // Menampilkan elemen
            }
        }

        //Array List
        ArrayList<String> Gubernur = new ArrayList<>();
        Gubernur.add("Ahok");
        Gubernur.add("Anies");
        Gubernur.add("Sutiyoso");
        System.out.println(Gubernur);
        Gubernur.set(1, "Jokowi");
        System.out.println(Gubernur);
        Gubernur.remove(1);
        System.out.println(Gubernur);
        Gubernur.clear();
        System.out.println(Gubernur);

        for (int i = 0; i < Gubernur.size(); i++) {
            System.out.println(Gubernur.get(i));
        }

        for (String i : Gubernur) {
            System.out.println(i);
        }

    }
}
