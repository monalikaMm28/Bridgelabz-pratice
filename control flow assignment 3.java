//control flow assignment 3:
//1. Leap Year Check (Multiple if-else)

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Invalid input. Only valid for year >= 1582");
        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Leap Year");
        } else if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
//2. Leap Year with Single if using && and ||

if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
    System.out.println("Leap Year");
} else {
    System.out.println("Not a Leap Year");
}

//3. Percentage and Grade Calculator

Scanner sc = new Scanner(System.in);
System.out.print("Enter marks in Physics: ");
int phy = sc.nextInt();
System.out.print("Enter marks in Chemistry: ");
int chem = sc.nextInt();
System.out.print("Enter marks in Maths: ");
int math = sc.nextInt();

int total = phy + chem + math;
double percentage = total / 3.0;

System.out.println("Average Mark: " + percentage);
if (percentage >= 90)
    System.out.println("Grade: A+");
else if (percentage >= 75)
    System.out.println("Grade: A");
else if (percentage >= 60)
    System.out.println("Grade: B");
else if (percentage >= 50)
    System.out.println("Grade: C");
else
    System.out.println("Grade: F");
	
//4. Prime Number Check

int num = sc.nextInt();
boolean isPrime = num > 1;

for (int i = 2; i <= Math.sqrt(num); i++) {
    if (num % i == 0) {
        isPrime = false;
        break;
    }
}
System.out.println(num + (isPrime ? " is Prime" : " is Not Prime"));

//5. Armstrong Number

int number = sc.nextInt(), original = number, sum = 0;
while (original != 0) {
    int digit = original % 10;
    sum += Math.pow(digit, 3);
    original /= 10;
}
System.out.println(number + (number == sum ? " is Armstrong" : " is Not Armstrong"));


//6.Count Digits
java
Copy
Edit
int num = sc.nextInt(), count = 0;
while (num != 0) {
    num /= 10;
    count++;
}
System.out.println("Number of digits: " + count);


//7. BMI Calculator

System.out.print("Enter weight in kg: ");
double weight = sc.nextDouble();
System.out.print("Enter height in cm: ");
double heightCm = sc.nextDouble();
double heightM = heightCm / 100.0;
double bmi = weight / (heightM * heightM);
System.out.println("BMI is: " + bmi);

if (bmi < 18.5)
    System.out.println("Underweight");
else if (bmi < 24.9)
    System.out.println("Normal weight");
else if (bmi < 29.9)
    System.out.println("Overweight");
else
    System.out.println("Obesity");
	
	
//8. Harshad Number

int number = sc.nextInt(), temp = number, sum = 0;
while (temp != 0) {
    sum += temp % 10;
    temp /= 10;
}
System.out.println(number + (number % sum == 0 ? " is Harshad" : " is Not Harshad"));


//9.Abundant Number
java
Copy
Edit
int number = sc.nextInt(), sum = 0;
for (int i = 1; i < number; i++) {
    if (number % i == 0) sum += i;
}
System.out.println(number + (sum > number ? " is Abundant" : " is Not Abundant"));


//10.Switch Case Calculator

System.out.print("Enter first number: ");
double first = sc.nextDouble();
System.out.print("Enter second number: ");
double second = sc.nextDouble();
System.out.print("Enter operator (+, -, *, /): ");
String op = sc.next();

switch (op) {
    case "+":
        System.out.println("Sum = " + (first + second));
        break;
    case "-":
        System.out.println("Difference = " + (first - second));
        break;
    case "*":
        System.out.println("Product = " + (first * second));
        break;
    case "/":
        if (second != 0)
            System.out.println("Quotient = " + (first / second));
        else
            System.out.println("Division by zero not allowed.");
        break;
    default:
        System.out.println("Invalid operator.");
}


//11. Day of the Week from Date

public class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + 31 * m0 / 12) % 7;

        System.out.println("Day of the week (0=Sunday,...): " + dayOfWeek);
    }
}
