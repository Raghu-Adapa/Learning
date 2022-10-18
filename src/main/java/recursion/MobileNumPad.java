package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MobileNumPad {

    static Map<Integer, Character[]> map = new HashMap<>();

    public static void main(String[] args) {


        System.out.println(pad("",""));


    }

    private static List<String> pad(String p, String up) {

         if(up.isEmpty()){
             List<String> ouptput = new ArrayList<>();

             ouptput.add(p);
             return ouptput;
         }

         List<String> result = new ArrayList<>();

         int ch = up.charAt(0) - '0'; // convert '2' to 2

         Character[] possibleChars = getChars(ch);

         for(int i=0; i<possibleChars.length;i++){
             List<String> sub = pad(p+possibleChars[i], up.substring(1));
             result.addAll(sub);
         }

         return result;
    }

    private static Character[] getChars(int num){

        if(map.size()==0) {

            //Map<Integer, Character[]> map = new HashMap<>();

            map.put(2, new Character[]{'a', 'b', 'c'});
            map.put(3, new Character[]{'d', 'e', 'f'});
            map.put(4, new Character[]{'g', 'h', 'i'});
            map.put(5, new Character[]{'j', 'k', 'l'});
            map.put(6, new Character[]{'m', 'n', 'o'});
            map.put(7, new Character[]{'p', 'q', 'r', 's'});
            map.put(8, new Character[]{'t', 'u', 'v'});
            map.put(9, new Character[]{'w', 'x', 'y', 'z'});
        }

        return map.getOrDefault(num, new Character[0]);

    }
}
