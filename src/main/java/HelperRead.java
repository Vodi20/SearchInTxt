import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelperRead {
    public static List<String> readTxt(String url){                                         //function gets an url of a txt, deserializes it and returns the data of the txt in a list
        BufferedReader br = null;
        List<String> strlist = new ArrayList<String>();

        try{
            File file = new File(url);
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                strlist.add(sc.nextLine());
            }

        }catch(FileNotFoundException fnfe){
            System.out.println(fnfe);
        }
        return strlist;
    }
}
