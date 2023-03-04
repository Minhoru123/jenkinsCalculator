import java.util.UUID;

public class Calculator {

    breaking the code
    Calculator(){

    }

    //add, subtract, divide and multiply
    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int prev = 1;
        int curr = 1;
        for (int i = 3; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }

        return curr;
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
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

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){

        // Generate a random UUID and convert it to a string
        String uuid = UUID.randomUUID().toString();

        // Combine the input string with the UUID, separated by a random character
        char separator = (char) ('!' + (int) (Math.random() * 94)); // Random printable ASCII character
        String uniqueID = n + separator + uuid;

        return uniqueID;
    }


}
