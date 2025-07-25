import java.util.*;
public class SumofN {
    public static void main(String aargs[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (sum <=n) {
            sum =+ i;
            i ++;
        }
        System.out.println("sum is : " +sum);
    }
}
