package Strings;

public class S1_ValidPalindrome {

//        public static boolean isPalindrome() {
//            String s="A man, a plan, a canal: Panama";
//            int l=s.length();
//
//            String s_copy=new String();
//            int j=0;
//            char c;
//            for(int i=0; i<l;i++)
//            {
//                c=s.charAt(i);
//                if(Character.isLetterOrDigit(c)){
//                    s_copy=s_copy+c;
//                }
//            }
//            s_copy=s_copy.toLowerCase();
//            System.out.println(s_copy.toString());
//            int flag=0;
//            j=s_copy.length()-1;
//
//            for(int i =0; i<j;i++)
//            {
//
//                if(s_copy.charAt(i)!=s_copy.charAt(j))
//                {
//                    flag=1;
//                    break;
//                }
//                j--;
//
//            }
//            if(flag==1)
//                return false;
//            else
//                return true;
//        }
public static boolean isPalindrome(String s) {

    int j=s.length()-1;
    int flag=0;
//    for(int i=0;i<j;i++) {
//        System.out.print(s.charAt(i)+' ');
//        System.out.println(s.charAt(j));
//        if (Character.isLetterOrDigit(s.charAt(i)) ||
//                Character.isLetterOrDigit(s.charAt(j))) {
//            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
//                flag = 1;
//                break;
//            }
//            j--;
//        }
//    }
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

