import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum = 0;
        for(Integer i:L){
            sum += i;
        }
        return sum;

    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i:L){
            if(i % 2 ==0){
                list.add(i);
            }
        }
        return list;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<L1.size();i++){
            if(L2.contains(L1.get(i))){
                list.add(L1.get(i));
            }
        }
        return list;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count =0;
        for(String word:words){
            char[] w = word.toCharArray();
            for (char c1 : w) {
                if (c1 == c) {
                    count++;
                }
            }
        }
        return count;
    }
}
