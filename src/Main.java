import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String password = scanner.nextLine();
            if (password.length() < 8) {
                throw new PasswordTooShortException("The password is too short(min 8)");
            }

            System.out.println("success");
        } catch (PasswordTooShortException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

