//level 1 practice problems
//1. Find the Age of Harry (Birth Year: 2000, Current Year: 2024):
public class HarryAge {
    public static void main(String[] args) {
    
        int birthYear = 2000;
        int currentYear = 2024;
       
        int age = currentYear - birthYear;
    
        System.out.println("Harry's age in 2024 is " + age);
    }
}

//2.Average Percentage Marks in PCM for Sam:

public class SamAverageMark {
    public static void main(String[] args) {

        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        double average = (maths + physics + chemistry) / 3.0;

        System.out.println("Sam’s average mark in PCM is " + average);
    }
}

//3.Convert 10.8 Kilometers to Miles (1 km = 1.6 miles):
public class KmToMilesConverter {
    public static void main(String[] args) {
      
        double kilometers = 10.8;

        double miles = kilometers * 1.6;

        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

//4.Profit and Profit Percentage Calculation:
public class ProfitCalculator {
    public static void main(String[] args) {
  
        double costPrice = 129;
        double sellingPrice = 191;
       
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;
       
        System.out.printf(
            "The Cost Price is INR %.2f and Selling Price is INR %.2f\n" +
            "The Profit is INR %.2f and the Profit Percentage is %.2f%%\n",
            costPrice, sellingPrice, profit, profitPercent
        );
    }
}

//5.Divide 14 Pens Among 3 Students (Equal Division + Remainder):

public class PenDivision {
    public static void main(String[] args) {
      
        int totalPens = 14;
        int totalStudents = 3;
        
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;
       
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d\n",
                          pensPerStudent, remainingPens);
    }
}


//6. Discount on Student Course Fee:
public class CourseFeeDiscount {
    public static void main(String[] args) {
       
        double fee = 125000;
     
        double discountPercent = 10;
       
        double discount = (fee * discountPercent) / 100;
       
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n",
                          discount, finalFee);
    }
}


//7.Volume of Earth in km³ and miles³:
public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double kmToMiles = 0.621371;
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

        System.out.printf("The volume of Earth in cubic kilometers is %.2f and cubic miles is %.2f\n", volumeKm3, volumeMiles3);
    }
}
//8. Convert Distance in Kilometers to Miles (User Input):
import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        double miles = km / 1.6;

        System.out.printf("The total miles is %.2f mile for the given %.2f km\n", miles, km);
    }
}
//9.Student Fee and Discount (User Input)

import java.util.Scanner;

public class FeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = (fee * discountPercent) / 100;
        double finalFee = fee - discount;

        System.out.printf("The discount amount is INR %.2f and final discounted fee is INR %.2f\n", discount, finalFee);
    }
}
//10. Convert Height from cm to Feet and Inches

import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double cm = input.nextDouble();

        double inches = cm / 2.54;
        int feet = (int) (inches / 12);
        double remainingInches = inches % 12;

        System.out.printf("Your Height in cm is %.2f while in feet is %d and inches is %.2f\n", cm, feet, remainingInches);
    }
}
//11. Basic Calculator (Addition, Subtraction, Multiplication, Division)

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        System.out.printf("The addition, subtraction, multiplication and division value of 2 numbers %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f\n",
                number1, number2, number1 + number2, number1 - number2, number1 * number2, number1 / number2);
    }
}
//12. Area of Triangle (cm² and in²)

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = input.nextDouble();

        double areaCm2 = 0.5 * base * height;
        double areaIn2 = areaCm2 / 6.4516;

        System.out.printf("The area of the triangle is %.2f cm² and %.2f in²\n", areaCm2, areaIn2);
    }
}
//13. Find Side of Square from Perimeter

import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.printf("The length of the side is %.2f whose perimeter is %.2f\n", side, perimeter);
    }
}
//14. Convert Distance in Feet to Yards and Miles

import java.util.Scanner;

public class FeetToYardMile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.printf("The distance in feet is %.2f, in yards is %.2f and in miles is %.5f\n", feet, yards, miles);
    }
}
//15. Total Purchase Price (Unit Price × Quantity)

import java.util.Scanner;

public class TotalPurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter unit price (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity is %d and unit price is INR %.2f\n",
                          totalPrice, quantity, unitPrice);
    }
}
//16. Maximum Handshakes among N Students

import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        int handshakes = (n * (n - 1)) / 2;

        System.out.println("The maximum number of handshakes is: " + handshakes);
    }
}