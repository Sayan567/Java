/*
Given a string S, remove consecutive duplicates from it recursively.

Input Format :
String S
Output Format :
Output string

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string

Sample Input 1 :
aabccba
Sample Output 1 :
abcba

Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz
 */

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "aabccb";
        System.out.println(removeConsecutiveDuplicates(str));
    }

    public static String removeConsecutiveDuplicates(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String smallAns = removeConsecutiveDuplicates(s.substring(1));
        if (s.charAt(0) == smallAns.charAt(0)) {
            return smallAns;
        } else {
            return s.charAt(0) + smallAns;
        }
    }
}