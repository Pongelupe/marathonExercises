
/**
 * @author pongelupe
 */
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String[] split = line.split(" ");
			BigInteger x = new BigInteger(split[0]);
			BigInteger y = new BigInteger(split[1]);

			BigInteger coeficienteTerreno = mdc(x, y);
			BigInteger estacas = BigInteger.ZERO;

			if (coeficienteTerreno.equals(BigInteger.ONE)) {
				estacas = calculaEstacas(x, y);
			} else {
				x = x.divide(coeficienteTerreno);
				y = y.divide(coeficienteTerreno);
				estacas = calculaEstacas(x, y);
			}
			System.out.println(estacas);
		}

		sc.close();
	}

	private static BigInteger calculaEstacas(BigInteger x, BigInteger y) {
		BigInteger perimetro = x.add(y).multiply(BigInteger.valueOf(2));
		return perimetro;
	}

	private static BigInteger mdc(BigInteger x, BigInteger y) {
		return x.gcd(y);

	}

}
