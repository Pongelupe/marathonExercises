import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int testCases = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < testCases; i++) {
			String testCase = sc.nextLine();
			int m = Integer.parseInt(testCase.split(" ")[0]);
			int n = Integer.parseInt(testCase.split(" ")[1]);

			for (int j = m; j <= n; j++) {
				if (isPrime(j))
					System.out.println(j);
			}

			System.out.println();
		}

		sc.close();

	}

	private static boolean isPrime(int n) {

		if (n == 1)
			return false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
