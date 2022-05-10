import java.util.ArrayList;
import java.util.List;

public class HelperDisplay {

    private static ArrayList<Integer> rows = new ArrayList<>();

    public static void displayRowResult(int i, int j){
        System.out.print("Zeile " + (i+1)+ ":");
        System.out.println("");
        rows.add(i);
        System.out.println("   Anzahl in Zeile: " + j);
        //System.out.println("");
    }
    public static void displayResult(int j){
        System.out.println("");
        System.out.println("In der Zeile: ");
        for(int i = 0; i < rows.size();i++)
            System.out.print(rows.get(i)+", ");
        System.out.println("");
    }
    public static void displayChars(List<Integer> list){

        System.out.println("Wort befindet sich an Stelle:");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+", ");
        }
        System.out.println("");
    }
}
