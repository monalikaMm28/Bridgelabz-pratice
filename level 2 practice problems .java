//level 2 practice problems:
//1. Basic Calculator for 2 Floating Point Numbers

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = sc.nextDouble();

        double sum = number1 + number2;
        double diff = number1 - number2;
        double product = number1 * number2;
        double quotient = number1 / number2;

        System.out.printf("The addition, subtraction, multiplication, and division value of two numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n", number1, number2, sum, diff, product, quotient);
    }
}
//2. Area of Triangle in cm² and in²

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base (cm): ");
        double base = sc.nextDouble();

        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / (2.54 * 2.54);  // 1 inch = 2.54 cm

        System.out.printf("The Area of the triangle in sq in is %.2f and sq cm is %.2f\n", areaIn2, areaCm2);
    }
}
//3. Side of Square from Perimeter
import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter perimeter of square: ");
        double perimeter = sc.nextDouble();

        double side = perimeter / 4;

        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
    }
}
//4. Convert Distance in Feet to Yards and Miles

import java.util.Scanner;

public class FeetToYardsMiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = sc.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.printf("The distance in yards is %.2f while the distance in miles is %.5f\n", yards, miles);
    }
}
//5. Total Price from Unit Price and Quantity

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter unit price: INR ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n", totalPrice, quantity, unitPrice);
    }
}
//6. Quotient and Remainder from Two Numbers

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.printf("The Quotient is %d and Remainder is %d of two numbers %d and %d\n", quotient, remainder, number1, number2);
    }
}
//7. Integer Operation with Precedence (a, b, c)

import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        int a = sc.nextInt();

        System.out.print("Enter value for b: ");
        int b = sc.nextInt();

        System.out.print("Enter value for c: ");
        int c = sc.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        System.out.printf("The results of Int Operations are %d, %d, %d, and %d\n", result1, result2, result3, result4);
    }
}
//8. Same Integer Operations using Double (DoubleOpt Program)

import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value for a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value for b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value for c: ");
        double c = sc.nextDouble();

        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        System.out.printf("The results of Double Operations are %.2f, %.2f, %.2f, and %.2f\n", result1, result2, result3, result4);
    }
}
