public class Solution {


    public static void main(String[] args) {
        Object str1 = new Object();
        Object str2 = new Object();

        System.out.println(str1.hashCode() );
        System.out.println(str2.hashCode() );


        if(str1.equals(str2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }

}
