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
public class TinyCodes {
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
      
        System.out.println("What code do you want to try?\r\n a: Generate a Password \r\n b: Check a Palindrome \r\n c: Run a fibonacci sequence"); 
        Scanner reader = new Scanner(System.in);
        String input=reader.nextLine();
        
        if(input.equalsIgnoreCase("a")){
             System.out.println("Copy and paste new Password: "+PasswordGenerator.generateStrongPassword());
        }else if(input.equalsIgnoreCase("b")){
            Palindrome.startPalindrome();
    }else if(input.equalsIgnoreCase("c")){
            Fibonacci fib = new Fibonacci();
            fib.fibonacci();
    }
}
}
