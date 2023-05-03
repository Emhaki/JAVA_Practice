package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문 if
        int hour = 10;
        if (hour < 14) {
            System.out.println("아이스 아메리카노 +1");
        }
        System.out.println("커피 주문 완료");
    
        // 오후 2시 이전, 모닝 커피를 마시지 않은 경우
        hour = 10;
        boolean morningCoffee =  false;
        if (!morningCoffee) {
            System.out.println("아이스 아메리카노 +1");
        }
    }
}