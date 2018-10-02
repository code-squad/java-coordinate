package view;

import dto.GraphDto;
import dto.LineDto;
import dto.PointDto;

import java.util.List;

public class ResultView {

    public static void drawGraph(GraphDto graphDto) {
        List<LineDto> dtos = graphDto.getGraphDto();
        for (int i = dtos.size() - 1; i > 0; i--) {
            System.out.println(drawLine(i, dtos.get(i)));
        }
        System.out.println(drawLastLine(dtos.get(0)));
        System.out.println(onlyNumLine(dtos.size()));
    }

    public static String drawLine(int i, LineDto lineDto) {
        StringBuilder sb = new StringBuilder();
        List<PointDto> dtos = lineDto.getLineDto();

        sb.append(makeNumIndent(i));
        for (int j = 0; j < dtos.size(); j++) {
            sb.append(drawPoint(j, dtos.get(j)));
        }
        return sb.toString();
    }

    public static String checkFirst(PointDto dto) {
        if (dto.getX() == 0) {
            return "* ";
        }
        return "| ";
    }

    public static String checkNone(PointDto dto) {
        if (dto.getX() == -1) {
            return "  ";
        }
        return "* ";
    }

    public static String drawPoint(int j, PointDto dto) {
        if (j == 0) {
            return checkFirst(dto);
        }
        return checkNone(dto);
    }

    public static String checkLastFirst(PointDto dto) {
        if (dto.getX() == 0) {
            return "*";
        }
        return "+";
    }

    public static String checkLastNone(PointDto dto) {
        if (dto.getX() == -1) {
            return "--";
        }
        return "-*";
    }

    public static String drawLastPoint(int j, PointDto dto) {
        if (j == 0) {
            return checkLastFirst(dto);
        }
        return checkLastNone(dto);
    }

    public static String drawLastLine(LineDto lineDto) {
        StringBuilder sb = new StringBuilder();
        List<PointDto> dtos = lineDto.getLineDto();

        sb.append("  ");
        for (int j = 0; j < dtos.size(); j++) {
            sb.append(drawLastPoint(j, dtos.get(j)));
        }
        return sb.toString();
    }

    public static String makeNumIndent(int i) {
        if (i % 2 == 0) {
            return numSizeIndent(i);
        }
        return "  ";
    }

    public static String numSizeIndent(int i) {
        if (i > 9) {
            return String.valueOf(i);
        }
        return " " + i;
    }

    public static String onlyNumLine(int size) {
        StringBuilder sb = new StringBuilder();

        sb.append(" 0 ");
        for (int i = 1; i <= size; i++) {
            sb.append(makeNumIndent(i));
        }
        return sb.toString();
    }

    public static void printDistance(double distance) {
        System.out.println("두 점 사이의 거리는 " + distance);
    }

}