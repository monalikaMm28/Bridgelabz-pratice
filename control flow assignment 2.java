//control flow assignment 2:
//1. Odd and Even Numbers

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0)
                System.out.println(i + " is Even");
            else
                System.out.println(i + " is Odd");
        }
    }
}
//2. Bonus Based on Years of Service

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("Bonus amount: INR " + bonus);
        } else {
            System.out.println("No bonus awarded.");
        }
    }
}
//3. Multiplication Table from 6 to 9

import java.util.Scanner;

public class MultiplicationRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = sc.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}
//4. FizzBuzz with for loop

import java.util.Scanner;

public class FizzBuzzFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
//5. FizzBuzz with while loop

import java.util.Scanner;

public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int i = 1;
        while (i <= number) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
            i++;
        }
    }
}
//6. Youngest and Tallest

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age of Amar: ");
        int ageA = sc.nextInt();
        System.out.print("Enter height of Amar: ");
        double heightA = sc.nextDouble();

        System.out.print("Enter age of Akbar: ");
        int ageB = sc.nextInt();
        System.out.print("Enter height of Akbar: ");
        double heightB = sc.nextDouble();

        System.out.print("Enter age of Anthony: ");
        int ageC = sc.nextInt();
        System.out.print("Enter height of Anthony: ");
        double heightC = sc.nextDouble();

        // Youngest
        if (ageA < ageB && ageA < ageC) System.out.println("Amar is the youngest.");
        else if (ageB < ageC) System.out.println("Akbar is the youngest.");
        else System.out.println("Anthony is the youngest.");

        // Tallest
        if (heightA > heightB && heightA > heightC) System.out.println("Amar is the tallest.");
        else if (heightB > heightC) System.out.println("Akbar is the tallest.");
        else System.out.println("Anthony is the tallest.");
    }
}
//7. Factors using for loop

import java.util.Scanner;

public class FactorsForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.println(i + " is a factor");
        }
    }
}
//8. Factors using while loop

import java.util.Scanner;

public class FactorsWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        int i = 1;
        while (i <= number) {
            if (number % i == 0)
                System.out.println(i + " is a factor");
            i++;
        }
    }
}
//9. Greatest Factor using for loop

import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor (excluding itself): " + greatestFactor);
    }
}
//10. Greatest Factor using while loop

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int counter = number - 1;
        int greatestFactor = 1;

        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor (excluding itself): " + greatestFactor);
    }
}
//11. Multiples of a Number Below 100 (for loop)

import java.util.Scanner;

public class MultiplesBelow100For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}
//12. Power of a Number using for loop

import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        for (int i = 1; i <= power; i++) {
            result *= number;
        }
        System.out.println(number + " raised to power " + power + " is: " + result);
    }
}
//13. Multiples of a Number Below 100 (while loop)

import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number less than 100: ");
        int number = sc.nextInt();

        int counter = 100;
        while (counter > 0) {
            if (counter % number == 0) {
                System.out.println(counter);
            }
            counter--;
        }
    }
}
//14. Power of a Number using while loop

import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println(number + " raised to power " + power + " is: " + result);
    }
}
