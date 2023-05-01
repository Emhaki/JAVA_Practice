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

        double convertedScoreDouble = score;
        System.out.println(convertedScoreDouble);

        // int => str
        String s1 = String.valueOf(score);
        s1 = Integer.toString(score);
        System.out.println(s1);

        // str => int
        int i = Integer.parseInt("88");
        System.out.println(i);
    }
}
