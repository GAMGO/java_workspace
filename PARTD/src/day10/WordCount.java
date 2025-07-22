package day10;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        String lyrics = "Longing for you Waiting for you\r\n" +
                "\r\n" +
                "Hold me hold me in your eyes\r\n" +
                "\r\n" +
                "너라는걸 너뿐인걸 모르겠니\r\n" +
                "\r\n" +
                "I will be your love\r\n" +
                "\r\n" +
                "오 빨간 운동화 짧은 청바지\r\n" +
                "\r\n" +
                "참 어째도 해결이 안될 것 같은 곱슬머리\r\n" +
                "\r\n" +
                "하지만 왜일까 자꾸 끌리는 내 마음이\r\n" +
                "\r\n" +
                "어쩌면 사랑 아닐까\r\n" +
                "\r\n" +
                "Longing for you Waiting for you\r\n" +
                "\r\n" +
                "Hold me hold me in your eyes\r\n" +
                "\r\n" +
                "너라는걸 너뿐인걸 모르겠니\r\n" +
                "\r\n" +
                "I will be your love\r\n" +
                "\r\n" +
                "오 착한 눈동자 수줍은 표정\r\n" +
                "\r\n" +
                "넌 어쩌면 어릴적 책속에 있던 어린왕자\r\n" +
                "\r\n" +
                "그래서 당연해 자꾸 끌리는 내 마음이\r\n" +
                "\r\n" +
                "어쩌면 사랑 일거야\r\n" +
                "\r\n" +
                "Longing for you Waiting for you\r\n" +
                "\r\n" +
                "Hold me hold me in your eyes\r\n" +
                "\r\n" +
                "너라는걸 너뿐인걸 모르겠니\r\n" +
                "\r\n" +
                "I will be your love";
        String[] words = lyrics.split("\\s+");
        System.out.println("가사 단어 개수 : " + words.length + "개");
        Map<String, Integer> w = new HashMap<>();
        for (String k : words) {
            w.put(k, w.getOrDefault(k, 0) + 1);
        }
        int sum = 0;
        for (String k : w.keySet()) {
            sum += w.get(k);
        }
        System.out.println("단어 총 개수: " + sum + "개 \n" + w.entrySet());
        System.out.println("출현 단어 개수: " + w.size() + "개 \n");
    }
}
