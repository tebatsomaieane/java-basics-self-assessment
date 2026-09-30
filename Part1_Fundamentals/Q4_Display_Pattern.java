
package q4_display_pattern;


public class Q4_Display_Pattern {

   
    public static void main(String[] args) {
        String[] pattern = {
            "      J     a    v     v    a",
            "      J    a a    v   v    a a",
            "J     J   aaaaa    V V    aaaaa",
            "  J J    a     a    V    a     a"
        };

        for (int i = 0; i < pattern.length; i++) {
            System.out.println(pattern[i]);
        }
    }
    
}
