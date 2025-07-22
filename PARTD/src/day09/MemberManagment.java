package day09;

import java.util.*;
import lombok.*;
import java.io.IOException;

public class MemberManagment {
    public static void main(String[] args) throws InterruptedException {
        List<Member> li = new ArrayList<Member>();
        boolean stat = true;
        boolean statSearch = false;
        String[] menu = { "['A'dd]회원 추가", "['D'elete]회원 삭제", "['S'earch]회원 조회", "['F'inish]종료" };
        String[] smenu = { "['L'ist]회원 리스트", "['K'-point]포인트 조회", "['B'ack] 뒤로" };
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
                case "A":
                    System.out.println(Arrays.toString(menu));
                    System.out.println("\t▼");
                    addMember(li);
                    break;
                case "S":
                    System.out.println(Arrays.toString(menu));
                    System.out.println("\t\t\t\t\t\t▼");
                    statSearch = true;
                    while (statSearch) {
                        for (int i = 0; i < smenu.length; i++) {
                            System.out.print("\t" + smenu[i] + " ");
                            delayed(250);
                        }
                        String slectedsmenu = System.console().readLine("\n\t Insert Command : ");
                        switch (slectedsmenu.toUpperCase()) {
                            case "L":

                                break;
                            case "K":
                                int id = Integer.parseInt(System.console().readLine("Please insert User id number = "));
                                if (id != 0) {

                                } else {
                                    System.err.println("There is no data! Please make sure checking user id");
                                }
                                break;
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
                    delayed(1000);
                    int index = Integer.parseInt(System.console().readLine("Plase Insert User id"));
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
        int idinfo = Integer.parseInt(System.console().readLine("Please Insert new member's id numbers = "));
        String nameinfo = System.console().readLine("Please Insert new member name : ");
        double ptinfo = Double.parseDouble(System.console().readLine("Insert amount of points [ex: 2.5] = "));
        Member m = new Member(idinfo, nameinfo, ptinfo);
        list.add(m);
    }

    private static boolean c(String task) throws IOException {
        int keyCode = System.in.read();
        String confirm = System.console().readLine("Are you sure? ");
        return (confirm.length() != 0 || confirm.toUpperCase().equals("Y"))
                && (confirm.toUpperCase().equals("N") || keyCode == 27) ? false : true;
    }

    private static void Memlist(List<Member> l) {
        Member m1 = new Member(1, "김땡땡", 3.4);
        Member m2 = new Member(2, "반하나", 1.9);
        Member m3 = new Member(3, "최사과", 5.4);
        Member m4 = new Member(4, "박모모", 6.3);
        l.addAll(List.of(m1, m2, m3, m4));

    }
}
