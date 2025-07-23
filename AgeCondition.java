import java.util.*;
public class AgeCondition {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("person is an aduld");
        }
        else {
            System.out.println("Person is not an adult");
        }


    }
}
