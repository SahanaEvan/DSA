package Strings;
/*
* 02-01-23
* Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
 */
public class S5_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1 || strs[0].equals(""))return strs[0];
        int j=0;
        int i=1;
        int flag=0;
        String word="";
        while(j<strs[0].length())
        {
            i=1;
            while(i<strs.length)
            {
                if(strs[i].length()>j && strs[i].charAt(j)==strs[0].charAt(j))
                {
                    flag=1;
                    i++;
                }
                else {flag=0;break;}

            }
            if(flag==1)
            {
                word=word+strs[0].charAt(j);

            }
            else break;
            j++;

        }
        return word;

    }
}
