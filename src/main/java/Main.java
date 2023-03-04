import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator!");

        while (true) {
            System.out.print("Enter a command(exit to quit): ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            String[] parts = input.split(" ");
            String operation = parts[0];
            int operand1 = 0;
            int operand2 = 0;
            if (parts.length > 1) {
                operand1 = Integer.parseInt(parts[1]);
            }
            if (parts.length > 2) {
                operand2 = Integer.parseInt(parts[2]);
            }
            int result = 0;
            if (operation.equals("add")) {
                result = add(operand1, operand2);
            } else if (operation.equals("subtract")) {
                result = subtract(operand1, operand2);
            } else if (operation.equals("multiply")) {
                result = multiply(operand1, operand2);
            } else if (operation.equals("divide")) {
                result = divide(operand1, operand2);
            } else if (operation.equals("fibonacci")) {
                result = fibonacciNumberFinder(operand1);
            } else if (operation.equals("binary")) {
                String binary = intToBinaryNumber(operand1);
                System.out.println("Result: " + binary);
                continue;
            } else {
                System.out.println("Invalid operation!");
                continue;
            }
            System.out.println("Result: " + result);
        }

        System.out.println("Thanks for using the calculator!");
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
