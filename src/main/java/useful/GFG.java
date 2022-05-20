/*
package useful;

import java.io.*;
import java.nio.file.*;
import org.apache.commons.io.FileUtils;
import org.json.*;

// Main class
// To read JSON file and write the contents of
// JSONArray to CSV file
public class GFG {

    // Main driver method
    @SuppressWarnings("deprecation")
    public static void main(String args[])
    {
        // Class data members
        String jsonString;
        JSONObject jsonObject;

        // Try block to check for exceptions
        try {

            // Step 1: Reading the contents of the JSON file
            // using readAllBytes() method and
            // storing the result in a string
            jsonString = new String(
                    Files.readAllBytes(Paths.get("file.json")));

            // Step 2: Construct a JSONObject using above
            // string
            jsonObject = new JSONObject(jsonString);

            // Step 3: Fetching the JSON Array test
            // from the JSON Object
            JSONArray docs
                    = jsonObject.getJSONArray("test");

            // Step 4: Create a new CSV file using
            //  the package java.io.File
            File file = new File("C:\\Test.csv");

            // Step 5: Produce a comma delimited text from
            // the JSONArray of JSONObjects
            // and write the string to the newly created CSV
            // file

            String csvString = CDL.toString(docs);
            FileUtils.writeStringToFile(file, csvString);
        }

        // Catch block to handle exceptions
        catch (Exception e) {

            // Display exceptions on console with line
            // number using printStackTrace() method
            e.printStackTrace();
        }
    }
}
*/
