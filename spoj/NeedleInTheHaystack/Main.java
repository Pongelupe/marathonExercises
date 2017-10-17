import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNextLine()) {
			int needleLength = Integer.parseInt(sc.nextLine());
			String needle = sc.nextLine();
			String haystack = sc.nextLine();

			findHits(needleLength, haystack, needle);
		}

		sc.close();
	}

	static void findHits(int needleLength, String haystack, String needle) {
		boolean hasHits = false;
		for (int i = 0; i <= haystack.length() - needleLength; i++) {
			String sample = haystack.substring(i, i + needleLength);
			if (sample.equals(needle)) {
				System.out.println(i);
				hasHits = true;
			}
		}
		if (!hasHits)
			System.out.println("\n");
	}

}
