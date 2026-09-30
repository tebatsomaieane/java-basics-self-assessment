
package q30_listcharactersets;

import java.nio.charset.Charset;

public class Q30_ListCharacterSets {

    public static void main(String[] args) {

        for (String charset : Charset.availableCharsets().keySet()) {
            System.out.println(charset);
        }
    }
}