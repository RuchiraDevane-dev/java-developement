import java.util.*;
public class AgeCondition {
    // check the age of the person using if else
    //1st code
    
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("person is an aduld");
        }

        if (age>13 && age<=18) {
            System.out.println("teenager");
        }
        else {
            System.out.println("Person is not an adult");
        }


    }
}
