import org.junit.Test;

public class PracticeTest {
    @Test
    public void stringBUilder(){
        StringBuilder sb = new StringBuilder();
        sb.append("abcdefg");
        sb.replace(1, 2, "x");
        System.out.println(sb.toString());
    }
}
