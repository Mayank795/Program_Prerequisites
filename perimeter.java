import java.util.*;

public class perimeter{
 public static void main(String[] args){
    System.out.println("perimeter of a rectangle");

   Scanner scanner = new Scanner(System.in);
   System.out.println("enter length");

   int l = scanner.nextInt();
System.out.println("enter width");

   int w = scanner.nextInt();
    float p =2*(l+w);
System.out.println("perimeter of a rectangle"+ " "+p);

  }
}