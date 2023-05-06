package chap_06;

public class _07_MainMethod {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.println(s);
        }
        // Main method

        // 1. 도서 조회
        // 2. 도서 대출
        // 3. 도서 반납
        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    System.out.println("1");
                    System.out.println("도서 대출 메뉴입니다.");
                    break;
                case "2":
                    System.out.println("2");
                    break;
                case "3":
                    System.out.println("3");
                    break;
                default:
                    System.out.println("4");
                    break;
            }
        } else {
            System.out.println("5");
        }
    }
}
