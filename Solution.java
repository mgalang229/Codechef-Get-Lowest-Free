import java.util.Arrays;
import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] a = new int[3];
			for (int i = 0; i < 3; i++) {
				a[i] = fs.nextInt();
			}
			Arrays.sort(a);
			System.out.println(a[1] + a[2]);
		}
		fs.close();
	}
}
