public class Array {
    public static void main (String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[1] = "Opel";
            System.out.println(cars[1]);

    //Perulangan Array
       String[] Fruits = {"Apel", "Semangka", "Melon", "Mangga"};
       for (int i = 0; i < Fruits.length; i++) {
          System.out.println(Fruits[i]);
        }
        
    //Array MultiDimensi
    int[][] myNumbers1 = { {1, 2, 3, 4}, {5, 6, 7} };
    myNumbers1[1][2] = 9;
    System.out.println(myNumbers1[1][2]); // Outputs 9 instead of 

    //Perulangan Aray Multi Dimensi
    int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
    for (int i = 0; i < myNumbers2.length; ++i) {
       for(int j = 0; j < myNumbers2[i].length; ++j) {
          System.out.println(myNumbers2[i][j]);
            }
        }
    }
}