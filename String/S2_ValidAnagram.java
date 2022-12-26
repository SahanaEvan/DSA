package Strings;

public class S2_ValidAnagram {
    public static boolean isAnagram(String s,String t)
    {
        System.out.println(StringSorter.sortString(s));
        System.out.println(StringSorter.sortString(t));
         if(StringSorter.sortString(s).equals(StringSorter.sortString(t)))

             return true;
         else
             return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
