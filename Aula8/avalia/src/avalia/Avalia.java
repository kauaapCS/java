package avalia;
public class Avalia {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    
    public static void main(String[] args) {
        int x = 11;
        if (x != 10) {
            if ((x > 15) || (x <= 20)) {
                x = (x + 2);
            } else {
                x = (x - 4);
            }
        }
        if (x >= 10) {
            x = (x + 5);
        } else {
            x = (x - 3);
        }
        System.out.println("x = " + x);
    }
}