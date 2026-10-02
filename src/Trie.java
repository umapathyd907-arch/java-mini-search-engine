public class Trie {

    class TrieNode {

        TrieNode[] children = new TrieNode[26];

        boolean isWord;
    }

    TrieNode root = new TrieNode();

    public void insert(String word) {

        TrieNode current = root;

        for (char c : word.toLowerCase().toCharArray()) {

            int index = c - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isWord = true;
    }

    public boolean search(String word) {

    TrieNode current = root;

    for (char c : word.toLowerCase().toCharArray()) {

        int index = c - 'a';

        if (current.children[index] == null) {
            return false;
        }

        current = current.children[index];
    }

    return current.isWord;
}

public void autocomplete(String prefix) {

    TrieNode current = root;

    for (char c : prefix.toLowerCase().toCharArray()) {

        int index = c - 'a';

        if (current.children[index] == null) {
            return;
        }

        current = current.children[index];
    }

    System.out.println("Suggestions for " + prefix + ":");

    findWords(current, prefix.toLowerCase());
}

private void findWords(TrieNode node, String word) {

    if (node.isWord) {
        System.out.println(word);
    }

    for (char c = 'a'; c <= 'z'; c++) {

        int index = c - 'a';

        if (node.children[index] != null) {
            findWords(node.children[index], word + c);
        }
    }
}
}