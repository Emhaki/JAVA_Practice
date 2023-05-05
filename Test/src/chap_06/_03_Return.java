package chap_06;

public class _03_Return {
    
    public static String getPhoneNumber() {
        String phoneNumber = "010-3333-2222";
        return phoneNumber;
    }

    public static String getAddress() {
        return "서울시 어딘가";
    }

    public static String getActivies() {
        return "볼링장";
    }

    public static void main(String[] args) {
        // 반환값
        String phoneNumber2 = getPhoneNumber();
        System.out.println(phoneNumber2);
        System.out.println(getAddress());
        System.out.println(getActivies());
    }
}
