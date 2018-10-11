package coordinate.utill;

public class Parser {
    public static String[] deshSeparator(String text){
        return text.split("-");
    }

    public static String[] parenthesisRemove(String[] text){
        String [] values = new String[2];
        for (int i = 0; i < text.length; i++) {
            values[i] = text[i].replace("(","").replace(")","");
        }
        return values;
    }
}
