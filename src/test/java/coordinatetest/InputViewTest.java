package coordinateTest;

import org.junit.Test;

import java.util.*;
import java.util.regex.*;

public class InputViewTest {
    @Test
    public void extractValue() {
        String a = "<10,10)-<14,15)";               //pattern matcher 클래스를 통한 숫자 추출
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(a);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }
    }

    @Test
    public void stringSplit() {
        String spaceString = "ABC,  1,   DEFg, HIJK";           //공백 제거
        String[] arr = spaceString.split(",|\\s+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length());
        }
        System.out.println(arr.length);
    }

    @Test
    public void extractNumberBySplit() {
//        String b = "";
        String a = "(10,10)-(14,15)";                                    //split 으로 숫자 추출 하려고 했 지만 비어있는 값을 반환해서 StringTokenizer 로 쪼갬
        List<String> nums = new ArrayList<>();
        StringTokenizer stz = new StringTokenizer(a, "\\(|,|\\)");

        while (stz.hasMoreElements()) {
            nums.add(stz.nextToken());
        }
        System.out.println(nums);

//        String[] num = a.split("\\(|,|\\)|-");
//        System.out.println(Arrays.toString(num));
//        System.out.println(num.length);
    }

    @Test
    public void splitPractice() {                           // split 으로 2개의 문자를 기준으로 자르기
        String a = "AA.BB-CC-DD.zip";
        String[] tokens = a.split("\\.|-");
        System.out.println(Arrays.toString(tokens));
    }

    @Test
    public void splitTest() {                                 //split 으로 자르는 횟수 정하기
        String a = "a,b,c,d";
        System.out.println(Arrays.toString(a.split(",", 2)));
    }

    @Test
    public void forEachTest() {
        String[] a = {"aa", "bb", "cc", "dd"};
        for (String b : a) {
            System.out.println(b);
        }
    }

    @Test
    public void splitDashTest() {
        String[] numberWithDash = {"10", "10", "-", "14", "15"};
        System.out.println(Arrays.toString(Arrays.toString(numberWithDash).split("-")));
        System.out.println(Arrays.toString(numberWithDash).split("-").length);
    }

    @Test
    public void diasassembleAndInputArray() {
        String a = "(10,10)-(20,20)";
        StringTokenizer stz = new StringTokenizer(a, "\\(|\\)|,|-");
        int[][] arr = new int[stz.countTokens() / 2][2];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = Integer.parseInt(stz.nextToken());
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }


}


