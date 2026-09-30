
package q17_decimaltooctal;

public class Q17_DecimalToOctal {

    public static void main(String[] args) {

        int decimal = 25;

        String octal = Integer.toOctalString(decimal);

        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
    }
}