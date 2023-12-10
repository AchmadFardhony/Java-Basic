// Cara Manggil Kelas / Package Java
import java.util.Scanner;

public class Import {

  public static void main(String[] args) {
    // Cara Ambil Inputan
    Scanner myInput = new Scanner(System.in);
    System.out.println("Enter username : ");

    // Cara Menegeluarkan Hasil Inputan
    String userName = myInput.nextLine();
    System.out.println("Username is: " + userName);
  }
}
    

