
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int year = Integer.valueOf(scan.nextLine());
// if year is divisble by 4 and not divisbly by 100 or divisble by 400 it is leap year else not leap year.
        if (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}

