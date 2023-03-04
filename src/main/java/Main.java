import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the calculator app!");
        System.out.println("Enter the operation you want to perform: add, subtract, multiply, divide, fibonacciNumberFinder, intToBinaryNumber");
        String operation = scanner.nextLine();

        if (operation.equals("add")) {
            System.out.println("Enter the two numbers you want to add, separated by a space:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = add(a, b);
            System.out.println(result);
        } else if (operation.equals("subtract")) {
            System.out.println("Enter the two numbers you want to subtract, separated by a space:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = subtract(a, b);
            System.out.println(result);
        } else if (operation.equals("multiply")) {
            System.out.println("Enter the two numbers you want to multiply, separated by a space:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int result = multiply(a, b);
            System.out.println(result);
        } else if (operation.equals("divide")) {
            System.out.println("Enter the two numbers you want to divide, separated by a space:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            double result = divide(a, b);
            System.out.println(result);
        } else if (operation.equals("fibonacciNumberFinder")) {
            System.out.println("Enter the index of the fibonacci number you want to find:");
            int n = scanner.nextInt();
            int result = fibonacciNumberFinder(n);
            System.out.println(result);
        } else if (operation.equals("intToBinaryNumber")) {
            System.out.println("Enter the integer you want to convert to binary:");
            int n = scanner.nextInt();
            String result = intToBinaryNumber(n);
            System.out.println(result);
        } else {
            System.out.println("Invalid operation!");
        }

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

    public static double divide(int a, int b) {
        return (double) a / b;
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
        if (n == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 1) {
                binary.append("1");
            } else {
                binary.append("0");
            }
            n /= 2;
        }

        return binary.reverse().toString();
    }
}
