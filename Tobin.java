
import java.util.Scanner; 
public class TobinK_Lab5
{ 
public static void main(String[] args)
{ 
Scanner keyboard = new Scanner(System.in);

    Triangle tri1 = new Triangle();
        System.out.println("Triangle 1 Information:");
        System.out.println(tri1.toString());
        
          int lastDigitOfID = 1;

      
        System.out.println("\nTriangle 1 Information after updating base:");
        System.out.println(tri1.toString());

        System.out.print("\nEnter base of Triangle 2: ");
        int base2 = keyboard.nextInt();
        System.out.print("Enter height of Triangle 2: ");
        int height2 = keyboard.nextInt();
        System.out.print("Enter color of Triangle 2: ");
        String color2 = keyboard.nextLine();
        
        
        Triangle tri2 = new Triangle (base2, height2, color2);
        System.out.println("\nTriangle 2 Information:");
        System.out.println(tri2.toString());

        Triangle tri3 = new Triangle(tri2);
        System.out.println("\nTriangle 3 Information:");
        System.out.println(tri3.toString());

        System.out.println("\nComparing Triangle 2 and Triangle 3:");
        if (tri2.equals(tri3)) {
            System.out.println("Triangle 2 and Triangle 3 are the same.");
        } else {
            System.out.println("Triangle 2 and Triangle 3 are different.");
        }

        tri3.setBase(tri3.getBase() * 2);
        System.out.println("\nTriangle 3 Information after doubling base:");
        System.out.println(tri3.toString());
        System.out.println("\nComparing Triangle 2 and Triangle 3 again:");
        
        if (tri2.equals(tri3)) {
            System.out.println("Triangle 2 and Triangle 3 are the same.");
        } else {
            System.out.println("Triangle 2 and Triangle 3 are different.");
        }

        Triangle tri4 = tri1.copy();
        System.out.println("\nTriangle 4 Information (copied from Triangle 1):");
        System.out.println(tri4.toString());

        System.out.println("\nComparing Triangle 1 and Triangle 4:");
        if (tri1.equals(tri4)) {
            System.out.println("Triangle 1 and Triangle 4 are the same.");
        } else {
            System.out.println("Triangle 1 and Triangle 4 are different.");
        }

        System.out.print("\nEnter new color for Triangle 1: ");
        String newColor = keyboard.next();
        tri1.replaceColor(newColor);
        System.out.println("\nTriangle 1 Information after updating color:");
        System.out.println(tri1.toString());
        System.out.println("\nComparing Triangle 1 and Triangle 4 again:");
        if (tri1.equals(tri4)) {
            System.out.println("Triangle 1 and Triangle 4 are the same.");
        } else {
            System.out.println("Triangle 1 and Triangle 4 are different.");
        }

        double totalArea = tri1.getArea() + tri2.getArea() + tri3.getArea() + tri4.getArea();
        System.out.println("\nTotal Area of 4 Triangles: " + totalArea);
    }
}
   
   
   
   
   
  
   
    
