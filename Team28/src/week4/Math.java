package week4;

public class Math {

    /* Developer: Aqsa Amjad
	 * University ID: 230066670
	 * Function: This function takes two inputs as integers and returns the sum
     */
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    /*Developer: Angus kwok
	* University ID: 230049488
	* Function: Min: This function takes two integer as input and returns the minimum one. 
	*/

	public int Min(int num1, int num2){
    		if (num2 >= num1){
        		return num1;
    		}else{
       			return num2;
    		}
	}

	/********************************
 	* Developer: Oyinlola Esther Arowolo
 	* University ID: 230402373
 	* Function: This function takes two integers as inputs and returns the result of subtracting the second integer from the first.
 	********************************/
	public int sub(int num1, int num2) {
    return num1 - num2;
	}
	
	/* Developer: Vatsal Mehta
	 * University ID: 220408633
	 * Function: This function takes two integer as input, calculate the mod ("%") the first number by second number and returns the result. For example Mod(8,2) should return 0, whereas Mod(7,2) should return 1.
	 */
	public int Mod(int a, int b) {
		return a % b;
	}

}
