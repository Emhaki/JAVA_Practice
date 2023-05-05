package chap_06;

public class _05_Overloading {
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
