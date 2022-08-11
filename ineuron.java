package patterns;

public class ineuron {
	/*
	 * ineuron
	 */

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			// Print I
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || j == (n - 1) / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// Print N
			for (int j = 0; j < n; j++) {
				if ((j == 0 || j == n - 1 || i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// Print E
			for (int j = 0; j < n; j++) {
				if ((j == 0 || i == 0 || i == n - 1 || i == (n - 1) / 2)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// Print U
			for (int j = 0; j < n; j++) {
				if ((i == n - 1 && j == n - 1 || (j == 0 && i == n - 1))) {
					System.out.print(" ");
				} else if (j == 0 || j == n - 1 || i == n - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// print R
			for (int j = 0; j < n; j++) {
				if (j == 0 || (i == 0 && j != n - 1) || (i == (n - 1) / 2 && j != (n - 1))
						|| (j == (n - 1) && (i != 0 && i != (n - 1) / 2))) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// Print O
			for (int j = 0; j < n; j++) {
				if ((i == n - 1 && j == n - 1 || (j == 0 && i == n - 1) || (i == 0 && j == 0)
						|| (i == 0 && j == n - 1))) {
					System.out.print(" ");
				} else if (j == 0 || j == n - 1 || i == n - 1 || i == 0) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			// Print N
			for (int j = 0; j < n; j++) {
				if ((j == 0 || j == n - 1 || i == j)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
