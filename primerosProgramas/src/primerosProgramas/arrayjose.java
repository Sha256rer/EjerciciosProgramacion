package primerosProgramas;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayjose {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int number = Integer.valueOf(scanner.nextLine());
			if (number == 0) {
				break;
			}
			list.add(number);
		}

		int mayor = list.get(0);
		for (Integer i : list) {

			if (i > mayor) {
				mayor = i;
			}
		}
		System.out.println(mayor);
	}
}