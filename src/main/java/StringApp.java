import org.apache.commons.lang3.StringUtils;

/**
 * Created by ${yleanavlaun} on ${01/10/2012}.
 */
public class StringApp {
    public static void main(String[] args) {
        String message = "Hello Beautiful world!";
        String reverseMessage = StringUtils.reverse(message);
        System.out.println(reverseMessage);

    }
}
