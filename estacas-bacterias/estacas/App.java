import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class App {

	public static void main(String[] args) throws IOException {
		BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
		String ler = null;
		ler = d.readLine();
		int numInstancias = Integer.parseInt(ler.trim());
		int totalBac = 1;

		for (int tempo = 1; tempo <= numInstancias; tempo++) {
			ler = d.readLine();
			if (ler != null) {
				// System.out.println(fibonnaci(tempo + 1));
				System.out.println(totalBac);
				int fibonnaci = fibonnaci(tempo + 1);
				int qntBacs = Integer.parseInt(ler.trim());
				totalBac += qntBacs;
				totalBac *= fibonnaci;
				// System.out.println(totalBac);
				// totalBac += fibonnaci(totalBac - qntBacs);
				// totalBac += qntBacs;
				// totalBac += qntBacs;
			}
		}
		d.close();
	}

	public static int fibonnaci(int k) {
		return (k == 1 || k == 0) ? 1 : fibonnaci(k - 1) + fibonnaci(k - 2);
	}
}