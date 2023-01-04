package Strings;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Strings.StringSorter.sortString;


public class S9_GroupAnagrams {
    public static void GroupAnagrams(String arr[]){
        HashMap<String, List<String>> map=new HashMap<>();
        String word="";
        String sortedword="";
        for (int i = 0; i < arr.length; i++) {
            word=arr[i];
            sortedword=sortString(word);

            if(map.containsKey(sortedword))
            {
                map.get(sortedword).add(word);
            }
            else {
                List<String> words=new ArrayList<>();
                words.add(word);
                map.put(sortedword,words);
            }
        }
        List<List<Strings>> result=new ArrayList<>();
        for (Map.Entry<String,List<Strings>> e:map.entrySet()) {
            result.add(e.getValue());
        }
    }
    public static void main(String[] args) {
        GroupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        //System.out.println(Array.toString(GroupAnagrams(["eat","tea","tan","ate","nat","bat"])));
    }
}
