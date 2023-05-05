package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석
        String[][] seats = new String[][] {
            {"A", "B", "C"},
            {"D", "E", "F"}
        }; 
        System.out.println(seats[1][1]);

        String[][] seats2 = {
            {"A", "B", "C"},
            {"D", "E", "F"},
            {"G", "H", "I"}
        };
        System.out.println(seats2[2][2]);
    }
}
