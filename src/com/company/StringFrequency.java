import java.util.*;

/**
 * Created by shassanzafar on 6/22/2015.
 */
public class StringFrequency {

    LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
    String word = "";
    char [] chars = new char[]{};


    public void sortWord()
    {
        chars = word.toCharArray();
        Arrays.sort(chars); //nlog(n)
    }

    public int BinarySearch(int max,int min,char key)
    {
        if(max < min)
            return 0;
        else
        {
            int mid = (max+min)/2;
            if(key == chars[mid])
                return 1;
            else if(key > chars[mid])
                BinarySearch(max,mid+1,key);
            else
                BinarySearch(mid-1,min,key);
        }
        return 1;
    }


    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        StringFrequency stringFrequency = new StringFrequency();
        String temp = stringFrequency.word = obj.next();
        stringFrequency.sortWord();

        for (int i = 0; i < temp.length(); i++) {
            stringFrequency.calcFrequency(temp.charAt(i));
        }

        for (Map.Entry<Character, Integer> entry : stringFrequency.hashMap.entrySet()) {//for each entry in the entryset of the hashmap
            if (entry.getValue() != 1)
                System.out.print(entry.getKey() + "" + entry.getValue());
            else
                System.out.print(entry.getKey());
        }

    }

    public void calcFrequency(Character character) {
        //do a binary search and update the linked hash map
        int count = BinarySearch(chars.length-1,0,character);
        if(!hashMap.containsKey(character))
            hashMap.put(character,count);
        else
        {
            int prev = hashMap.get(character);
            hashMap.replace(character,prev+count);
        }

    }
}
