
package q32_password;

public class Q32_Password {

    public static void main(String[] args) {

        String password = "Java123";

        boolean hasLetter = false;
        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {

            char character = password.charAt(i);

            if (Character.isLetter(character)) {
                hasLetter = true;
            }

            if (Character.isDigit(character)) {
                hasDigit = true;
            }
        }

        if (password.length() >= 6 && hasLetter && hasDigit) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }
}
