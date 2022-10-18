package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {

        permutations("", "abc");
        List<String> result = permutationsRet("", "abc");
        System.out.println(result);

        // count of permutations : n! where n is the length of the string
        int c = permutationsCount("", "abcd");
        System.out.println(c);

    }

    public static void permutations(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        for(int i=0;i<=p.length();i++){

            char ch = up.charAt(0);

            String first = p.substring(0, i);
            String last = p.substring(i);

            permutations(first+ch+last, up.substring(1));
        }

    }

    public static List<String> permutationsRet(String p, String up){

        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> current = new ArrayList<>();

        for(int i=0;i<=p.length();i++){

            char ch = up.charAt(0);

            String first = p.substring(0, i);
            String last = p.substring(i);

            List<String> sub = permutationsRet(first+ch+last, up.substring(1));
            current.addAll(sub);

        }

        return current;



    }

    public static int permutationsCount(String p, String up){

        if(up.isEmpty()){

            return 1;
        }

        int count = 0;
        for(int i=0;i<=p.length();i++){

            char ch = up.charAt(0);

            String first = p.substring(0, i);
            String last = p.substring(i);

            count = count + permutationsCount(first+ch+last, up.substring(1));
        }
        return count;

    }

}
