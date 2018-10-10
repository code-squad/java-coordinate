package util;

import org.junit.Test;

import static org.junit.Assert.*;

public class ParserTest {

    @Test
    public void splitStrPoint() {
        String str = "(1,-1)";
        int[] ex = {1, -1};

        assertEquals(ex[0], Parser.splitStrPoint(str)[0]);
        assertEquals(ex[1], Parser.splitStrPoint(str)[1]);
    }

    @Test
    public void parsingPointString() {
        String str = "(1,1)-(2,2)";
        String[] result = Parser.parsingPointString(str);

        System.out.println("1:" + result[0]);
        System.out.println("2:" + result[1]);
    }

}