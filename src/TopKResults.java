import java.util.PriorityQueue;

public class TopKResults {

    PriorityQueue<SearchResult> heap = new PriorityQueue<>(
            (a, b) -> a.score - b.score
    );
    public void addResult(SearchResult result) {

    heap.add(result);
}

public void addResult(SearchResult result, int k) {

    heap.add(result);

    if (heap.size() > k) {
        heap.poll();
    }
}
public void displayResults() {

    while (!heap.isEmpty()) {

        SearchResult result = heap.poll();

        System.out.println(
                "Document " + result.documentId
                + " → Score " + result.score
        );
    }
}
}