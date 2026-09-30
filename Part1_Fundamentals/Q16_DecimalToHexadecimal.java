
package q16_decimaltohexadecimal;

public class Q16_DecimalToHexadecimal {

    public static void main(String[] args) {

        int decimal = 25;

        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + hexadecimal);
    }
}