package codingPractice.LyricsSearch;

import java.util.Map;
import java.util.HashMap;
class Solution01 {
    private final int R = 26;
    private class TrieNode {
    	private TrieNode[] next;
        private boolean isEnd;
        private TrieNode() {
            next = new TrieNode[R];
        }
    }
    public int[] solution(String[] words, String[] queries) {
        int[] answer = new int[queries.length];
        TrieNode root = new TrieNode();
        TrieNode revRoot = new TrieNode();
        // Map<Integer, Integer> depthCount = new HashMap<>();
        for (String word: words) {
            buildTrie(root, word);
            buildReverseTrie(revRoot, word);
        }
        // �˻� Ű����� �ߺ��� ���� �ֽ��ϴ�.
        Map<String, Integer> memo = new HashMap<>();
        for (int i = 0; i < queries.length; ++i) {
            if (memo.containsKey(queries[i])) {
                answer[i] = memo.get(queries[i]);
            } else {
                if (queries[i].charAt(0) == '?') {
                    answer[i] = lookup(revRoot, new StringBuilder(queries[i]).reverse().toString(), 0);
                } else {
                    answer[i] = lookup(root, queries[i], 0);
                }
                memo.put(queries[i], answer[i]);                
            }
        }
        
        print(answer);
        return answer;
    }
    public void print(int[] t) {
    	for(int i : t) {
    		System.out.print("[" + i + "]");
    	}
    }
    private void buildTrie(TrieNode root, String word) {
        TrieNode node = root;
        for (char c: word.toCharArray()) {
            if (node.next[c - 'a'] == null) node.next[c - 'a'] = new TrieNode();
            node = node.next[c - 'a'];
        }
        node.isEnd = true;
        // depthCount.put(word.length(), depthCount.getOrDefault(word.length()) + 1);
    }
    private void buildReverseTrie(TrieNode root, String word) {
        TrieNode node = root;
        for (int i = word.length() - 1; i >= 0; --i) {
            char c = word.charAt(i);
            if (node.next[c - 'a'] == null) node.next[c - 'a'] = new TrieNode();
            node = node.next[c - 'a'];
        }
        node.isEnd = true;
        // depthCount.put(word.length(), depthCount.getOrDefault(word.length()) + 1);
    }
    private int lookup(TrieNode node, String query, int depth) {
        if (depth == query.length()) {
            if (node.isEnd) return 1;
            return 0;
        }
        char c = query.charAt(depth);
        int count = 0;
        if (c == '?') {
            for (int i = 0; i < R; ++i) {
                if (node.next[i] != null) count += lookup(node.next[i], query, depth + 1);
            }
            return count;
        } else {
            if (node.next[c - 'a'] != null) count = lookup(node.next[c - 'a'], query, depth + 1);
        }
        return count;
    }
}

public class LyricsSearch01 {
	public static void main(String[] args) {
		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
		Solution01 func = new Solution01();
		func.solution(words, queries);
	}
}
