package Strings;
/*
* 02-01-23
* Given a sentence in the form of a string, convert it into its equivalent mobile numeric keypad sequence.
*/
public class S6_NumericKeyPadConversion {
    public static String convertSentence(String str)
    {
        String[] util={ "2",    "22",  "222", "3",   "33", "333", "4","44","444", "5",   "55", "555","6",    "66",  "666", "7",   "77", "777","7777", "8",   "88",  "888", "9",  "99","999",  "9999" };
        String word="";
        int position=0;
        for(int i=0;i<str.length();i++)
        {
            position=str.charAt(i)-'A';
            word=word+util[position];
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(convertSentence("HELLOWORLD"));
    }
}
