package Strings;

import java.util.Arrays;

public class StringSorter {
    public static String sortString(String s) {
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
