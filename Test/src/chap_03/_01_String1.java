package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python";
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length());

        // 대소문자 변환
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 포함 관계
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.lastIndexOf("Python"));
        System.out.println(s.startsWith("I like"));
        }
}
