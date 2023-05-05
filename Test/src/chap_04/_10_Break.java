package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // break
        // 치킨 집 20마리만 판매

        int max = 20;
        for (int i = 0; i <= max+10; i++) {
            System.out.println(i + "번 손님 치킨 나왔습니다.");
            if (i == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }

        int index = 1;
        while (index <= 50) {
            System.out.println(index);
            if (index == max) {
                System.out.println("금일 재료가 소진되었습니다.");
                break;
            }
            index++;
        }
    }    
}
