package calculator;

import java.util.Scanner;

public class Solar {

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
            throw new IllegalArgumentException("Number can not be divide by 0!");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter First Number : ");
            int input = sc.nextInt();

            System.out.println("Enter Second Number : ");
            int input1 = sc.nextInt();

            System.out.println("The Addition is : " + Solar.add(input, input1));
            System.out.println("The Subtraction is : " + Solar.sub(input, input1));
            System.out.println("The Multiplication is : " + Solar.mul(input, input1));
            System.out.println("The Division is : " + Solar.div(input, input1));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


