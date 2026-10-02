import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        InvertedIndex index = new InvertedIndex();

        // Read the actual documents
        String javaText = FileReaderUtil.readFile("data/java.txt");
        String dsaText = FileReaderUtil.readFile("data/dsa.txt");
        String springText = FileReaderUtil.readFile("data/spring.txt");

        // Clean the documents
        javaText = TextCleaner.cleanText(javaText);
        dsaText = TextCleaner.cleanText(dsaText);
        springText = TextCleaner.cleanText(springText);

        // Add words to the inverted index
        addWordsToIndex(index, javaText, 1);
        addWordsToIndex(index, dsaText, 2);
        addWordsToIndex(index, springText, 3);

        SearchEngine searchEngine = new SearchEngine(index);

        // Trie for autocomplete
        Trie trie = new Trie();

        trie.insert("java");
        trie.insert("javascript");
        trie.insert("japan");
        trie.insert("python");

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Mini Search Engine ===");

        System.out.print("Enter search word: ");

        String query = scanner.nextLine().toLowerCase();

        System.out.println("\nAutocomplete:");

        trie.autocomplete(query);

        System.out.println("\nResults:");

        searchEngine.rankResults(query);

        scanner.close();
    }

    public static void addWordsToIndex(
            InvertedIndex index,
            String text,
            int documentId) {

        String[] words = text.split("\\s+");

        for (String word : words) {

            if (!word.isEmpty()) {
                index.addWord(word, documentId);
            }
        }
    }
}