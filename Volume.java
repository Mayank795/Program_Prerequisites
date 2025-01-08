import java.util.*;

public class Volume{
 public static void main(String[] args){
    System.out.println("Volume of Cylinder");

   Scanner scanner = new Scanner(System.in);
   System.out.println("enter radius");

   int r = scanner.nextInt();
System.out.println("enter hieght");

   int h = scanner.nextInt();
    float v =(22f/7)*r*r*h;
System.out.println("volume of Cylinder"+ " "+v);

  }
}