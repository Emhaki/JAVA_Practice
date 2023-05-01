// 폴더 이름을 적용하는 것 같음
package chap_01;

// 파일 이름을 적용하는 것 같음
public class _01_Variable {
    public static void main(String[] args) {
        String name = "이명학";
        int hour = 15;

        System.out.println(name + "님, 새벽배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + " 안녕하세요, ");

        // 실수 값
        double score = 90.5;
        char grade = 'A';
        name = "Emhaki";
        System.out.println(name + "님의 평균 점수는 " + score + "점 입니다.");
        System.out.println("학점은 " + grade + " 입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격했나요? " + pass);

        double d = 3.14;
        float f = 3.14F;
        System.out.println(d);
        System.out.println(f);
    }
}
