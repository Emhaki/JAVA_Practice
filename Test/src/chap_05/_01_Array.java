package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열: 여러 개를 저장하는 공간
        // String coffeeRoss = "아메리카노";
        // String coffeeRachel = "카페모카";
        // String coffeeChandler = "라떼";
        // String coffeeMonica = "카푸치노";

        System.out.println();

        // 배열 선언 방법
        // 첫 번째 방법
        // String[] coffees = new String [4];

        // 두 번째 방법
        // String coffee[] = new String[4];
        
        // for (int i = 0; i < 4; i++) {
        //     coffees[i] = coffeeRoss;
        // }
        
        // 세 번째 방법
        // String[] coffees = new String[] {
        //     "아메리카노",
        //     "카페모카",
        //     "라떼",
        //     "카푸치노"
        // };

        // 네 번째 방법
        String[] coffees = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나 주세요");
        }
    }
}
