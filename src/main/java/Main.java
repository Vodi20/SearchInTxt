import java.util.List;

public class Main {

    public static void main(String args[]){
        List<String> strlist = HelperRead.readTxt("SampleText.txt");

        HelperSearch.searchAll(strlist);
    }
}
