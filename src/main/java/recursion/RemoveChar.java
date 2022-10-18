package recursion;

public class RemoveChar {

    public static void main(String[] args) {

       // removeCharA("", "bccabcdaz");
       // removeApple("", "bccabapplecdaz");

        String strWithoutA = skipARet( "bccabcdaz");
        System.out.println(strWithoutA);

        System.out.println(skipApple("bccabapplecdaz"));

    }

    public static void removeCharA(String p, String up){

        if(up.equals("")){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            removeCharA(p, up.substring(1));
        }else{
            removeCharA(p+ch, up.substring(1));
        }
    }

    public static String skipARet(String up){

        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            return skipARet(up.substring(1));
        }else{
            return ch + skipARet(up.substring(1));
        }

    }


    public static void removeApple(String p, String up){

        if(up.equals("")){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            removeApple(p, up.substring(5));
        }else{
            removeApple(p+ch, up.substring(1));
        }
    }

    public static String skipApple(String up){

        if(up.equals("")){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple( up.substring(1));
        }
    }
}
