import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelperRead {
    public static List<String> readTxt(String url){
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
