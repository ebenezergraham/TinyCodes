/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.ebenezergraham.tinycode.java;


import java.util.Scanner;

/**
 *
 * @author Ebenezer Kwesi Akyen Graham
 */
public class Euclidean {

    public static int euclidean(int a, int b){
        if(b==0)return a;
        int r = a % b;
        return euclidean(b,r);
    }
}
