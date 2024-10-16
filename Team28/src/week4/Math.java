package week4;

public class Math {

	/* Developer: Aqsa Amjad
	 * University ID: 230066670
	 * Function: This function takes two inputs as integers and returns the sum
     */
	
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /*Developer: Angus kwok
	* University ID: 230049488
	* Function: Min: This function takes two integer as input and returns the minimum one. 
	*/

	public static int min(int num1, int num2){
		if (num2 >= num1){
    		return num1;
		}
		else{
   			return num2;
		}
	}

	/*
 	* Developer: Oyinlola Esther Arowolo
 	* University ID: 230402373
 	* Function: This function takes two integers as inputs and returns the result of subtracting the second integer from the first.
 	*/
	
	public static int sub(int num1, int num2) {
    return num1 - num2;
	}
	
	/* Developer: Vatsal Mehta
	 * University ID: 220408633
	 * Function: This function takes two integer as input, calculate the mod ("%") the first number by second number and returns the result. For example Mod(8,2) should return 0, whereas Mod(7,2) should return 1.
	 */
	
	public static int mod(int a, int b) {
		return a % b;
	}
	
	/* Developer: Aryan Kora
	 * University ID: 230059030
	 * Function: This function outputs the maximum of 2 numbers
     */
	
	public static int max(int x, int y) {
		if (x >= y){
    		return x;
		}
		else{
   			return y;
		}
	}
	
	// This function multiples 2 inputs
	public static int multi(int x, int y){
		return x*y;
	}
	
	// Dividing 2 inputs
	public static int divide(int x, int y) {
		return x/y;
	}
	
	public static int power(int x, int y) {
		int temp = x;
		for (int i = 1; i < y; i++) {
			x = x*temp;
		}
		return x;
	}
	
	public static void main(String args[]) {
		
		System.out.println(max(1,2));    // 2
		System.out.println(min(1,2));    // 1
		System.out.println(add(1,2));    // 3
		System.out.println(sub(2,1));    // 1
		System.out.println(multi(2,2));  // 4
		System.out.println(divide(4,2)); // 2
		System.out.println(power(2,5));  // 32
		System.out.println(mod(10,2));   // 0
		
	}
	

}
