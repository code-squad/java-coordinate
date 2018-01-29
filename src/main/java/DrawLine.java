public class DrawLine {
    public static void draw(){
        for(int y = 24; y > 0; y--){
            odd(y);
            notOdd(y);
            System.out.print("|");
            drawX(y);
            System.out.println();
        }
    }

    public static void drawX(int y){
        for(int x =0; x < 25; x++){
            printStart(x, y);
        }
    }

    public static void printStart(int x, int y){
        for(int i = 0; i < Point.xPoints.size(); i++){
            if(Point.yPoints.get(i) == y && Point.xPoints.get(i) == x)
                System.out.print(" *");
            System.out.print(" ");
        }
    }

    public static void odd(int i){
        if(i % 2 == 0)
            System.out.print(String.format("%2s", i));
    }

    public static void notOdd(int i){
        if (i % 2 != 0)
            System.out.print(String.format("%2s","  "));
    }

    public static void printNumber(){
        System.out.print(String.format("%3s","0"));
        for (int i = 1; i < 25; i++){
            checkNumber(i);
        }
    }

    public static void checkNumber(int i){
        if(i % 2 == 0 && i != 0){
            System.out.print(String.format("%4s",i));
        }
    }
}
