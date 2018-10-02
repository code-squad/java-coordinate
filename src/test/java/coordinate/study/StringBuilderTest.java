package coordinate.study;

import static org.assertj.core.api.Assertions.*;

import com.sun.javafx.binding.StringFormatter;
import org.junit.Test;

public class StringBuilderTest {
    @Test
    public void newline(){
        StringBuilder sb = new StringBuilder();
        sb.append("012345678901234567890123");
        sb.delete(1,2);
        sb.insert(1,"a");
        System.out.println(sb.length());
        sb.append(System.lineSeparator());
        sb.append("012345678901234567890123");
        System.out.println(sb.length());
        System.out.println(sb.toString());
    }

    @Test
    public void formatTest(){
        StringBuilder sb = new StringBuilder();
//        sb.append(String.format("%2s", "+"));
//        sb.append(String.format("%2s", "--"));
//        sb.append(String.format("%2s", "--"));
//        sb.append(String.format("%2s", "--"));
//        sb.append(String.format("%2s", "--"));
//        sb.append(String.format("%2s", "--"));
//        sb.append(String.format("%2s", "--"));
//        sb.append(String.format("-"));
//
//        sb.append(System.lineSeparator());
        sb.append(String.format("%3s", "1|"));
        sb.append(String.format("%47s", ""));
        sb.delete(3,4);
        sb.insert(3, "*");
        sb.append(System.lineSeparator());
        sb.append(String.format("%3s", "+"));
        for(int i = 1; i < 24; i++){
            sb.append(String.format("%2s", "--"));
        }
        sb.append("-");
        sb.append(System.lineSeparator());
        System.out.println(sb.length());

        sb.append(String.format("%2s", 0));
        for(int i = 1; i <= 24; i++){
            if(i % 2 == 0){
                sb.append(String.format("%2s", String.valueOf(i)));
            }
            else {
                sb.append(String.format("%2s", ""));
            }
        }

        System.out.println(sb.toString());
        System.out.println(sb.length());

        String s = " +-----------------------------------------------";
        System.out.println(s.length());
        String s2 = "0   2   4   6   8  10  12  14  16  18  20  22  24";
        System.out.println(s2.length());
    }

    @Test
    public void initTest(){
        StringBuilder sb = new StringBuilder();
        for(int i = 24; i > 0; i--){
            if(i % 2 == 0){
                sb.append(String.format("%3s", i+"|"));
            }
            else{
                sb.append(String.format("%3s", "|"));
            }
            sb.append(String.format("%47s", ""));
            sb.append(System.lineSeparator());
        }

        sb.append(String.format("%3s", "+"));
        for(int i = 1; i < 24; i++){
            sb.append("--");
        }
        sb.append("-");
        sb.append(System.lineSeparator());

        sb.append(String.format("%2s", 0));
        for(int i = 1; i <= 24; i++){
            if(i % 2 == 0){
                sb.append(String.format("%2s", String.valueOf(i)));
            }
            else {
                sb.append(String.format("%2s", ""));
            }
        }

        System.out.println(sb.toString());
    }


}
