package day10;

import java.util.*;

import lombok.val;

public class WordCount {
    public static void main(String[] args) throws InterruptedException {
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
        loading(45);
        for (String k : words) {
            w.put(k, w.getOrDefault(k, 0) + 1);
        }
        int sum = 0;
        for (String k : w.keySet()) {
            sum += w.get(k);
        }
        System.out.println("\n단어 총 개수: " + sum + "개 \n" + w.entrySet());
        loading2(45);
        System.out.println("\n출현 단어 개수: " + w.size() + "개 \n");
        System.out.println("\n '모르겠니'의 " + "단어 개수: " + w.get("모르겠니") + "개 \n");
        int maxCount = 0; // maxCount 4회인 단어가 여러개이면
        StringBuilder sb = new StringBuilder(); // maxCount 단어들을 저장
        loading2(100);
        for (String key : w.keySet()) {
            int val = w.get(key);
            delayed(500);
            System.out.println(key + " (" + val + " 회)");
            sum += val; // value(단어의 출현 횟수) 누적합계
            // 출현 횟수 최대값 찾기
            if (val > maxCount) // 현재의 val 와 최대횟수 maxCount 비교
                maxCount = val;
        }
        // maxCount 에 해당하는 단어를 sb에 추가
        for (String key : w.keySet()) {
            if (w.get(key) == maxCount) { // value 가 maxCount 와 같은지 비교
                sb.append(key).append(",");
            }
        }
        System.out.println("최다 출현 단어 : " + sb.toString() + " 횟수: " + maxCount);
    }

    private static void loading(int loadingTime) {
        int totalSteps = loadingTime;
        for (int i = 0; i <= totalSteps; i++) {
            int percentage = (i * 100) / totalSteps;
            StringBuilder progressBar = new StringBuilder("[");
            for (int j = 0; j < 50; j++) {
                if (j < percentage / 2) {
                    progressBar.append("=");
                } else if (j == percentage / 2) {
                    progressBar.append("|");
                } else {
                    progressBar.append(" ");
                }
            }
            progressBar.append("] ").append(percentage).append("%");
            System.out.print("\r" + progressBar.toString());
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } // 잠시 대기 (진행 속도 조절)
        }
    }

    private static void loading2(int time) {
        String[] animationFrames = { "..", ": ", "˙˙", " :" };
        int frameIndex = 0;
        for (int i = 0; i < 50; i++) {
            System.out.print("\r" + animationFrames[frameIndex] + " 로딩 중...");
            frameIndex = (frameIndex + 1) % animationFrames.length;
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("\r\n");
    }

    private static void delayed(int time) throws InterruptedException {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
