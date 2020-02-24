package IO;

/**
 This program:
 - Simple mechanical example to create a folder.

 Some Notes:
 -

 Created at 2020-02
 */

import java.io.File;

public class CreateFolder {

    public static void main(String[] args) {

        String folderName = "testFolder1";
        String folderPath = "..\\git-homework\\src\\IO";

        File myFolder = new File(folderPath + "/" + folderName);

        myFolder.mkdir();
    }

}
