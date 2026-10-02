import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class InvertedIndex {

    HashMap<String, Set<Integer>> index = new HashMap<>();

    public void addWord(String word, int documentId) {

        index.putIfAbsent(word, new HashSet<>());

        index.get(word).add(documentId);
    }

    public Set<Integer> getDocuments(String word) {

        return index.getOrDefault(word, new HashSet<>());
    }
}