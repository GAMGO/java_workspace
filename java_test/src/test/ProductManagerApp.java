package test;

import java.util.*;

public class ProductManagerApp {

    public static void main(String[] args) {
        List<product> list = new ArrayList<>();
        System.out.println("ㅁㅁㅁㅁ 상품 관리 프로그램입니다. ㅁㅁㅁㅁ");
        boolean stat = true;
        while (stat) {
            System.out.println("\n작업 메뉴를 선택하세요.");
            System.out.println("[A] 상품 추가 [R] 상품 삭제 [U] 가격 변경 \n" + " [L] 전체 상품 목록 [S] 상품 조회 [E] 종료 ");
            String menu = System.console().readLine("선택 >>>");
            try {
                switch (menu.toUpperCase()) {
                    case "A":
                        addProduct(list);
                        break;
                    case "R":
                        int index = Integer.parseInt(System.console().readLine("\t삭제할 인덱스 입력 >>>>"));
                        if (confirm("삭제")) {
                            list.remove(index);
                            System.out.println("\t삭제 데이터 : " + list.get(index));
                        } else {
                            System.out.println("\t삭제를 취소했습니다.");
                        }
                        break;
                    case "U":
                        index = Integer.parseInt(System.console().readLine("\t수정할 인덱스 입력 >>>>"));
                        int pt = Integer.parseInt(System.console().readLine("\t판매 가격 입력 >>>"));
                        if (confirm("가격 변경")) {
                            list.get(index).setPrice(pt);
                            System.out.println("\t업데이트 결과 : ");
                        } else {
                            System.out.println("\t포인트 변경을 취소했습니다.");
                        }
                        break;
                    case "L":
                        System.out.println("\t\t상품 리스트");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.println("\t" + i + ": " + list.get(i));
                        }
                        break;
                    case "S":
                        System.console().readLine("\t찾는 상품 제목 단어 입력 >>> ");
                        String find = "\\s+";
                        for (int i = 0; i < list.size(); i++) {
                            // if ( = " ") {
                            // System.out.println("\t" + i + ": " + list.get(index));
                            // }
                        }
                        break;
                    case "E":
                        stat = false;
                        break;
                    default:
                        System.out.println("잘못된 메뉴 선택입니다.");
                        break;
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
            System.out.println("숫자만 입력하세요.");
        } // while end
    } // main end

    private static void initProductList(List<product> list) {

        product p1 = new product(1212, "LG그램", 345600.0);
        product p2 = new product(2499, "LG스탠바이", 190100.0);
        product p3 = new product(1213, "삼성 OLED", 554500.0);
        product p4 = new product(4546, "바디프랜드", 632000.0);

    }

    private static void addProduct(List<product> list) {
        int id = Integer.parseInt(System.console().readLine("\t ID 번호 입력"));
        String title = System.console().readLine("\t상품 제목 입력 >>> ");
        double price = Double.parseDouble(System.console().readLine("\t상품 가격 입력 >>> "));
        if (confirm("상품 등록")) {
            product p = new product(id, title, price);
            list.add(p);
            System.out.println("\t등록 확인 : " + p);
        } else {
            System.out.println("\t등록 취소 했습니다.");
        }
    }

    private static boolean confirm(String task) {

        String yn = System.console().readLine(task + "을(를) 실행할까요? (확인 : 엔터, 취소 : N) ");
        return yn.length() != 0 && yn.toUpperCase().equals("N") ? false : true;
    }
}
