package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문
        int distance = 25; 
        int move = 0;
        while (move < distance) {
            move++;
            System.out.println("이동거리가 늘어납니다. " + move);
        }
        System.out.println("도착했어요.");
    }   
}
