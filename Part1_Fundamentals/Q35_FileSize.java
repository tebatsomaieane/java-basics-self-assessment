
package q35_filesize;

import java.io.File;

public class Q35_FileSize {

    public static void main(String[] args) {

        File file = new File("Q35_FileSize.java");

        if (file.exists()) {
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist.");
        }
    }
}
