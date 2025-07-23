import java.util.*;
public class OddorEven {
    public static void main (String args[]){
        System.out.println("enter a number : ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        

        if (N % 2 == 0) {
            System.out.println("number is even");
        }
        else {
            System.out.println("number is odd");
        }
    }
    
}
