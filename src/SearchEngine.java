import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SearchEngine {

    InvertedIndex index;

    public SearchEngine(InvertedIndex index) {
        this.index = index;
    }

    public void search(String word) {

        System.out.println("Searching for: " + word);

        System.out.println("Documents found: "
                + index.getDocuments(word));
    }

    public void searchMultipleWords(String query) {

        String[] words = query.toLowerCase().split(" ");

        Set<Integer> results = new HashSet<>();

        for (String word : words) {
            results.addAll(index.getDocuments(word));
        }

        System.out.println("Search results: " + results);
    }
    public void rankResults(String query) {

    String[] words = query.toLowerCase().split(" ");

    HashMap<Integer, Integer> scores = new HashMap<>();

    for (String word : words) {

        Set<Integer> documents = index.getDocuments(word);

        for (int documentId : documents) {

            scores.put(
                documentId,
                scores.getOrDefault(documentId, 0) + 1
            );
        }
    }

    sortResults(scores);
}
public void sortResults(HashMap<Integer, Integer> scores) {

    scores.entrySet()
            .stream()
            .sorted((a, b) -> b.getValue() - a.getValue())
            .forEach(entry ->
                    System.out.println(
                            "Document " + entry.getKey()
                            + " → Score " + entry.getValue()
                    )
            );
}
}