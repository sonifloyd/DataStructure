/*Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}*/

/*Following are steps.
1) Store last element in a variable say x.
2) Shift all elements one position ahead.
3) Replace first element of array with x.
*/
package ArrayProgram;

public class CyclicallyRotationArray {
	public static void main(String[] args) {

		int arr[] =  { 1, 2, 3, 4, 5 };

		int x = arr[arr.length - 1], i;
		for (i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
			
		}
		arr[0] = x;
		
		for (int c : arr) {
			System.out.println(c + "....");
		}
	}
}
