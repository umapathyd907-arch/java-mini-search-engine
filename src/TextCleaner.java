public class TextCleaner {

    public static String cleanText(String text) {

        text = text.toLowerCase();

        text = text.replaceAll("[^a-z ]", "");

        return text;
    }
}