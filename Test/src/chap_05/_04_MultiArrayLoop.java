package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        String[][] seats2 = {
            {"A", "B", "C"},
            {"D", "E", "F"},
            {"G", "H", "I"}
        };

        for (int i = 0; i < seats2.length; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
