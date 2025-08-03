/*
	1. 한 번에 한 개의 알파벳만 바꿀 수 있습니다.
	2. words에 있는 단어로만 변환할 수 있습니다.
*/

import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        boolean[] visited = new boolean[words.length];
        if(!wordList.contains(target)) return 0;
        Queue<Word> queue = new LinkedList<>();
        
        Word w = new Word(begin, 0);
        queue.offer(w);
        
        while(!queue.isEmpty()) {
            System.out.println("start");
            Word word = queue.poll();
            System.out.println("word.getWord(): " + word.getWord());
            String wordStr = word.getWord();
            if(target.equals(wordStr)) return word.getCount();
            for(int i = 0; i < wordList.size(); i++) {
                int difCount = difCheck(wordStr, wordList.get(i));
                System.out.println("difCount: " + difCount);
                if(difCount == 1 && !visited[i]) {
                    System.out.println("wordStr: " + wordStr);
                    System.out.println("wordList.get(i): " + wordList.get(i));
                    Word nextWord = new Word(wordList.get(i), word.getCount() + 1);
                    queue.offer(nextWord);
                    
                    System.out.println("Count: " + nextWord.getCount());
                    
                    System.out.println("======================");
                    
                    visited[i] = true;
                } 
            }
        }
        
        return answer;
    }
    
    // 다른 문자 수 체크
    public int difCheck(String a, String b) {
        int length = a.length();
        int dif = 0;
        for(int i = 0; i < length; i++) {
            if(a.charAt(i) != b.charAt(i)) {
                dif += 1;
            }
        }
        
        return dif;
    }
}

class Word {
    String word;
    int count;
    
    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }
    
    public String getWord() {
        return this.word;
    }
    
    public int getCount() {
        return this.count;
    }
}