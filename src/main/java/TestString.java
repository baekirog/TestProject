import org.apache.commons.lang3.StringUtils;

public class TestString {

    public static void main(String[] args) {

        String stringAbbreviate = StringUtils.abbreviate("TestProject_TestString", 15);
        System.out.println(stringAbbreviate);
    }

}
