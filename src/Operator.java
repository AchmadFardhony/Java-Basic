public class Operator {
    public static void main (String[] args){
    int a = 5;
    System.out.println(a);

    int b = 5;
    b += 2;
    System.out.println(b);

    int c = 4;
    c -= 1;
    System.out.println(c);

    int d = 4;
    d *= 2;
    System.out.println(d);

    int e = 12;
    e /= 2;
    System.out.println(e);

    int f = 7;
    f %= 3;
    System.out.println(f);

    int g = 5;
    int h = 5;
    System.out.println(g == h);

    int i = 5;
    int j = 10;
    System.out.println(i != j);

    int k = 5;
    int l = 5;
    System.out.println(k >= l); // returns true because 5 is greater, or equal, to 3

    int m = 2;
    int n = 2;
    System.out.println(m <= n); // returns true because 5 is greater, or equal, to 3

    int o = 5;
    System.out.println(o > 2 && o < 10); // returns true because 5 is greater than 3 AND 5 is less than 10

    int p = 5;
    System.out.println(p > 3 || p < 4); // returns true because one of the conditions are true (5 is greater than 3, but 5 is not less than 4)

    String firstName = "John";
    String lastName = "Doe";
    System.out.println(firstName +" "+ lastName);



    }
}
