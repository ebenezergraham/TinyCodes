public class fibonacci
{
    /**
     * Constructor for objects of class Fib
		@return an integer in the fibonacci sequence
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