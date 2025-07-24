package day12;

import java.io.*;
import java.time.LocalDateTime;

public class FTest {

    public static void main(String[] args) throws IOException {
        LocalDateTime t = LocalDateTime.now();
        int y = t.getYear();
        int m = t.getMonthValue();
        int d = t.getDayOfMonth();
        String fname = "text_" + (y - 2000) + m + d;
        File txt = new File(fname + ".txt");
        try {
            if (txt.exists()) {
                System.out.println("같은 파일이 존재");
            } else {
                if (txt.createNewFile()) {
                    System.out.println("생성 완료");
                } else {

                    System.out.println("생성 실패");
                }
            }
        } catch (Exception e) {
            System.out.println("파일 처리 예외 :" + e.getMessage());
        }
        System.out.println(txt.getName());
        System.out.println(txt.getAbsolutePath());
        System.out.println(txt.length());

    }
}
