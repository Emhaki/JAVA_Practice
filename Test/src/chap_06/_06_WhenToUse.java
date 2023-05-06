package chap_06;

public class _06_WhenToUse {

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드가 필요한 이유
        // 코드의 반복을 줄일 수 있음
        System.out.println(getPower(3, 3));    
    }


}
