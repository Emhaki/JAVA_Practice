package chap_06;

public class _08_Quiz {

    public static String getHiddenData(String data, int number) {
        if (number == 1) {
            data = "이**";
        } else if (number == 8) {
            data = "950315-1******";
        } else if (number == 9) {
            data = "010-1111-****";
        }
        return data;
    }

    public static void main(String[] args) {
        String name = "이명학";
        String id = "950315-1111111";
        String phone = "010-1234-1234";

        System.out.println("이름 : " + getHiddenData(name, 1));
        System.out.println("주민등록번호 : " + getHiddenData(id, 8));
        System.out.println("전화번호 : " + getHiddenData(phone, 9));
    }
}
