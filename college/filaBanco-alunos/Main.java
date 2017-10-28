import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	private static final int DIVISOR = 1000000009;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BigInteger tam = BigInteger.valueOf(Long.MAX_VALUE);

		while (tam.longValue() > 0) {
			tam = new BigInteger(sc.nextLine());
			if (!tam.equals(BigInteger.ZERO)) {
				BigInteger fatorial = fatorial(tam.longValue());
				BigInteger permutacao = fatorial.divide(BigInteger.valueOf(6));
				System.out.println(permutacao.divideAndRemainder(BigInteger.valueOf(DIVISOR))[1]);
			}
		}

		sc.close();

	}

	static BigInteger fatorial(long n) {
		return (n == 1 || n == 0) ? BigInteger.ONE : fatorial(n - 1).multiply(BigInteger.valueOf(n));
	}

}
