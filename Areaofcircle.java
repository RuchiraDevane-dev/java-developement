import java.util.*;
public class Areaofcircle{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        float radius = sc.nextFloat();
        //f is used to define a float value
        //without f ye double value lega
        float area = 3.14f * radius *radius;
        System.out.println( "Area of circle is : " + area );
}
}