package StringsPrograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Find_Duplicate_character {

    public void countDuplicate(String str) {
        //step1: create a hashmap and store character as key and integer as value
        //step2: convert word to character Array
        str = str.toLowerCase();
        Map<Character, Integer> hmap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (Character ch : chars) {
            if (hmap.containsKey(ch)) {
                hmap.put(ch, hmap.get(ch) + 1);
            } else {
                hmap.put(ch, 1);
            }
        }
        Set<Character> keys = hmap.keySet();
        for (Character ch1 : keys) {
            if (hmap.get(ch1) > 1) {
                System.out.println("character:  " + ch1 + "----> " + hmap.get(ch1) +"  times");
            }
        }
    }
    public static void main(String[] args) {
        Find_Duplicate_character findDuplicateCharacter = new Find_Duplicate_character();
        System.out.println("String is  Deepakd");
        System.out.println("-------------------------------");
        findDuplicateCharacter.countDuplicate("Deepakd");
    }
}
