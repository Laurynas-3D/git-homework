package IO;
/**
 This program:
 - Simple mechanical example to create a text file.

 Some Notes:
 -

 Created at 2020-02
 */
import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        String fileName = "testFile1.txt";
        String filePath = "..\\git-homework\\src\\IO";

        File myFile = new File(filePath + "/" + fileName);

        // createNewFile() method creates a testFile1.txt
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
