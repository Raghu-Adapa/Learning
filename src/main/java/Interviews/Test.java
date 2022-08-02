package Interviews;

public class Test {



/*    String s1="abc", i = 3
      String s2="def", j = 1

    String s3="adbxcef"*/
    public static void main(String[] args) {
        System.out.println("Hello !");
    }

    public boolean characterString(String s1, String s2, String s3){

        int i=0;
        int j=0;

        for(int k=0;k<s3.length();k++){

            char c = s3.charAt(k);

            boolean flag = true;
            if(i<s1.length() && c == s1.charAt(i)){
                i++;
                flag = false;
            }

            if(j<s2.length() && c == s2.charAt(j)){
                j++;
                flag = false;
            }

            if(flag){
                return false;
            }

        }

        if(i == s1.length() && j== s2.length())
            return true;
        return false;


    }
}
