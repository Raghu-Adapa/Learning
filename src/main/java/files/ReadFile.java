package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {


    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\docker_mount\\tmp\\account_data.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            while ((line = bufferedReader.readLine()) != null ) {
                System.out.println(line);

                StringBuffer sb = new StringBuffer();

                String[] str = line.split(",");

                for(int i=0;i<str.length;i++){

                    if(i==4){

                        sb.append(str[i]+",1024,1024,");

                    }else if(i==26){
                        sb.append("1024,"+str[i]);
                    }else{
                        sb.append(str[i]+",");
                    }
                }

                WriteFile.writeTo(sb.toString());
                System.out.println(sb.toString());

            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
