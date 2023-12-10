public class TypeData {
    public static void main (String[] args){
        byte myNum1 = 100;
        System.out.println(myNum1);

        short myNum2 = 5000;
        System.out.println(myNum2);

        int myNum3 = 100000;
        System.out.println(myNum3);

        long myNum4 = 15000000000L;
        System.out.println(myNum4);

        float myNum5 = 5.75f;
        System.out.println(myNum5);

        double myNum6 = 19.99d;
        System.out.println(myNum6);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false


        int myInt1 = 9;
        double myDouble1 = myInt1; // Automatic casting: int to double
    
        System.out.println(myInt1);      // Outputs 9
        System.out.println(myDouble1);   // Outputs 9.0


        double myDouble2 = 9.78d;
        int myInt2 = (int) myDouble2; // Manual casting: double to int
    
        System.out.println(myDouble2);   // Outputs 9.78
        System.out.println(myInt2);      // Outputs 9

    }
}

