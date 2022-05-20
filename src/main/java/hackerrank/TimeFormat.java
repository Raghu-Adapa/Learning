package hackerrank;

import java.util.Scanner;

public class TimeFormat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        String[] time = input.split(":");
        int hr = Integer.valueOf(time[0]);
        int min = Integer.valueOf(time[1]);
        int sec = Integer.valueOf(time[2].substring(0,2));
        String format = time[2].substring(2);

        int nhr = hr;
        int nmin = min;
        int nsec = sec;
        if(hr == 12 && format.equals("AM")){
            nhr = 00;
        }
        if(format.equals("PM") && hr != 12){
            nhr +=12;

        }

        String result = "";

        result = "" + ((nhr<10)? "0"+nhr : nhr) + ":" + ((nmin<10)? "0"+nmin : nmin) +":"+ ((nsec<10)? "0"+nsec : nsec);

        System.out.println(result);
    }
}
