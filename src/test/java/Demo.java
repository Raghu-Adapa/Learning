public class Demo{



    public static void main(String[] args){
       /* System.out.println(getValue0());
        System.out.println(getValue1());
        System.out.println(getValue2());
        System.out.println(getValue3());
        System.out.println(getValue4());
*/
        System.err.println(getValue2());
    }
    private static int getValue0(){
        try{
            System.out.println("Try");
            return 20;
        }catch(Exception e){
            System.err.println("Error");
        }
        return 0;
    }
    private static int getValue1(){
        try{
            System.out.println("Try");
            return 20;
        }catch(Exception e){
            System.err.println("Error");
        }finally{
            System.out.println("Finally");
        }
        return 0;
    }

    //Try Finally 20
    private static int getValue2(){
        try{
            System.out.println("Try");
            return 20;
        }catch(Exception e){
            System.err.println("Error");
        }finally{
            System.out.println("Finally");
            return 10;
        }
    }

    //Try Finally 20
    private static int getValue3(){
        try{
            System.out.println("Try");
            throw new Exception();
           // return 20;
        }catch(Exception e){
            System.err.println("Error");
        }finally{
            System.out.println("Finally");
        }
        return 0;
    }
    //Try Error Finally
    private static int getValue4(){
        try{
            System.out.println("Try");
            throwException();
            return 20;
        }catch(Exception e){
            System.err.println("Error");
        }finally{
            System.out.println("Finally");
        }
        return 30;
    }



    private static void throwException() throws Exception{
        throw new Exception();
    }
}