import org.apache.commons.lang3.StringUtils;

public class TestString {

    public static void main(String[] args) {

        // 최대 길이 - 3 을 초과하는 문자를 ... 으로 변환
        String stringAbbreviate = StringUtils.abbreviate("TestProject_TestString", 15);
        System.out.println("abbreviate - " + stringAbbreviate);

        // 최대 길이와 sourceText 의 길이가 같으면 sourceText 그대로 반환
        String stringAbbreviate2 = StringUtils.abbreviate("TestP", 5);
        System.out.println("abbreviate - " + stringAbbreviate2);

        // 첫문자를 대문자로 변환
        String stringCapitalize = StringUtils.capitalize("testproject");
        System.out.println("capitalize - " + stringCapitalize);

    }

}
