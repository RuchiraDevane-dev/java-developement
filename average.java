import java.util.*;
public class average{
    // average of three numbers
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        
        int average = (A + B + C) / 3 ;

        System.out.println( "average is " + average);


}

}