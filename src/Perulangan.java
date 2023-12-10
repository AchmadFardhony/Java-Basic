public class Perulangan {
    public static void main (String[] args){

//IF
if (20 > 18) {
System.out.println("20 is greater than 18");
    }


//IF - ELSE
 int Age = 90;
 if (Age < 50) {
 System.out.println("Young.");
    } else {
 System.out.println("Old.");
        }

//IF - ELSE - IF
int time = 15;
if (time > 40) {
  System.out.println("Good morning.");
} else if (time < 18) {
  System.out.println("Good day.");
} else {
  System.out.println("Good evening.");
        }
//SWITCH
int day = 2;
switch (day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    break;
  case 5:
    System.out.println("Friday");
    break;
        }   

//FOR
for (int i = 0; i <= 5; i++) {
  System.out.println(i);
        }

for (int i = 0; i <= 10; i = i + 2) {
    System.out.println(i);
          }  

// Outer loop.
for (int i = 1; i <= 2; i++) {
    System.out.println("Outer: " + i); // Executes 2 times
        
// Inner loop
for (int j = 1; j <= 3; j++) {
     System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
         }
      }

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    break;
  }
  System.out.println(i);
        }
    }
}
