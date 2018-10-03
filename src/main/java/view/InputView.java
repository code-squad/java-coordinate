package view;

import domain.Axis;
import domain.Point;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {
    private InputView() {

    }

    public static List<Point> getInput() {
        String input = null;
        do {
            System.out.println("좌표를 입력하세요.");
            input = new Scanner(System.in).nextLine();
        } while(!isOverNum(input) && !isRegex(input));

        return makeDots(input);
    }

    private static List<Point> makeDots(String input) {
        List<Integer> dots = new ArrayList<>();
        String regex = "[0-9]{1,2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()) {
            dots.add(Integer.parseInt(matcher.group()));
        }
        return makePoints(dots);
    }

    private static List<Point> makePoints(List<Integer> dots) {
        List<Point> points = new ArrayList<>();
        for(int i = 0; i < dots.size(); i+=2) {
            points.add(new Point(dots.get(i), dots.get(i + 1)));
        }
        return points;
    }

    private static boolean isRegex(String input) {
        /* (10,10)-(10,10)형식인지 확인 */
        String regex = ".[0-9]{1,2},[0-9]{1,2}.-.[0-9]{1,2},[0-9]{1,2}.";
        if(Pattern.compile(regex).matcher(input).find()) {
            return true;
        }
        return false;
    }

    private static boolean isOverNum(String input) {
        /* 초과한 숫자가 있는지 확인 */
        String regex = "[0-9]{1,2}";
        Matcher matcher = Pattern.compile(regex).matcher(input);
        while(matcher.find()) {
            if(checkNum(matcher.group())) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkNum(String input) {
        if(Integer.parseInt(input) > Axis.MAX_SIZE) {
            return false;
        }
        return true;
    }


}
