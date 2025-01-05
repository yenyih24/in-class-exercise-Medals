/**
 * File name: Medals.java
 * 
 * @author Yen-Yi Hsu 041117561. Course: CST8284. Assignment: Lab2 Exercise.
 *         Date:2024 Sep 20 Professor: Gustavo Adami. Purpose:This program
 *         prints a table of medal winner counts with row totals.
 */

public class Medals {
	public static void main(String[] args) {
		final int COUNTRIES = 8;
		final int MEDALS = 3;

		String[] countries = { "Canada", "Italy", "Germany", "Japan", "Kazakhstan", "Russia", "South Korea",
				"United States" };

		int[][] counts = { { 0, 3, 0 }, { 0, 0, 1 }, { 0, 0, 1 }, { 1, 0, 0 }, { 0, 0, 1 }, { 3, 1, 1 }, { 0, 1, 0 },
				{ 1, 0, 1 } };

		int[] cTotal = new int[3];

		System.out.println("        Country    Gold  Silver  Bronze   Total");

		// Print countries, counts, and row totals
		for (int i = 0; i < COUNTRIES; i++) {
			// Process the ith row
			// TO DO: Use printf() to print country name as a field of 15 bytes as a String
			// value:
			System.out.printf("%15s", countries[i]);

			int total = 0;

			// Print each row element and update the row total
			for (int j = 0; j < MEDALS; j++) {
				System.out.printf("%8d", counts[i][j]);

				// To DO: calculate the total for each row
				total = total + counts[i][j];

				cTotal[j] += counts[i][j];
			}

			// Display the row total and print a new line
			// To Do: use printf() to print total for each row as a field of size 8 and
			// numeric data type. Include newline after printing each value
			System.out.printf("%8d\n", total);

		}
		System.out.printf("%15s", "");

		// Extra - To DO: define an array of size 3 to hold the total for each column.
		// Modify the above code to keep total for each medal type, and then use a for
		// loop to print total line below
		for (int j = 0; j < MEDALS; j++)
			System.out.printf("%8d", cTotal[j]);

	}
}
