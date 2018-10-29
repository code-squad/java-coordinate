package model;

import java.util.ArrayList;
import java.util.List;

public class ParserString {
    int x;
    int y;
    private List<Integer> list = new ArrayList<>();

    public void makePoint(String coordinateNum) {
        String[] seperateDash = coordinateNum.split("-");
        removeBrace(seperateDash);
        processMakeList(seperateDash);
        System.out.println(list.get(0) + "," + list.get(1) + ":" + list.get(2) + "," +list.get(3));
    }

    private void processMakeList(String[] seperateDash) {
        for (int i = 0; i < seperateDash.length; i++) {
            String onePointLine = seperateDash[i];
            String[] seperateComma = onePointLine.split(",");
            putNumberInList(seperateComma);
        }
    }

    private void putNumberInList(String[] seperateComma) {
        for (int j = 0; j < seperateComma.length; j++) {
            list.add(Integer.parseInt(seperateComma[j]));
        }
    }

    private void removeBrace(String[] seperateDash) {
        for (int i = 0; i < seperateDash.length; i++) {
            seperateDash[i] = seperateDash[i].replace("(", "").replace(")", "");
        }
    }

    public void seperatePossition() {
        for(int i = 0; i < list.size(); i++) {
            checkPointPossition(list.get(i));
        }
        return 
    }

    public void checkPointPossition(int num) {
        if(num % 2 == 0) {
            x = list.get(num);
        }
        if(num % 2 == 1) {
            y = list.get(num);
        }
    }
}