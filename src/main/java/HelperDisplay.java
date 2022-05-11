import java.util.ArrayList;
import java.util.List;

public class HelperDisplay {

    private static ArrayList<Integer> rows = new ArrayList<>();

    public static void displayRowResult(int i, int j){                          //shows how often the word is contained in a row
        System.out.print("Zeile " + (i+1)+ ":");
        System.out.println("");
        rows.add(i);
        System.out.println("   Anzahl in Zeile: " + j);
    }
    public static void displayResult(int j){                                    //shows in which row the searched word is
        System.out.println("");
        System.out.println("In der Zeile: ");
        System.out.println("");
        for(int i = 0; i < rows.size();i++)
            System.out.print(rows.get(i)+", ");

    }
    public static void displayChars(List<Integer> list){                        //shows the index of the first char of the word (or words) in the row
        System.out.println("   Wort befindet sich an Stelle:");
        System.out.print();
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i)+", ");
        System.out.println("");
    }
}
