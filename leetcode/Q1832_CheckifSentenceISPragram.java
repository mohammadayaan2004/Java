/*
https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
 
Given an integer number n, return the difference between the product of its digits and the sum of its digits.
Example 1:

Input: n = 234
Output: 15 
Explanation: 
Product of digits = 2 * 3 * 4 = 24 
Sum of digits = 2 + 3 + 4 = 9 
Result = 24 - 9 = 15
Example 2:

Input: n = 4421
Output: 21
Explanation: 
Product of digits = 4 * 4 * 2 * 1 = 32 
Sum of digits = 4 + 4 + 2 + 1 = 11 
Result = 32 - 11 = 21
 */
package leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Q1832_CheckifSentenceISPragram{
    public static boolean checkIfPangram(String s) {
        Set<Character> set =new HashSet<>();
        for(int i=1;i<=s.length();i++)
        {
            set.add(s.charAt(i));
        }
        return set.size()==26;
    }
    public static void main(String[] args) {
        System.out.print("Enter Number :- ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        if(checkIfPangram(n)){
            System.out.println("Is a pragram");
        }
        else{
            System.out.println("Is not a pragram");

        }
        sc.close();
    }
}