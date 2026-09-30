
package q13_binaryaddition;

public class Q13_BinaryAddition {

    public static void main(String[] args) {

        String binary1 = "1010";
        String binary2 = "1101";

        int number1 = Integer.parseInt(binary1, 2);
        int number2 = Integer.parseInt(binary2, 2);

        int sum = number1 + number2;

        String result = Integer.toBinaryString(sum);

        System.out.println(binary1 + " + " + binary2 + " = " + result);
    }
}
