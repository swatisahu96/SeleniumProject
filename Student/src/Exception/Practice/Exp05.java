package Exception.Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exp05 {

    public static void main(String[] args) throws Exception {

        readFile("C://a.txt");
    }

    static void readFile(String fileName) throws Exception {

        // When whole method might give some error
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
    //can use both throw and throws here
        if(fileName.length()==0){
            throw new FileNotFoundException("Exception");
        }

    }
}
