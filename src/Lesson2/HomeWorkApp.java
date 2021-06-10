package Lesson2;

public class HomeWorkApp {
    public static void main (String[] args) {
        System.out.println(isDiapazon(15, 10));
        if (isPossitive(-10)){
            System.out.println("Положительное число");
        }
        else {
            System.out.println("Отрицательное число");
        }
        System.out.println(isOtric(80));
        cycleString("hello", 5);
        System.out.println(isGod(200));
    }


    public static boolean isDiapazon (int one, int two) {
        int sum = one + two;
        return (sum <= 20) && (sum >= 10);
    }

    public static boolean isPossitive (int perem) {
        return (perem >= 0);
    }

    public static boolean isOtric (int chislo) {
        return (chislo <= 0);
    }

    public static void cycleString (String stroka, int raz) {

        for (int i = 0; i < raz; i++) {
            System.out.println(i + " " + stroka);
        }
    }

   public static boolean isGod (int god) {
     if (god % 400 ==0) {
         return true;
      }
     else if (god % 100 ==0) {
         return false;
     }
       if (god % 4 ==0) {
           return true;
       }
       return false;
    }

}
