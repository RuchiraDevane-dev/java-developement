import java.util.*;
public class CalculatorSwitch {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A :");
        int A = sc.nextInt();
        System.out.println("ENTER B :");
        int B = sc.nextInt();
        System.out.println("ENTER OPERATOR :");
        // char at taken for operator
        char operator =sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(A+B);
            break;
            case '-' : System.out.println(A-B);
            break;
            case '%' : System.out.println(A%B);
            break;
            case '*' : System.out.println(A*B);
            break;
            case '/' :System.out.println(A/B);
            break;
            default : System.out.println("solve it by own ");
        }
    }
}
