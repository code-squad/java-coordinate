public class DrawVertical {
    public static void drawVertival(){
        for (int i = 24; i > 0; i--){
            odd(i);
            notOdd(i);
            System.out.println("|");
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
}
