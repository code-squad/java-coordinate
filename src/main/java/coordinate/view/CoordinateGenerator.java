package coordinate.view;

public class CoordinateGenerator {
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int MAX_POSITION = 24;

    private static final String VERTICAL = "|";
    private static final String PLUS = "+";
    private static final String HYPHEN = "-";
    private static final String NULL_VALUE = "";
    private static final String TWO_LETTER_FORMAT = "%2s";
    private static final String THREE_LETTER_FORMAT = "%3s";
    private static final String FORTY_SEVEN_LETTER_FORMAT = "%47s";

    private static StringBuilder sb = new StringBuilder();

    public static StringBuilder initCoordinate(){
        sb.setLength(ZERO);
        initVertical();
        initHorizon();
        return sb;
    }

    public static void addNewLine(){
        sb.append(System.lineSeparator());
    }

    public static void addHyphen(int numberOfTimes){
        for(int i = ZERO; i < numberOfTimes; i++){
            sb.append(HYPHEN);
        }
    }

    public static void initVertical(){
        for(int i = MAX_POSITION; i > ZERO; i--){
            sb.append(String.format(THREE_LETTER_FORMAT, decideToShowNumber(i) + VERTICAL));
            sb.append(String.format(FORTY_SEVEN_LETTER_FORMAT, NULL_VALUE));
            addNewLine();
        }
    }

    public static void initHorizon(){
        initSecondHorizon();
        initFirstHorizon();
    }

    public static void initSecondHorizon(){
        sb.append(String.format(THREE_LETTER_FORMAT, PLUS));
        for(int i = ONE; i < MAX_POSITION; i++){
            addHyphen(TWO);
        }
        addHyphen(ONE);
        addNewLine();
    }

    public static void initFirstHorizon(){
        sb.append(String.format(TWO_LETTER_FORMAT, ZERO));
        for(int i = ONE; i <= MAX_POSITION; i++){
            sb.append(String.format(TWO_LETTER_FORMAT, decideToShowNumber(i)));
        }
    }

    private static boolean isEven(int number){
        return number % TWO == ZERO;
    }

    public static String decideToShowNumber(int number){
        if(isEven(number)){
            return String.valueOf(number);
        }
        return NULL_VALUE;
    }
}
