import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (br.ready()) {
			String linha = br.readLine();
			if (!linha.equals("42")) {
				if (linha.length() <= 2)
					System.out.println(linha);
			} else
				break;
		}

	}

}
