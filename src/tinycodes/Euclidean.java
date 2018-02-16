/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tinycodes;

import java.util.Scanner;

/**
 *
 * @author Ebenezer Kwesi Akyen Graham
 */
public class Euclidean {
    public static void main (String[] args){
        
        Scanner reader = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the two figures: ");
            a=reader.nextInt();
            b=reader.nextInt();
        System.out.println(euclidean(a, b));
    }

    public static int euclidean(int a, int b){
        if(b==0)return a;
        int r = a % b;
        return euclidean(b,r);
    }
}
