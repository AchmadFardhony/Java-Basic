public class Main {

    //Static Method Hanya Bisa Dipanggil Di Class Nya Sendiri
    static void myStaticMethod() {
        System.out.println("I just got executed!");
    }
     //Public Method Bisa Dipanggil Di Class Nya Sendiri
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
      }

      public static void main (String[] args){
      myStaticMethod();
    
    }
}
