public class TestTopK {

    public static void main(String[] args) {

        TopKResults topK = new TopKResults();

        topK.addResult(new SearchResult(1, 5), 3);
        topK.addResult(new SearchResult(2, 2), 3);
        topK.addResult(new SearchResult(3, 8), 3);
        topK.addResult(new SearchResult(4, 1), 3);

        topK.displayResults();
    }
}