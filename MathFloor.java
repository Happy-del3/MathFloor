import java.text.DecimalFormat;
import java.util.Scanner;
 
public class MathFloor {
 
    public static void main(String[] args) {
        // Declare variables  
        double area, volume, radius, height, squareNumber,sqrtNumber,
               powNumber, baseNumber, sinRadian, cosRadian, tanRadian, sin, cos, tan;
        
        // Instantiate --> Create the Scanner object
        Scanner input = new Scanner(System.in);
        
        // Instantiate --> Create the DecimalFormat object
        DecimalFormat df  = new DecimalFormat("0.00");
        
        // Prompt for user to enter radius
        System.out.print("Please enter radius in (mm): ");
        
        // Read a double from the keyboard, and store it in radius
        radius  = input.nextDouble();
        
        // Prompt for user to enter height
        System.out.print("Please enter height in (mm): ");
        
        // Read a double from the keyboard, and store it in height
        height  = input.nextDouble();
        
        // Prompt for user to enter square root number
        System.out.print("Please enter square root number: ");
        
        // Read a double from the keyboard, and store it in sqrtNumber
        sqrtNumber  = input.nextDouble();
        
         // Prompt for user to enter base number of exponent
        System.out.print("Please enter the base number of exponent: ");
        
        // Read a double from the keyboard, and store it in baseNumber
        baseNumber  = input.nextDouble();
        
        // Display message
        System.out.println("Please choose from the numbers below." + "\n" +
                           "(0/30/45/60/90/180/270/360)");
        
        // Prompt for user to enter radian of sin
        System.out.print("\nEnter radian of sin: " );
        
        // Read a double from the keyboard, and store it in sinRadian
        sinRadian  = input.nextDouble();
        
        // Prompt for user to enter radian of cosRadian
        System.out.print("Enter radian of cos: " );
        
        // Read a double from the keyboard, and store it in cos
        cosRadian  = input.nextDouble();
        
        // Prompt for user to enter radian of tan
        System.out.print("Enter radian of tan: " );
        
        // Read a double from the keyboard, and store it in tanRadian
        tanRadian  = input.nextDouble();
        
        // Determine area of the cylinder using Math.PI
        area = 2 * Math.PI * radius * (radius + height);
        
        // Determine volume of the cylinder using Math.PI
        volume = Math.PI * radius * radius * height;
        
        // Determine square root number
        squareNumber = Math.sqrt(sqrtNumber);
        
        // Determine number to the power 2
        powNumber = Math.pow(baseNumber, 2);
                
        // Determine sin number
        sin = Math.sin(Math.toRadians(sinRadian));
        
        // Determine cos number
        cos = Math.cos(Math.toRadians(cosRadian));
        
        // Determine tan number
        tan = Math.tan(Math.toRadians(tanRadian));
        
        // Display output
        System.out.println("------------------------------------" + "\n" +
                           "Math PI is " + df.format(Math.PI) + "\n" +
                           "Area is " + df.format(area) + "\n" + 
                           "Volume is " + df.format(volume) + "\n" + 
                           "Square root of " + sqrtNumber + " is " + df.format(squareNumber) + "\n" +
                           "The base number of " + baseNumber + " to the power of 2 is " + powNumber + "\n" +
                           "sin of " + sinRadian + " is " + df.format(sin) + "\n" +
                           "cos of " + cosRadian + " is " + df.format(cos) + "\n" +
                           "tan of " + tanRadian + " is " + df.format(tan));
    }
    
}
