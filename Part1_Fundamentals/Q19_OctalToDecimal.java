
package q19_octaltodecimal;

public class Q19_OctalToDecimal {

    public static void main(String[] args) {

        String octal = "31";

        int decimal = Integer.parseInt(octal, 8);

        System.out.println("Octal: " + octal);
        System.out.println("Decimal: " + decimal);
    }
}