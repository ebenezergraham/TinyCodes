
/**
 * Write a description of class Matrix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matrix
{
    // instance variables - replace the example below with your own
    public static int [] [] MatrixTranspose ( int [] [] A  ){
		int [] [] TransposedMatrix = new int [ A.length ] [ A[0].length ];
		for ( int a = 0 ; a < A[0].length ; a++ ){
			for ( int b = 0 ; b < A.length ; b++ ){
			        int temp = A [ a ] [ b ];
				A [ a ] [ b ] = A [ b ] [ a ];
				A [ b ] [ a ] = temp;
			}
		}
		return TransposedMatrix;
	}

  
}
