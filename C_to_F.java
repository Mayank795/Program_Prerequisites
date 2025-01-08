import java.util.*;

public class C_to_F{
 public static void main(String[] args){
    System.out.println("Celsius to Fehrenheit");
   Scanner scanner = new Scanner(System.in);
   System.out.println("enter celsius");
   float cel = scanner.nextInt();
   float  fah= (cel* (9f/5))+32;
 
System.out.println(fah);

  }
}