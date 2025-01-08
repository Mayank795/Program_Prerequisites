import java.util.*;

public class K_M{
 public static void main(String[] args){
    System.out.println("kilometer to miles");

   Scanner scanner = new Scanner(System.in);
   System.out.println("enter kilometer");

   double k = scanner.nextDouble();

    double m = k*0.62131;
System.out.println("Miles"+ " "+m);

  }
}