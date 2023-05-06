package chap_06;

public class _05_Overloading {
    // 똑같은 함수를 여러번 사용
    // 1. 전달값의 타입이 다르거나
    // 2. 전달값의 갯수가 다르거나
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        System.out.println(getPower(3)); 
        System.out.println(getPower(("4")));
    }
}
