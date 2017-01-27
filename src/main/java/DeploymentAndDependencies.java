import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class DeploymentAndDependencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean inputIsNumeric;
        String message;
        String flippedCase;
        String reverseMessage;

        System.out.println("Please enter something: \n");
        message = scanner.nextLine();

        System.out.println("You entered: ");
        System.out.println(message);

        // check to see if the string is numeric
        inputIsNumeric = StringUtils.isNumeric(message); {
            if (inputIsNumeric) {
                System.out.println(message + " is numeric");
            } else {
                System.out.println(message + " is not numeric");
            }
        }

        reverseMessage = StringUtils.reverse(message);
        System.out.println("Reversed: " + reverseMessage);

        flippedCase = StringUtils.swapCase(message);
        System.out.println("Swapped case: " + flippedCase);
    }
}
