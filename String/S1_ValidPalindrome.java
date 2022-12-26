package Strings;

public class S1_ValidPalindrome {

public static boolean isPalindrome(String s) {

    int j=s.length()-1;
    int flag=0;

        int p=0;
        int q=s.length()-1;
        while(p<q)
        {
            if (!Character.isLetterOrDigit(s.charAt(p))){
                p++;continue;}
            if (!Character.isLetterOrDigit(s.charAt(q))){
                q--;continue;}
            if (Character.isLetterOrDigit(s.charAt(p)) &&
                    Character.isLetterOrDigit(s.charAt(q)))
            {
                if (Character.toLowerCase(s.charAt(p)) != Character.toLowerCase(s.charAt(q))) {
                    flag = 1;
                    break;
                }
                p++;
                q--;
            }

        }
        if(flag==1)
            return false;
        else
            return true;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}

