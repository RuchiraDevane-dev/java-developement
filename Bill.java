import java.util.*;
public class Bill {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser ;

        System.out.println("STATIONARY BILL");
        System.out.println( "pencil " + pencil);
        System.out.println( "pen " + pen);
        System.out.println( "eraser " + eraser);
        
         System.out.println( "total amt " + total);
    }
    
}
