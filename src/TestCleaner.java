public class TestCleaner {

    public static void main(String[] args) {

        String text = "Java, Java! Programming.";

        String cleaned = TextCleaner.cleanText(text);

        System.out.println(cleaned);
    }
}