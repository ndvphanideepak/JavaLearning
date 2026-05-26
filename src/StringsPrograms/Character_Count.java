package StringsPrograms;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Character_Count {
    public void countCharacters(String str) {
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

                System.out.println("character:  " + ch1 + "----> " + hmap.get(ch1) +"  times");

        }
    }
    public static void main(String[] args) {
        Character_Count  characterCount = new Character_Count();
        System.out.println("Character count of"+"HelloHai");
        System.out.println("-----------------------------------");
        characterCount.countCharacters("HelloHai");
    }
}
