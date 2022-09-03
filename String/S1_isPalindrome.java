package String;

public class S1_isPalindrome {
    static void is_palin(String s){
        StringBuilder sb=new StringBuilder();
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb);
        int start=0;
        int end=sb.length()-1;
        while(start<end){
            if(sb.charAt(start)!=sb.charAt(end))
            {
                System.out.println("Not palindrome");
                return;
            }
            start++;
            end--;
        }

        System.out.println("Palindrome");
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        is_palin(s);
    }
}
