package cci;

/*

    String Rotation:Assumeyou have a method isSubstringwhich checks if oneword is a substring
    of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
    call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").

*/
public class Q1_9 {

    public static void main(String[] args) {

        Q1_9 q9 = new Q1_9();
        String s = "waterbottle";
        String t = "erbottlewat";

        boolean result = isStringRotate(s, t);
        System.out.println(result);
    }

    private static boolean isStringRotate(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        String ss = s+s;

        if( ss.contains(t))
            return true;
        return false;
    }
}
