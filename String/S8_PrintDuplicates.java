package Strings;
import java.util.*;
public class S8_PrintDuplicates {
    public static void main(String[] args) {
        printDuplicates("geeksforgeeks");
    }

    private static void printDuplicates(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),0);
        }
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
        }
        for (Map.Entry<Character,Integer> e :map.entrySet()){
            if(e.getValue()>1)
                System.out.println(e.getKey()+",count="+e.getValue());
        }

    }
}
