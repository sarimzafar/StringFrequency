import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by shassanzafar on 6/22/2015.
 */
public class StringFrequency {

    HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();
    String word = "";

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        StringFrequency stringFrequency = new StringFrequency();
        String temp = stringFrequency.word = obj.next();
        for (int i = 0; i < temp.length(); i++) {
            stringFrequency.calcFrequency(temp.charAt(i));
        }

        for (char i = 'a'; i <= 'z'; i++) {
            if (stringFrequency.hashMap.containsKey(i))
                System.out.print(i + stringFrequency.hashMap.get(temp.charAt(i)));
        }

    }

    public void calcFrequency(Character character) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (character == word.charAt(i))
                count++;
        }
        hashMap.put(character, count);
    }
}
