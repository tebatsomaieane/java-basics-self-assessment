
package q37_formatteddatetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q37_FormattedDateTime {

    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println("Current date and time: " + format.format(date));
    }
}
