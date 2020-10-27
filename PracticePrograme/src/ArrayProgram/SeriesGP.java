package ArrayProgram;

/*Given the A and R i,e first term and common ratio of a GP series. 
Find the Nth term of the series.*/
public class SeriesGP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		seriesGP(4);

	}

	public static void seriesGP(int N) {

		int a = 2;
		int r = 2;

		int result = a * (int) (Math.pow(r, N - 1));
		System.out.println(result);
	}

}
