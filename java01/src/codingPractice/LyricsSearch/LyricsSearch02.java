package codingPractice.LyricsSearch;

class Solution02 {
    public int[] solution(String[] words, String[] queries) {
        int N = queries.length;
        int[] answer = new int[N];

        Trie right = new Trie('R', false);
        Trie reverse = new Trie('R', false);

        for (String word : words) {
            build(right, word);
            build(reverse, new StringBuilder(word).reverse().toString());
        }

        for (int i = 0; i < N; i++) {
            String query = queries[i];
            boolean prefix = query.charAt(0) == '?';
            boolean postfix = query.charAt(query.length() - 1) == '?';
            if (prefix && postfix) {
                answer[i] = right.cnt.getOrDefault(query.length(), 0);
            } else if (prefix) {
                answer[i] = search(reverse, new StringBuilder(query).reverse().toString(), 0);
            } else {
                answer[i] = search(right, query, 0);
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

    private int search(Trie node, String query, int i) {
        int N = query.length();
        if (N == i) {
            return node.w ? 1 : 0;
        }
        if (!node.cnt.containsKey(N-i)) {
            return 0;
        }
        char c = query.charAt(i);
        if (c == '?') {
            return node.cnt.getOrDefault(N - i, 0);
        }
        if (!node.next.containsKey(c)) {
            return 0;
        }

        return search(node.next.get(c), query, i + 1);
    }

    private Trie build(Trie root, String word) {
        int M = word.length();
        Trie cur = root;
        for (int i = 0; i < M; i++) {
            char c = word.charAt(i);
            Trie next = cur.next.getOrDefault(c, new Trie(c, i == M - 1));
            if (i == M - 1) {
                next.w = true;
            }
            int cnt = cur.cnt.getOrDefault(M - i, 0);
            cur.cnt.put(M - i, cnt + 1);

            if (!cur.next.containsKey(c)) {
                cur.next.put(c, next);
            }
            cur = next;
        }

        return root;
    }

    class Trie {
        char c;
        boolean w;
        java.util.Map<Character, Trie> next;
        java.util.Map<Integer, Integer> cnt;

        public Trie(char c, boolean w) {
            this.c = c;
            this.w = w;
            next = new java.util.HashMap<>();
            cnt = new java.util.HashMap<>();
        }
    }
}



public class LyricsSearch02 {
	public static void main(String[] args) {
		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
		Solution02 func = new Solution02();
		func.solution(words, queries);
	}
}
