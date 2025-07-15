package day05;

import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        Ss s1 = new Ss();
        try {
            s1.setS(-1);
        } catch (Exception e) {

        }

    }
}

class Ss {
    private int s; // 0~100

    public int getS() {
        return s;
    }

    public void setS(int score) throws IOException {
        if (score >= 0 && score <= 100) {
            this.s = score;
        } else {
            throw new IOException("Score will has only integer between 0 and 100.");
        }
    }
}