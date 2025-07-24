import java.util.*;
public class Incometaxcal {

    //income tax calculator using else if condition
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount : ");
        int income = sc.nextInt();

        if (income < 50000) {
            System.out.println("tax is 0%");
        }
        else if (income >= 50000  && income <= 1000000){
            System.out.println("income tax : " + income *(0.2));
        }
        else {
            System.out.println("income tax :" + income *(0.3));
        }

    }
}
// this is the one way of solving problem 
// we can also take as int tax;