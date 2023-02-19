package Day1;
//triangular pattern

public class ex11 {
	public static void main(String[] args) {
		int N =4 , count = 1;
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
	}
}
