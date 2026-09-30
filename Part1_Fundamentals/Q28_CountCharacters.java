
package q28_countcharacters;

public class Q28_CountCharacters {

    public static void main(String[] args) {

        String text = "Java Programming";

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            count++;
        }

        System.out.println("Number of characters: " + count);
    }
}