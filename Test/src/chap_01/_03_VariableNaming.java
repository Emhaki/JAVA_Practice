package chap_01;

public class _03_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자
        // 6. 예약어 사용 불가 (public, static, void 등)

        String nationality = "대한민국"; 
        String firstName = "현성";
        String lastName = "김";
        String dateOfBirth = "2001-12-31";
        String residentialAddress = "무슨 호텔";
        String purposeOfVisit = "관광";
        String fightNumber = "KE536";

        System.out.println(nationality);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(dateOfBirth);
        System.out.println(residentialAddress);
        System.out.println(purposeOfVisit);
        System.out.println(fightNumber);

    }
}