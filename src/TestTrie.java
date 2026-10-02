public class TestTrie {

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("java");
        trie.insert("javascript");
        trie.insert("japan");
        trie.insert("python");

        trie.autocomplete("jav");
    }
}