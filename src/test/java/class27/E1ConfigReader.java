package class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

      //System.getProperty("user.dir") => it gives you the path till your project
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";//find the location to even go to the file in the first place
        //Bring the data from the file in the form of bytes
        FileInputStream fis=new FileInputStream(path);
        // converts the data in the form of key value pairs
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.get("userName"));

        /*
        1-Path find the location to even go to the file in the first place.
        2-FileInputStream like a car it will take the address go hard drive grape
        that the data it will be back to java program.
        3-Properties can help us to read the information

         */

    }
}
