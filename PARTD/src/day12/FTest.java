package day12;

import java.io.*;
import java.time.LocalDateTime;

public class FTest {

    public static void main(String[] args) throws IOException {
        LocalDateTime t = LocalDateTime.now();
        int y = t.getYear();
        int m = t.getMonthValue();
        int d = t.getDayOfMonth();
        File f = new File("text_" + (y - 2000) + m + d + ".txt");
        try {
            if (f.exists()) {
                System.out.println("같은 파일이 존재");
            } else {
                if (f.createNewFile()) {
                    System.out.println("생성 완료");
                } else {

                    System.out.println("생성 실패");
                }
            }
        } catch (Exception e) {
            System.out.println("파일 처리 예외 :" + e.getMessage());
        }
        System.out.println(f.getName());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.length());

    }
}
