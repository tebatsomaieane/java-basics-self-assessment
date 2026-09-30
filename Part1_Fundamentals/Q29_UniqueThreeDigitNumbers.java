
package q29_uniquethreedigitnumbers;


public class Q29_UniqueThreeDigitNumbers {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 9; i++) {

            for (int j = 0; j <= 9; j++) {

                for (int k = 0; k <= 9; k++) {

                    if (i != j && i != k && j != k) {
                        System.out.println(i + "" + j + "" + k);
                        count++;
                    }
                }
            }
        }

        System.out.println("Total numbers: " + count);
    }
}