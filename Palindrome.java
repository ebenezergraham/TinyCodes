/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinyCode;
import java.util.Scanner;
/**
 *
 * @author Ebenezer Graham
 */

public class Palindrome {
    public static void startPalindrome() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your word for palindrome validation: "); 
        if(reader.hasNextInt()){
             int input=reader.nextInt();
             if (checkPalindromeNumber(input)){
                 System.out.println(input+ " is a number palindrome!");
                }else{
                    System.out.println(input+ " is not a number palindrome!");
                }
        }else if(reader.hasNextLine()){
            String input=reader.nextLine();
        if (checkPalindromeString(input)){
              System.out.println(input+ " is a palindrome!");
        }else{
              System.out.println(input+ " is not a palindrome!");
            }
        }
        System.out.println("\nType YES to try again OR No to discontinue");
        String input = reader.nextLine();
        if(input.equalsIgnoreCase("yes")){
            Palindrome.startPalindrome();
        }else{
            reader.close();
            System.out.close();
        }
    }
    
    public static boolean checkPalindromeString(String original){
        original=original.replaceAll("[^A-Za-z]","");
        char[]reverse=original.toCharArray();
        for(int i=0,x=reverse.length-1;i<reverse.length/2; i++,x--){
            char temp=' ';
            temp=reverse[i];
            reverse[i]=reverse[x];
            reverse[x] = temp;
        }
        return original.equalsIgnoreCase(String.valueOf(reverse));
    }
    //or 
    public static boolean altcheckPalindromeString(String input){
        String newInput =input.replaceAll("[^A-Za-z0-9]", "");
        char[] word = newInput.toLowerCase().toCharArray();int wordLength = word.length-1; 
        for(int i = 0; i<word.length; i++,wordLength--){
            if(word[i]!=(word[wordLength])){
                return false;
            }
        }
        return true;
    }
    
    public static boolean checkPalindromeNumber(int number){
        int reversedNumber=0;
        for(int i = number; i !=0; i /= 10) {
           reversedNumber = reversedNumber * 10 + i % 10;
        }
        return number==reversedNumber;
    }
}

