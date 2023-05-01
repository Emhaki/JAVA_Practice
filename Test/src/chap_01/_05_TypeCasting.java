package chap_01;

public class _05_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        float score_f = 93.3F;
        double score_d = 93.8;
        System.out.println((int) score_f);
        System.out.println((int) score_d);
    }
}
