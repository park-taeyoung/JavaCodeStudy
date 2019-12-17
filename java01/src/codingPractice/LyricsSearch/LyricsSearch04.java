package codingPractice.LyricsSearch;

import java.util.*;

class Solution04 {
    public int[] solution(String[] words, String[] queries) {
        final Node preRootNode = new Node();
        final Node postRootNode = new Node();

        for(int i=0;i<words.length;i++) {
            String word = words[i];
            int wordLength = word.length();
            Node currNode;

            currNode = preRootNode;
            for(int j=0;j<wordLength;j++)
                currNode = currNode.addChild(word.charAt(j), wordLength - j - 1);

            currNode = postRootNode;
            for(int j=word.length()-1;j>=0;j--)
                currNode = currNode.addChild(word.charAt(j), j);
        }

        int[] answer = new int[queries.length];

        for(int i=0;i<queries.length;i++) {
            String query = queries[i];
            int queryLength = query.length();
            Node currNode;
            int j;
            if(query.charAt(0) != '?') {
                currNode = preRootNode;
                for(j=0;currNode!=null && query.charAt(j)!='?';j++)
                    currNode = currNode.getChild(query.charAt(j));
                answer[i] = currNode == null ? 0 : currNode.getSubLengthChildrenCount(queryLength - j - 1);
            } else {
                currNode = postRootNode;
                for(j=query.length()-1;currNode!=null && query.charAt(j)!='?';j--)
                    currNode = currNode.getChild(query.charAt(j));
                answer[i] = currNode == null ? 0 : currNode.getSubLengthChildrenCount(j);
            }
        }

        
        print(answer);
        
        return answer;
    }
    
    public void print(int[] t) {
    	for(int i:t) {
    		System.out.print("[" + i + "]");
    	}
    }
}

class Node {
    private Map<Character, Node> children = null;
    private Map<Integer, Integer> subLengthChildrenCountMap;

    public int getSubLengthChildrenCount(int remainSurfixLength) {
        Integer result = subLengthChildrenCountMap == null ? null 
            : subLengthChildrenCountMap.get(remainSurfixLength);
        return result == null ? 0 : result;
    }

    public Node addChild(char ch, int remainSurfixLength) {
        if(subLengthChildrenCountMap == null)
            subLengthChildrenCountMap = new TreeMap<>();
        Integer count = subLengthChildrenCountMap.get(remainSurfixLength);
        subLengthChildrenCountMap.put(remainSurfixLength, count == null ? 1 : count + 1);

        if(children == null)
            children = new TreeMap<>();
        Node result = children.get(ch);
        if(result == null)
            children.put(ch, result = new Node());
        return result;
    }

    public Node getChild(char ch) {
        return children == null ? null : children.get(ch);
    }
}



public class LyricsSearch04 {
	public static void main(String[] args) {
		String[] words = {"frodo", "front", "frost", "frozen", "frame", "kakao"};
		String[] queries = {"fro??", "????o", "fr???", "fro???", "pro?"};
		Solution04 func = new Solution04();
		func.solution(words, queries);
	}
}
