package Strings;
import java.io.*;
import java.util.*;
public class S4_RemoveConsecutiveChar {
    //{ Driver Code Starts
// Initial Template for Java
    
        public static void main(String args[]) throws IOException {
            BufferedReader read =
                    new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(read.readLine());
            while (t-- > 0) {

                String S = read.readLine().trim();

                Solution ob = new Solution();
                String ans = ob.removeConsecutiveCharacter(S);

                System.out.println(ans);
            }
        }
    }

// } Driver Code Ends


//User function Template for Java

    class Solution{
        public String removeConsecutiveCharacter(String S){
            String result=new String();
            int i;
            for(i=1;i<S.length();i++)
            {
                if(S.charAt(i-1)!=S.charAt(i))
                    result=result+S.charAt(i-1);
            }
            result=result+S.charAt(i-1);

            return result;
        }
    }
