package Interviews;

import java.util.*;

public class InputTypeChecking {
    public static void main(String args[] ) throws Exception {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String type = "";
        try{
            Integer.parseInt(str);
            System.out.println("This input is of type Integer.");
            return;

        }catch(NumberFormatException e){
            //not int
        }
        //check if float
        try{
            Float.parseFloat(str);
            System.out.println("This input is of type Float.");
            return;
        }catch(NumberFormatException e){
            //not float
        }
        System.out.println("This input is of type string.");
    }
}