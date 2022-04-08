package useful;

import java.security.SecureRandom;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;


public class TimestampEx {

    // 2021.03.24.16.34.26
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");

    // 2021-03-24T16:44:39.083+08:00
    private static final SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

    // 2021-03-24 16:48:05
    private static final SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {

        // method 1
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);                      // 2021-03-24 16:34:26.666

        // method 2 - via Date
        Date date = new Date();
        System.out.println(new Timestamp(date.getTime()));  // 2021-03-24 16:34:26.666
        // number of milliseconds since January 1, 1970, 00:00:00 GMT
        System.out.println(timestamp.getTime());            // 1616574866666

       // System.out.println(sdf1.format(timestamp));         // 2021.03.24.16.34.26

        //System.out.println(sdf2.format(timestamp));         // 2021-03-24T16:48:05.591+08:00

        //System.out.println(sdf3.format(timestamp));         // 2021-03-24 16:48:05


        Long phone = 9666047705L;

        System.out.println("Phone : "+ phone);


        System.out.println(countDigit(phone));

        System.out.println(generateRandomString(16));
        System.out.println(generateRandomBytes(16));

    }

    static int countDigit(long n)
    {
        String num = Long.toString(n);

        return num.length();
    }


    public static String generateRandomString(int length){

        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = (int)(AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return sb.toString();
    }


    public static byte[] generateRandomBytes(int length) {
        SecureRandom ng=new SecureRandom();
        byte[] randomBytes=new byte[length];
        ng.nextBytes(randomBytes);
        System.out.println("---bytes--");
        System.out.println(Arrays.toString(randomBytes));
        ng.nextBytes(randomBytes);
        System.out.println(Arrays.toString(randomBytes));

        System.out.println("---toString--");
        System.out.println(randomBytes.toString());
        return randomBytes;
    }

    // adding comment

}
