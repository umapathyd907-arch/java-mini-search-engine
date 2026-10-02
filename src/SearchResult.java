public class SearchResult {

    int documentId;
    int score;

    public SearchResult(int documentId, int score) {
        this.documentId = documentId;
        this.score = score;
    }
}