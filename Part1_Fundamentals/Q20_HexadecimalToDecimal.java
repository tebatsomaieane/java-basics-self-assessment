
package q20_hexadecimaltodecimal;

public class Q20_HexadecimalToDecimal {

    public static void main(String[] args) {

        String hexadecimal = "19";

        int decimal = Integer.parseInt(hexadecimal, 16);

        System.out.println("Hexadecimal: " + hexadecimal);
        System.out.println("Decimal: " + decimal);
    }
}
