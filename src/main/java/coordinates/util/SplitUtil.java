package coordinates.util;

import java.util.ArrayList;
import java.util.List;

public class SplitUtil {

    private String input(String input){
        input = input.replace("(", "").replace(")","").replace("-",",");
        return input;
    }

    private String[] splitNum(String input){
        String[] split = input(input).split(",");
        return split;
    }

    public List<Integer> changeNum(String input){
        List<Integer> pointNum = new ArrayList<>();

        for (String number : splitNum(input)){
            pointNum.add(Integer.parseInt(number));
        }
        return pointNum;
    }
}
