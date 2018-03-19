package coordinate.view;

import coordinate.domain.Line;

import java.util.List;

public class Builder {

    public static String buildLines(List<Line> lines){
        StringBuilder builder = new StringBuilder();

        for (int y = 0; y < 24; y++){

            String eachLine = buildEachLine(lines.get(y), y); //x축 전 까지만
            builder.append(eachLine);
        }
        String XAxisAndLabel = buildXAxisAndLabel(lines);// x축 + x라벨
        builder.append(XAxisAndLabel);
        return builder.toString();
    }

    private static String buildEachLine(Line line, int y){
        StringBuilder builder = new StringBuilder();
        for (int x = 0; x < 24; x++){
            builder.append(addEachElement(line, x, y));
        }
        builder.append("\n");
        return builder.toString();
    }

    private static String addEachElement(Line line, int x, int y){
        if (x == 0 && y == 23){ //x축에 라벨(0) 무시
            return "  ";
        }
        if (x == 0 && y % 2 == 1){ //홀수 y라벨
            return "  ";
        }
        if (x == 0 && y % 2 == 0){ //짝수 y라벨
            return formatYLabel(24 - y);
        }
        if (x == 1 && line.askPoint(x)){ //y축에 point 있음
            return "*";
        }
        if (x == 1 && !line.askPoint(x)){ //y축에 point 없음
            return "|";
        }
        return "";
    }

    private static String formatXLabel(int number){
        StringBuilder builder = new StringBuilder();
        String num = Integer.toString(number);
        int diff = 5 - num.length();
        for (int i = 0; i < diff; i++){
            builder.append(" ");
        }
        return builder.append(num).toString();
    }

    private static String formatYLabel(int number){
        StringBuilder builder = new StringBuilder();
        String num = Integer.toString(number);
        int diff = 2 - num.length();
        for (int i = 0; i < diff; i++){
            builder.append(" ");
        }
        return builder.append(num).toString();
    }

    private static String buildXAxisAndLabel(List<Line> lines){
        StringBuilder builder = new StringBuilder();

        builder.append(addXAxisElement(lines.get(23)));
        builder.append("\n");
        builder.append(" ");
        for (int x = 0; x < 25; x++){
            builder.append(addXLabel(x));
        }
        return builder.toString();
    }

    private static String addXAxisElement(Line line){
        StringBuilder builder = new StringBuilder();
        for (int x = 0; x <= 24; x++){
            builder.append(determinePart(line, x));
        }
        return builder.toString();
    }

    private static String determinePart(Line line, int x){
        if(x == 24){
            return "---";
        }
        if(x == 0){
            return "  ";
        }
        if(x == 1 && !line.askPoint(x)){
            return "+";
        }
        if (line.askPoint(x)){
            return "*";
        }
        return "--";
    }

    private static String addXLabel(int x){
        if (x % 2 == 0 && x != 0){
            return formatXLabel(x);
        }
        if(x == 0){
            return Integer.toString(x);
        }
        return "  ";
    }

















//    public String buildCalculator(List<Line> coordinates) {
//        StringBuilder builder = new StringBuilder();
//        for (Line line : coordinates) {
//            String yLabel = addYLabel(coordinates.indexOf(line));
//            String eachLine = buildLine(line, coordinates.indexOf(line)); //x 축 까지만
//            builder.append(eachLine);
//        }
//        builder.append();//마지막 x라벨 더하기
//        return builder.toString();
//    }
//    private String addYLabel(int index) {
//        StringBuilder builder = new StringBuilder();
//        if (index == 23) { //0은 x라벨에
//            return builder.append(" ").toString();
//        }
//        if (index % 2 == 0) { //i가 짝수면 숫자
//            return builder.append(index).toString();
//        }
//        return builder.append(" ").toString(); //i가 홀수면 " "
//    }
//    private String buildLine(Line line, int index) {
//        StringBuilder builder = new StringBuilder();
//        for (int x = 0; x < 24; x++) {
//            builder.append(addPoints(line, index, x));
//        }
//        builder.append("\n");
//        return builder.toString();
//    }
//
//    private String addPoints(Line line, int index, int x) {
//        StringBuilder builder = new StringBuilder();
//        if (index == 23){
//            return builder.append(addXAxisPart(line, x)).toString(); // * or - or +
//        }
//        if (line.askPoint(x)) {
//            return builder.append("*").toString();
//        }
//        if (x == 0) {
//            return builder.append("|").toString();
//        }
//        return builder.append(" ").toString();
//    }
//
//    private String addXAxisPart(Line line, int x) {
//        StringBuilder builder = new StringBuilder();
//        if (line.askPoint(x)) {
//            return builder.append("*").toString();
//        }
//        if (x == 0) {
//            return builder.append("+").toString();
//        }
//        return builder.append("-").toString();
//    }
//
//    private String addXLabel(){
//        for (int i = 0; i < 24; i++){
//            if(i == 0){
//
//            }
//        }
//    }
}
