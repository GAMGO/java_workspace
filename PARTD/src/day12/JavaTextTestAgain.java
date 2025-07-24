package day12;

import lombok.*;

public class JavaTextTestAgain {
    public static void main(String[] args) {

    }

    @Getter
    @Setter
    @AllArgsConstructor
    class JavaKeyWord {
        private String keyword;
        private String korean;
        private int level;

        @Override
        public String toString() {
            return keyword + "," + korean + "," + level;
        }
    }
}
