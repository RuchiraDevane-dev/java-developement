import java.util.*;
public class LeapYear {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("INPUT the year :");
        int year =sc.nextInt();
        
        boolean x =(year %4) ==0;
        boolean y = (year % 100) != 0;
        boolean z =((year % 100 ==0) && (year % 400==0));

        if (x && (y || z)) {
            System.out.println(year + "leap year");
        }
        else {
            System.out.println(year +"not a leap year");
        }


    }
}
