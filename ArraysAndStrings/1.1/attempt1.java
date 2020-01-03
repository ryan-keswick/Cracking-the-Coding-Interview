import java.lang.reflect.Method;

/**
 * attempt1
 */
public class attempt1 {

    public static void main(String[] args) {
        System.out.print("\n\n\n\n");
        System.out.println(isUnique("abcdefg"));
        System.out.println(isUnique("asdcsd"));
        System.out.println(isUnique("a"));
        System.out.println(isUnique("aa"));
        System.out.println(isUnique(""));
    }

    public static Boolean isUnique(String str) {
        boolean[] table = new boolean[128]; 
        for (int i=0; i < str.length(); i++) {
            int ascii = str.charAt(i);
            if (table[ascii] == true) {
                return false;
            } else {
                table[ascii] = true;
            }
        }
        return true; 
    }
}