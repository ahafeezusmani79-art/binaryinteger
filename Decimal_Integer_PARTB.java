import java.util.Scanner;

public class Decimal_Integer_PARTB {

    // Function to convert decimal to binary and return array
    public static int[] decimalToBinary(int num) {
        int temp = num;
        int size = 0;

        // Count number of binary digits
        if (num == 0) {
            return new int[]{0};
        }

        while (temp > 0) {
            size++;
            temp = temp / 2;
        }

        int[] binary = new int[size];

        // Fill array from end
        for (int i = size - 1; i >= 0; i--) {
            binary[i] = num % 2;
            num = num / 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int[] result = decimalToBinary(num);

        System.out.print("Binary = ");
        for (int digit : result) {
            System.out.print(digit);
        }
    }
}
