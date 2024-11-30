import java.util.*;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        HashMap<Character, Integer> map = new HashMap<>();
        // 97-122
        char c = 96;
        for(int i=1;i<27;i++){
            map.put((char)(c+i),i);
        }
        return map;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        if(nums.isEmpty()){
            return null;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        Iterator<Integer> iterator = nums.iterator();
        while(iterator.hasNext()){
            Integer num = iterator.next();
            map.put(num,num * num);
        }
        return map;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        if(words.isEmpty()){
            return null;
        }
        TreeMap<String,Integer> map = new TreeMap<>();
        for(String word:words){
            if(!map.containsKey(word)){
                map.put(word,1);
            }else{
                map.put(word,map.get(word)+1);
            }
        }
        return map;
    }
}
