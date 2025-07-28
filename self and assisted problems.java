//Assisted problems:
//Write a program that prints "Welcome to Bridgelabz!" to the screen 
public class WelcomeMessage {
    public static void main(String[] args) {
        System.out.println("Welcome to Bridgelabz!");
    }
}


//Write a program that takes two numbers as input from the user and prints their sum
import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("The sum is: " + sum);

        scanner.close();
    }
}

//Write a program that takes the temperature in Celsius as input and converts
it to Fahrenheit using the formula:Fahrenheit = (Celsius * 9/5) + 32.
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
		
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }
}


//Write a program to calculate the area of a circle. Take the radius as input
and use the formula: Area = π * radius^2.
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * radius * radius;

        System.out.println("Area of the circle is: " + area);

        scanner.close();
    }
}


//Write a program to calculate the volume of a cylinder. Take the radius and
height as inputs and use the formula:Volume = π * radius^2 * height.
import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();
		
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = Math.PI * radius * radius * height;

        System.out.println("Volume of the cylinder is: " + volume);

        scanner.close();
    }
}

//Self problems
//1.Write a program to calculate simple interest using the formula:
Simple Interest = (Principal * Rate * Time) / 100.Take Principal, Rate, and Time as inputs from the user.
import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Principal amount: ");
        double principal = scanner.nextDouble();
       
        System.out.print("Enter the Rate of Interest: ");
        double rate = scanner.nextDouble();
     
        System.out.print("Enter the Time (in years): ");
        double time = scanner.nextDouble();
     
        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.println("Simple Interest is: " + simpleInterest);

        // Close the scanner
        scanner.close();
    }
}


//2.Write a program to calculate the perimeter of a rectangle. Take the length
and width as inputs and use the formula:Perimeter = 2 * (length + width).
import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double perimeter = 2 * (length + width);
       
        System.out.println("Perimeter of the rectangle is: " + perimeter);
       
        scanner.close();
    }
}

//3.Write a program that takes two numbers as input: a base and an exponent,
and prints the result of base raised to the exponent (without using loops or conditionals).
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
      
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
      
        double result = Math.pow(base, exponent);
      
        System.out.println(base + " raised to the power " + exponent + " is: " + result);
        
        scanner.close();
    }
}


//4.Write a program that takes three numbers as input from the user and prints their average.
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter the third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3;
		
        System.out.println("The average is: " + average);

        scanner.close();
    }
}


//5.Write a program that takes the distance in kilometers as input from the user
and converts it into miles using the formula:Miles = Kilometers * 0.621371.
import java.util.Scanner;

public class KilometerToMiles {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.62137
		
        System.out.println("Distance in miles: " + miles);
        
        scanner.close();
    }
}
