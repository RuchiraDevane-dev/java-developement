import java.util.*;
public class NNumbers {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number : ");
        int N = sc.nextInt();
        int counter = 1;

        while (counter <= N) {
            System.out.print(counter + " ");
            counter ++;
        }
        System.out.println();
    }
}
