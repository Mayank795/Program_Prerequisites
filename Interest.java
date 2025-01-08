import java.util.*;

public class interest{
 public static void main(String[] args){
    System.out.println("Calculate simple interest");
   Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Principal");

   int p = scanner.nextInt();
   System.out.println("Enter Rate");

   int r = scanner.nextInt();
System.out.println("Enter Time");

    int t = scanner.nextInt();
System.out.println("Simple Interest" + (p*r*t)/100);

  }
}