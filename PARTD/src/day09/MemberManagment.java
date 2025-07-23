package day09;

import java.util.*;
import lombok.*;
import java.io.IOException;
import java.time.LocalDateTime;

public class MemberManagment {
    public static void main(String[] args) throws InterruptedException, IOException {
        List<Member> li = new ArrayList<>();
        initMemberList(li);
        boolean stat = true;
        boolean statSearch = false;
        String[] menu = { "[A] Add User", "[D] Delete User", "[S] Search User", "[F] Finish" };
        String[] smenu = { "[V] View User list", "[C] Check points", "[B] Back" };
        while (stat) {
            System.out.println("Member Management Program");
            delayed(1000);
            System.out.println("Select the menu.");
            delayed(1000);
            for (int i = 0; i < menu.length; i++) {
                System.out.print(menu[i] + " ");
                delayed(250);
            }
            String selected = System.console().readLine("\n\t Insert Command : ");

            switch (selected.toUpperCase()) {
                case "--HELP":
                    System.out.println("\n");
                    help();
                    break;
                case "A":
                    System.out.println(Arrays.toString(menu));
                    System.out.println("\t▼");
                    if (c("Add User")) {
                        addMember(li);
                        System.out.println("\tUpdated List");
                        for (int i = 0; i < li.size(); i++) {
                            delayed(250);
                            System.out.println("\t" + i + ":  " + li.get(i));
                        }
                    } else {
                        System.out.println("Process Canceled");
                    }
                    break;
                case "S":
                    System.out.println(Arrays.toString(menu));
                    System.out.println("\t\t\t\t\t▼");
                    statSearch = true;
                    while (statSearch) {
                        for (int i = 0; i < smenu.length; i++) {
                            System.out.print(" " + smenu[i] + " ");
                            delayed(250);
                        }
                        String slectedsmenu = System.console().readLine("\n\t Insert Command : ");
                        switch (slectedsmenu.toUpperCase()) {
                            case "--HELP":
                                System.out.println("\n");
                                help();
                                break;
                            case "V":
                                System.out.println("\tList");
                                for (int i = 0; i < li.size(); i++) {
                                    delayed(250);
                                    System.out.println("\t" + i + ":  " + li.get(i));
                                }
                                break;
                            case "C":
                                int index = Integer.parseInt(System.console().readLine("Plase Insert User id = "));
                                double point = Double.parseDouble(System.console().readLine("\tPoint >>> "));
                                if (c("Check points")) {
                                    li.get(index).setPt(point);
                                    // ✅ index 의 객체를 가져와서 (Member 타입) setter 로 point 값 변경
                                    System.out.println("\tUpdated : " + li.get(index));
                                } else {
                                    System.out.println("\tProcess Canceled");
                                }
                            case "B":
                                System.out.println("Back to the Main menu please wait a min..");
                                delayed(2000);
                                statSearch = false;
                                stat = true;
                                break;
                            default:
                                delayed(500);
                                System.out.println("Wrong Command! Plase make sure insert command");
                                delayed(1500);
                                System.out.println("If you do not know any command insert [--help]");
                                delayed(1500);
                                break;
                        }

                    }
                    break;
                case "D":
                    for (int i = 0; i < li.size(); i++) {
                        delayed(250);
                        System.out.println("\t" + (i + 1) + ":  " + li.get(i));
                    }
                    delayed(500);
                    int index = Integer.parseInt(System.console().readLine("Plase Insert User id = "));
                    if (c("Delete User")) {
                        delayed(250);
                        System.out.println("\t Deleted : " + li.get(index));
                        li.remove(index);
                    } else {
                        System.out.println("Process Canceled");
                    }
                    break;
                case "F":
                    System.out.println("Program Shotdown right now. please wait a moment.");
                    delayed(2000);
                    statSearch = false;
                    stat = false;
                    break;

                default:
                    delayed(500);
                    System.out.println("Wrong Command! Plase make sure insert command");
                    delayed(1500);
                    System.out.println("If you do not know any command insert [--help]");
                    delayed(1500);
                    break;
            }
        }

    }

    private static void delayed(int time) throws InterruptedException {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

    private static void addMember(List<Member> list) {
        LocalDateTime now = LocalDateTime.now();
        int hr = now.getHour();
        int min = now.getMinute();
        int sec = now.getSecond();
        int nano = now.getNano();
        int seed = hr + min + sec + nano;
        Random r = new Random(seed);// 현재 시간을(HH:MM:SS.NN)을 모두 더한 값을 seed로 받아와 더욱 예측불가능한 랜덤 값으로 설정.
        int target = r.nextInt(999);
        int idinfo = target;
        String nameinfo = System.console().readLine("Please Insert new member name : ");
        double ptinfo = Double.parseDouble(System.console().readLine("Insert amount of points [ex: 2.5] = "));
        Member m = new Member(idinfo, nameinfo, ptinfo);
        list.add(m);
    }

    private static boolean c(String task) throws IOException {
        String confirm = System.console().readLine("Are you sure? ");
        return (confirm.length() != 0 || confirm.toUpperCase().equals("Y"))
                && confirm.toUpperCase().equals("N") ? false : true;
    }

    private static void initMemberList(List<Member> l) {
        Member m1 = new Member(1, "김땡떙", 133.4);
        Member m2 = new Member(2, "반하나", 111.9);
        Member m3 = new Member(3, "최사과", 85.4);
        Member m4 = new Member(4, "박모모", 96.3);

        // 불변 객체 리스트가 메소드의 인자로 모든 요소를 가변 객체 list 에 추가
        l.addAll(List.of(m1, m2, m3, m4));

    }

    private static void help() {
        String[] cmds = { "[Y,y] Confirm, Yes, Agree", "[N,n] Denied, No, DisAgree",
                "[Press enter] = It is equals Yes[Y,y]", "[Ctrl + C] Forced Finish" };
        System.out.println("\t\t----Command list----");
        for (String x : cmds) {
            try {
                delayed(300);
                System.out.println("\t" + x);
                delayed(300);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("\n");
        try {
            delayed(1000);
            System.out.println("Back to main title..");
            System.out.println("\n");
            delayed(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
