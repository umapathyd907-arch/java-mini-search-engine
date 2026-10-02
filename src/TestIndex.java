public class TestIndex {

    public static void main(String[] args) {

        InvertedIndex index = new InvertedIndex();

        index.addWord("java", 1);
        index.addWord("java", 3);
        index.addWord("dsa", 2);

        System.out.println(index.getDocuments("java"));
        System.out.println(index.getDocuments("dsa"));
        System.out.println(index.getDocuments("python"));
    }
}