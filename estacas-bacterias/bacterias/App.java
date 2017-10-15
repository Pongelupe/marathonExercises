import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class App {

	public static void main(String[] args) throws IOException {
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String ler = null;
		ler = d.readLine();
		BigInteger numInstancias = new BigInteger(ler.trim());

		for (int i = 1; i <= numInstancias.longValue(); i++) {
			ler = d.readLine();
			if (ler != null) {
				String fibonnaci = fib(new BigInteger(ler.trim()).add(BigInteger.ONE)).toString();
				if (fibonnaci.length() > 3)
					System.out.println(fibonnaci.substring(fibonnaci.length() - 3));
				else if (fibonnaci.length() == 2)
					System.out.println("0" + fibonnaci);
				else if (fibonnaci.length() == 1)
					System.out.println("00" + fibonnaci);
				else
					System.out.println(fibonnaci);

			}
		}
		d.close();
	}

	public static BigInteger fib(BigInteger n) {
		n.add(BigInteger.ONE);
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(1);
		for (int j = 2; j <= n.longValue(); j++) {
			c = a.add(b);
			a = b;
			b = c;
		}

		return (a);
	}

}
