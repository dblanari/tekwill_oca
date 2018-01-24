package codewars;

/**
 * Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
 * <p>
 * Examples input/output:
 * <p>
 * XO("ooxx") => true
 * XO("xooxx") => false
 * XO("ooxXm") => true
 * XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
 * XO("zzoo") => false
 * FUNDAMENTALS
 */
public class XO {
    public static boolean getXO(String str) {
        int x = 0;
        int o = 0;
        String myStr = str.toLowerCase();
        for (char c : myStr.toCharArray()){
            if (c == 'x'){
                x++;
            } else if (c == 'o'){
                o++;
            }
        }
        return x == o;
    }
}