package chap_04;

public class _12_Quiz {
    public static void main(String[] args) {
        int hour = 5;
        boolean isSmallCar = false;
        boolean withDisabledPerson = true;

        int fee = hour * 4000;
        if (fee > 30000) {
            fee = 30000;
        }

        if (isSmallCar || withDisabledPerson) {
            fee *= 0.5;
        }

        System.out.println("주차 요금은 " + fee + "원 입니다.");
    }
}
