public class fibonacci
{
    
     
/**
* This method transposes a given matrix
*  
* @author (Ebenezer Graham) 
* @version (1.0)
* @return an integer in the fibonacci sequence
* Constructor for objects of class Fib
*/
    public static int Fib(int n)
    {
        if (n == 0){
            return 0;
        }     
        if (n == 1) {
            return 1;
        }   
        return Fib(n - 1) + Fib(n - 2);
    }
}
