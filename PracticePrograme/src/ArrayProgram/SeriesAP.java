package ArrayProgram;

public class SeriesAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4};
		seriesAP(arr,3);

	}
	public static void seriesAP(int arr[],int n) {
		int d=arr[1]-arr[0];
		int a=arr[0];
	int result =a+(n-1)*d;
	System.out.println(result);
	}

}
