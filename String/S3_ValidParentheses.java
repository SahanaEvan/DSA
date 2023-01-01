package Strings;

import java.util.Stack;

/*
01-01-23 Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
**/
public class S3_ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        char in=' ';
        char out=' ';
        int flag=0;
        for(int i=0;i<s.length();i++)
        {
            in=s.charAt(i);
            if(in=='(' || in=='{' || in=='[')
            {
                stack.push(in);
            }

            if(in==')' || in=='}' || in==']')
            {
                if(!stack.empty())
                {
                    out=stack.pop();
                    if((in==')' && out!='(') || (in=='}' && out!='{') || (in==']' && out!='['))
                    {
                        flag=1;
                        break;
                    }
                }
                else
                {
                    flag=1;
                    break;
                }
            }

        }

        if(!stack.empty() || flag==1)return false;
        else return true;
    }


    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}

/*
My brute force approach
* import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        char in=' ';
        char out=' ';
        int flag=1;
        for(int i=0;i<s.length();i++)
        {
            in=s.charAt(i);
            if(in=='(' || in=='{' || in=='[')
            {
                stack.push(in);
            }

            if(in==')' || in=='}' || in==']')
            {
                if(!stack.empty())
                {
                     out=stack.pop();

                if((in==')' && out=='(') || (in=='}' && out=='{') || (in==']' && out=='[') )
                {
                    flag=0;
                    continue;
                }
                else
                {
                    flag=1;
                    break;
                }
                }
                else
                {
                    flag=1;
                    break;
                }

            }
            else {
                flag=1;
            }


        }

        if(!stack.empty() || flag==1)return false;
        else return true;
    }
}*/
