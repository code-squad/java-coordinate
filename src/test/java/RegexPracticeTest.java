import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPracticeTest {
    @Test
    public void matchTest() {
        String input = "10월2일 화요일";
        String regex = "[0-9]{1,2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    @Test
    public void matchTest2() {
        String input = "(10,10)-(14,15)";
        String regex = ".[0-9]{1,2},[0-9]{1,2}.-.[0-9]{1,2},[0-9]{1,2}.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if(matcher.find()) {
            System.out.println("일치!");
        } else {
            System.out.println("불일치!");
        }
    }

    @Test
    public void matchTest3() {
        String input = "(10,10)-(14,15)";
        String regex = "[0-9]{1,2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
