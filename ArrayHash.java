

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class ArrayHash {
	public static void main(String[] args) {

		ArrayList<Integer> initial = new ArrayList<>();
		Hashtable<Integer, Integer> hash = new Hashtable();
		ArrayList<Integer> afteradd = new ArrayList<>();
		ArrayList<Integer> sorted = new ArrayList<>();
		ArrayList<Integer> arraykeys = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		initial.add(56);
		initial.add(45);
		initial.add(67);
		initial.add(11);
		initial.add(8);
		for (int i = 0; i < 5; i++) {
			int d, r = 0, tot = 0;
			int n = initial.get(i);
			while (n != 0) {
				d = n % 10;
				tot += d;
				n = n / 10;
			}
			afteradd.add(tot);
			sorted.add(tot);
		}
		Collections.sort(sorted);
		System.out.println(sorted);
		System.out.println(afteradd);
		for (int i = 0; i < sorted.size(); i++) {

			for (int j = 0; j < afteradd.size(); j++) {

				if (sorted.get(i) == afteradd.get(j))
					arraykeys.add(j);
			}

		}
		System.out.println(arraykeys);

		for (int i = 0; i < initial.size(); i++) {

			System.out.print(" " + initial.get(arraykeys.get(i)));

		}

	}
}
