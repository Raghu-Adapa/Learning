import java.util.LinkedList;
import java.util.Scanner;

public class Temp1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean isExit = true;

        double total = 0;

        while (isExit ){
            Double height = Double.parseDouble(sc.next());
            Double width = Double.parseDouble(sc.next());
            //String input = sc.next();

            if(height == 0 || width == 0){
                isExit = false;
            }else {


                /*double height = Double.parseDouble(input.split(" ")[0]);
                double width = Double.parseDouble(input.split(" ")[1]);*/

                double sft = (height/12.0 ) * (width/12.0 );

                System.out.println(sft);

                total += sft;
            }
        }

        System.out.println("Final :" + total);






        /*boolean isExit = true;

        while (isExit ){
            String input = sc.next();
            if("exit".equalsIgnoreCase(input)){
                isExit = false;
            }else{

                for(char c : input.toCharArray()){
                    System.out.println(c);
                }
            }
            System.out.println();
        }*/
    }
}
