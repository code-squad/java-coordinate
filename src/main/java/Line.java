public class Line {
    private Point point1;
    private Point point2;
    public static int xDistance(){
        return Math.abs(Point.xPoints.get(1) - Point.xPoints.get(0));
    }

    public static int yDistance(){
        return Math.abs(Point.yPoints.get(1) - Point.yPoints.get(0));
    }

    public static double calculateDistance(){
        return Math.sqrt(Math.pow(xDistance(), 2) + Math.pow(yDistance(), 2));
    }
}
