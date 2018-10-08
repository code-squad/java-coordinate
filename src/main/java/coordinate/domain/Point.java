package coordinate.domain;

import coordinate.CoordinateMain;

public class Point {
    private int x;
    private int y;

    Point(int x, int y){
        try{
            if(x < 0 || x > 24){
                throw new IllegalArgumentException();
            }
            this.x = x;
        }catch (IllegalArgumentException e){
            System.out.println("x 좌표값이 범위를 초과했습니다. 다시입력하세요.");
            CoordinateMain.run();
        }

        try{
            if(y < 0 || y > 24){
                throw new IllegalArgumentException();
            }
            this.y = y;
        }catch (IllegalArgumentException e){
            System.out.println("y 좌표값이 범위를 초과했습니다. 다시입력하세요.");
            CoordinateMain.run();
        }
    }

    public static Point ofCommaSeparator(String text){
        String [] values = text.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }

    public double distance(Point point){
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
