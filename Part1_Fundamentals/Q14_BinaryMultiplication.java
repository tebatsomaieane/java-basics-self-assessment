
package q14_binarymultiplication.java;

public class Q14_BinaryMultiplication {

    public static void main(String[] args) {

        String binary1 = "1010";
        String binary2 = "1101";

        int number1 = Integer.parseInt(binary1, 2);
        int number2 = Integer.parseInt(binary2, 2);

        int product = number1 * number2;

        String result = Integer.toBinaryString(product);

        System.out.println(binary1 + " * " + binary2 + " = " + result);
    }
}
