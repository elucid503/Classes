package Classwork.Binary;

public class Converter {

    public static void main(String[] args) {

        System.out.println("Decimal to Binary: " + decimalToBinaryRecursive(13));
        System.out.println("Binary to Decimal: " + binaryToDecimalRecursive(1101));

    }

    public static String decimalToBinaryRecursive(int n) {

        if (n == 0) {

            return "0";

        } else if (n == 1) {

            return "1";

        } else {

            int remainder = n % 2;
            return decimalToBinaryRecursive(n / 2) + remainder;

        }

    }
    
    public static int binaryToDecimalRecursive(int bin) {

        if (bin == 0) {

            return bin;

        } else if (bin == 1) {

            return 1;

        } else {

            return (bin % 10) + (2 * binaryToDecimalRecursive(bin / 10)); // 1101 = 1 + 2 * (0 + 2 * (1 + 2 * (1 + 2 * 1)))

        }

    }

}