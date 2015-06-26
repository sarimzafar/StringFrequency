import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

//Worst Case Complexity of O(n^2)

/**
 * Created by shassanzafar on 6/22/2015.
 */
public class StringFrequency {
    //Class variables to ensure ease of access
    LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
    String word = "";


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        StringFrequency stringFrequency = new StringFrequency();
        System.out.println("Enter the word:");
        String temp = stringFrequency.word = obj.next();


        for (int i = 0; i < temp.length(); i++) {
            stringFrequency.calcFrequency(temp.charAt(i));
        }
        //for each entry in the Hashmap
        for (HashMap.Entry<Character, Integer> entry : stringFrequency.hashMap.entrySet()) {
            if (entry.getValue() != 1)
                System.out.print(entry.getKey() + "" + entry.getValue());
            else
                System.out.print(entry.getKey());
        }

    }

    public void calcFrequency(Character character) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (character == word.charAt(i))
                count++;
        }
        
        if(!hashMap.containsKey(character))
            hashMap.put(character, count);
    }
}
