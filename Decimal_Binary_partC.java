import java.util.Scanner;

public class Decimal_Binary_partC {

    // User-defined function
    public static String decimalToBinary(int num) {
        if (num == 0) {
            return "0";
        }

        String binary = "";

        while (num > 0) {
            int rem = num % 2;
            binary = rem + binary;   // prepend remainder
            num = num / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        String result = decimalToBinary(num);

        System.out.println("Binary representation = " + result);
    }
}
