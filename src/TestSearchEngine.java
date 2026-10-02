public class TestSearchEngine {

    public static void main(String[] args) {

        InvertedIndex index = new InvertedIndex();

        index.addWord("java", 1);
        index.addWord("java", 3);

        index.addWord("dsa", 2);

        SearchEngine searchEngine = new SearchEngine(index);

        System.out.println("Search Results:");
        searchEngine.rankResults("java dsa");
    }
}