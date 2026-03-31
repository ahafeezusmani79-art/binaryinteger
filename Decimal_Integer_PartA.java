
    import java.util.Scanner;

public class Decimal_Integer_PartA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int original = num;
        String binary = "";

        if (num == 0) {
            binary = "0";
        } else {
            while (num > 0) {
                int rem = num % 2;
                binary = rem + binary;  // prepend
                num = num / 2;
            }
        }

        System.out.println("Binary of " + original + " = " + binary);
    }
}
    

