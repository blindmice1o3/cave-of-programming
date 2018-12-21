package java_for_complete_beginners.programming_core_java.iterators_and_implementing_iterable;

public class AppUrlLibrary {

    public static void main(String[] args) {
        UrlLibrary urlLibrary = new UrlLibrary();

        for (String html: urlLibrary) {
            System.out.println(html.length());
            System.out.println(html);
        }
    }

}
