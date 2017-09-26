
/**
 * This method transposes a given matrix
 * 
 * @author (Ebenezer Graham) 
 * @version (1.0)
 */
public class Matrix
{
    /**
    *
    *@param multidimensional array with a set of elements
    *@return multidimensional array of the transposed matrix
    */
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
