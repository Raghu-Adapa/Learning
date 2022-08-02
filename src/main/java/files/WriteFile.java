package files;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) {
        writeTo("");
    }


    public static void writeTo(String str){
        try {
            FileWriter writer = new FileWriter("C:\\docker_mount\\tmp\\account_data_out.txt", true);
            writer.write(str);
            writer.write("\r\n");   // write new line
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
