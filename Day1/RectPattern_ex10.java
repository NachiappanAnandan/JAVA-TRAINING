package Day1;
//rectangular pattern

public class RectPattern_ex10 {
	public static void main(String[] args) {
		int N = 4;
		for(int i=0;i<N;i++) {
			for(int j=1;j<=N;j++) {
				System.out.print(j+(N*i) + " ");
			}
			System.out.println();
		}
	}
}
