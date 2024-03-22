package com.voya.training;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] twoDimArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int[] row : twoDimArray) {
			for (int col : row)
				System.out.print(col + " ");
			System.out.println();
		}
	}
}
