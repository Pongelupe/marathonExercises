import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			boolean isImpossible = false;
			int numAlunos = Integer.parseInt(sc.nextLine());
			if (numAlunos % 2 == 0) {
				String line = sc.nextLine();
				String[] strings = line.split(" ");
				ArrayList<Integer> desejos = new ArrayList<Integer>(numAlunos + 1);
				desejos.add(0, -1);
				for (String string : strings)
					desejos.add(Integer.parseInt(string));

				for (Integer i : desejos) {
					if (isFailure(i, desejos)) {
						System.out.println("IMPOSSIBLE");
						isImpossible = true;
						break;
					}

				}
				if (!isImpossible) {
					if (desejos.size() > 3)
						line = inverteMeio(desejos);
					System.out.println(line);
				}
			} else {
				System.out.println("IMPOSSIBLE");
				sc.nextLine();
			}

		}

		sc.close();
	}

	private static String inverteMeio(ArrayList<Integer> desejos) {
		Collections.reverse(desejos);
		Integer fimLista = desejos.get(0);
		Integer inicioLista = desejos.get(desejos.size() - 2);

		desejos.set(0, inicioLista);
		desejos.set(desejos.size() - 2, fimLista);

		StringBuilder sb = new StringBuilder();
		desejos.forEach(i -> sb.append(i != -1 ? i + " " : ""));

		return sb.toString();
	}

	private static boolean isFailure(Integer i, ArrayList<Integer> desejos) {
		return i == desejos.indexOf(i);
	}

}
