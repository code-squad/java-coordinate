public class DrawHorizon {
    public static void drawHorizon() {
        System.out.print(String.format("%3s","+"));
        for (int i = 0; i < 25; i++){
            System.out.print("--");
        }
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
