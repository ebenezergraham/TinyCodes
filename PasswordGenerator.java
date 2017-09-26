/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinyCode;
import java.util.Random;
/**
 *
 * @author Admin
 */
public class PasswordGenerator {
    public static String generateStrongPassword(){
        Random generator = new Random();
        int index = generator.nextInt(3)+12;
        char[] password =new char[index];
        String strongpassword=null;
           for(int j=0; j<index; j++){
           if((j%2!=0 && j%3!=0)&& j==1){
                //numbers = 5,7,11,13
                password[j] = (char)(generator.nextInt(16)+33);
            }else if(j%4==0){
                 //numbers = 12,4,8
                password[j] = (char)(generator.nextInt(10)+48);
            }else if(j%3==0){
                 //numbers = 0,3,6,9
                 password[j] = (char)(generator.nextInt(27)+65);
            }else{
                 //numbers = 1,2,10
                password[j] = (char)(generator.nextInt(27)+97);
            }
        }
         for(int i=0; i<index; i++){
             int swap=generator.nextInt(index);
             char temp=password[i];
             password[i]=password[swap];
             password[swap]=temp;
        }
        return String.valueOf(password);
    }
}
