/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinycodes;

import java.util.ArrayList;

/**
 *
 * @author Ebenezer Graham
 */
public class Market {
    private boolean open = true;
    String name;
    int dailyCustomers=0;
    
    ArrayList <String> promotion = new ArrayList<String>();
    
    public Market (String name){
        this.name=name;      
    }
   
    public static void main (String [] arg){
        Market test = new Market("Pactmart");
        System.out.println("Welcome to "+test.name);
        System.out.println("Your bill is "+ test.checkoutPromo(5));
        System.out.println(test.checkIfDiscount("EgGs"));
    
    }
    
    public boolean getOpen (){
        return this.open;
    }
    
    public void setOpen (boolean open){
        this.open = open;
    }
    
    public void customerVisit (){
        if(getOpen()){
            this.dailyCustomers++;
        }else{
            this.dailyCustomers = 0;
        }
    }
    
    public double checkoutPromo (int numOfCans){
        double amt = 64.75;
        double promo = 100.00;
        int promoItems = numOfCans /3;
        int extraCans = numOfCans % 3;
        
        if(numOfCans < 3){
            return numOfCans * amt;
        }else {
            return  (promoItems * promo) + (extraCans * amt);
        }
    }
    
    public boolean checkIfDiscount(String promoItem){
        this.promotion.add("beans");
        this.promotion.add("eggs");
        this.promotion.add("orange juice");
        this.promotion.add("earphones");
        this.promotion.add("whole rotisserie chicken");
        
        for (String x : this.promotion){
            if(promoItem.equalsIgnoreCase(x)){
                return true;
            }
        }
        return false;
    }
}
