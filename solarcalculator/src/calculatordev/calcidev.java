package calculatordev;

import java.util.Scanner;

public class calcidev {

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static int sub(int number1, int number2) {
        return (number1 - number2);
    }

    public static int mul(int number1, int number2) {
        return number1 * number2;
    }

    public static double div(double number1, double number2) {
        if (number2 == 0) {
            throw new IllegalArgumentException("Number can not be divided by 0!");
        }

        return number1 / number2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        int input = sc.nextInt();
        
        System.out.println("Enter Second Number : ");
        int input1 = sc.nextInt();
        
        sc.close(); // Close scanner object after use

        System.out.println("The Addition is : " + calcidev.add(input, input1));
        System.out.println("The Subtraction is : " + calcidev.sub(input, input1));
        System.out.println("The Multiplication is : " + calcidev.mul(input, input1));
        
        try {
            System.out.println("The Division is : " + calcidev.div(input, input1));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
