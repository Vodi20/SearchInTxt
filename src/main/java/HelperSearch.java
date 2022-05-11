import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelperSearch {
    public static void searchAll(List<String> strlist){                                     //function that searches through a list, which contains the rows of the txt file
        System.out.println("Welches Wort wollen Sie suchen: ");
        String search = scanSearch();
        int count = 0;
        for (int i = 0; i < strlist.size(); i++){
            if(strlist.get(i).contains(search)){
                String[] arr = strlist.get(i).split(" ");
                count = checkWords(arr, search);
                if(count != 0) {
                    HelperDisplay.displayRowResult(i, count);
                    HelperDisplay.displayChars(searchChars(strlist.get(i), search));
                }

            }
        }
        HelperDisplay.displayResult(count);
    }

    private static ArrayList<Integer> searchChars(String str, String search){               //function that searches for the index of the first char of the searched word in a specific row

        char[] searcharr = search.toCharArray();
        char[] chrarr= str.toCharArray();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < chrarr.length; i++){

                if (chrarr[i] == searcharr[0]){
                    boolean right = true;
                    for(int j = 1; j < searcharr.length; j++){
                        if(chrarr[i+j] != searcharr[j]){
                            right = false;
                            break;
                        }
                    }
                    if (right) {
                        list.add(i);
                    }
                }
            }
        return list;
    }

    private static String scanSearch(){                                                     //function which reads the searched word in console
        try {
            Scanner sc = new Scanner(System.in);
            String search = sc.next();
            return search;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }

    }

    public static int checkWords(String[] arr, String search){                              //function which returns the count of the searched word in the row
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals(search)){
                count+=1;
            }
            else{
            }
        }
        return count;
    }

}
