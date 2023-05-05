package chap_04;

public class _11_continue {
    public static void main(String[] args) {
        // Continue

        int max = 20;
        int sold = 0;
        int noShow = 17;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님, 치킨 나왔습니다.");
            
            if (sold == noShow) {
                continue;
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
        }
    }
}
