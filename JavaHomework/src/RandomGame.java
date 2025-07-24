import java.util.*;
import java.time.*;

public class RandomGame {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int h = now.getHour();
        int m = now.getMinute();
        int s = now.getSecond();
        int n = now.getNano();
        int seed = h + m + s + n;
        Scanner sc = new Scanner(System.in);
        boolean cheat = false;
        // 실행한 당시의 현재시간을 시,분,초,나노로 가져와서 랜덤 시드 생성
        Random r = new Random(seed);
        int target = r.nextInt(50) + 1; // 1~50 사이의 숫자 (0~49라 +1을 한다.)
        int chance = 5;
        int c = 0;
        boolean success = false;
        List<Integer> inputs = new ArrayList<>();
        System.out.println(seed);
        System.out.println("[[[[[ 숫자게임을 시작합니다. ]]]]]");
        System.out.println("맞춰보세요.(숫자는 1부터 50사이 랜덤)-");

        System.out.print("참가자 닉네임 (종료:end) >>> ");
        String name = sc.nextLine();

        if (name.equalsIgnoreCase("end")) {
            System.out.println("::프로그램 종료::");
            return;
        } else if (name.matches("^([1-9]|[1-4]\\d|50)$")) {
            // 워낙 랜덤한 숫자가 나와서 맞추기 어려워 정규식으로 1-50사이로 닉네임을 정하면 해당 숫자에 맞춰주는 치트코드 생성.
            cheat = true; // <- 정해진 숫자 사이에 값으로 설정하면 치트를 사용한 것으로 간주함.
            int nc = Integer.parseInt(name);
            target = nc;

        }

        do {
            System.out.print("숫자 입력 (남은 기회 : " + (chance - c) + ") >>> ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("end")) {
                System.out.println("::프로그램 종료::");
                return;
            }

            int rNum;
            try {
                rNum = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요!");
                continue;
            }

            inputs.add(rNum);
            c++;

            if (rNum == target) {
                System.out.println("정답.");
                success = true;
                break;
            } else {
                // 숫자 스무고개 게임처럼 업,다운으로 Random Number값을 유추할 수 있도록 메세지 표시
                // 단, 치트 유무는 개발자만 알고있으니 난이도를 낮추기 위해 근처값에 가면 근처에 있다고 알려주는 메세지 표시.
                // 여기서 문제는 target(입력한 숫자)가 50이고 랜덤숫자가 20일때 -30이 되는데 Math.abs가 절댓값으로 설정하는 기능이래서 설정.
                int gap = Math.abs(target - rNum);
                if (target > rNum) {

                    if (gap >= 5) {
                        System.out.println("업! 다른 값입니다.");
                        System.out.println(gap);
                    } else if (gap < 5) {
                        System.out.println("업! 거의 다 왔습니다.");
                        System.out.println(gap);
                    }
                } else if (target < rNum)
                    // 6부터는 다른 값으로, 5부터는 거의 다왔다는 표기를 해야하므로 뺀값 보다 작을 때 작거나 같다로 표기함.
                    if (gap > 5) {
                        System.out.println("다운! 다른 값입니다.");
                        System.out.println(gap);
                    } else if (gap <= 5) {
                        System.out.println("다운! 거의 다 왔습니다.");
                        System.out.println(gap);
                    }
            }

        } while (c < chance);

        System.out.println("▶ 입력한 숫자 : " + inputs);
        System.out.println("숫자 맞추기 결과는?");
        if (success) {
            if (cheat) {
                // 치트 활성화시 치트를 사용했음을 명시.
                System.out.println("성공!!" + c + "회 시도하였습니다. (치트)");
            } else {
                System.out.println("성공!! " + c + "회 시도 후 성공~");
            }
        } else {
            System.out.println("실패!! 모든 기회를 다 쓰셨습니다. 게임을 다시 시작하세요!!");
            System.out.println("정답 : " + target);
        }

        GameValue gv = new GameValue(name, c, success);
        gv.printResult();
        sc.close();
    }
}

class GameValue {
    String gamer;
    int tryCount;
    boolean isSuccess;

    public GameValue(String gamer, int tryCount, boolean isSuccess) {
        this.gamer = gamer;
        this.tryCount = tryCount;
        this.isSuccess = isSuccess;
    }

    public void printResult() {
        System.out.println("GameValue 객체 확인");
        System.out.println("gamer : " + gamer + ", 시도횟수 : " + tryCount + ", 성공여부 : " + isSuccess);
        if (!isSuccess) {
            System.out.println("오류. 404 not found.");
        }
    }
}
