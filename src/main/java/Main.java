import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input in the format 'Input: operation operand1 operand2':");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        String operation = parts[1];
        int operand1 = Integer.parseInt(parts[2]);
        int operand2 = Integer.parseInt(parts[3]);

        int result = 0;
        if (operation.equals("add")) {
            result = add(operand1, operand2);
        } else if (operation.equals("subtract")) {
            result = subtract(operand1, operand2);
        } else if (operation.equals("multiply")) {
            result = multiply(operand1, operand2);
        } else if (operation.equals("divide")) {
            result = divide(operand1, operand2);
        } else if (operation.equals("fibonacciNumberFinder")) {
            result = fibonacciNumberFinder(operand1);
        } else if (operation.equals("intToBinaryNumber")) {
            String binary = intToBinaryNumber(operand1);
            System.out.println("Result: " + binary);
            return;
        } else {
            System.out.println("Invalid operation!");
            return;
        }

        System.out.println("Result: " + result);

        scanner.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static int fibonacciNumberFinder(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static String intToBinaryNumber(int n) {
        return Integer.toBinaryString(n);
    }
}