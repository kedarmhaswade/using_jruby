import java.net.URL;

public class URLDemo {
    public static String retrieveURL(URL url) {
        System.out.println("Passed: " + url.getClass().getName());
        return "big list of book titles";
    }
}
