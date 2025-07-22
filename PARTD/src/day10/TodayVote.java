package day10;

import java.util.*;

public class TodayVote {
    public static void main(String[] args) {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("치킨", 0);
        m.put("피자", 0);
        m.put("스테이크", 0);
        m.put("삼겹살", 0);
        m.put("항정살", 0);
        System.out.println("저메추");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("메뉴 목록" + m.entrySet());
            System.out.println("빨리 ㅋㅋ");
            String key = sc.next();
            if (key.equals("end")) {
                break;
            }
            if (m.containsKey(key)) {
                int val = m.get(key);
                val++;
                m.put(key, val);
            } else {
                System.out.println("딴 거 말고");
            }
        }
        loading();
        System.out.println("뭐 먹을지 결론");
        System.out.println();
        sc.close();
    }

    private static void loading() {
        int totalSteps = 100;
        for (int i = 0; i <= totalSteps; i++) {
            int percentage = (i * 100) / totalSteps;
            StringBuilder progressBar = new StringBuilder("[");
            for (int j = 0; j < 50; j++) {
                if (j < percentage / 2) {
                    progressBar.append("=");
                } else if (j == percentage / 2) {
                    progressBar.append(">");
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
        System.out.println("\n로딩 완료!");
    }
}
