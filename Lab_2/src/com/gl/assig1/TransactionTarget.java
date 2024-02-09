package com.gl.assig1;

import java.util.Scanner;

public class TransactionTarget {

	static int dayAchieved;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int noOfDays = sc.nextInt();

		int revenue[] = new int[noOfDays];
		System.out.println("Enter the values of array");
		for (int i = 0; i < revenue.length; i++) {
			revenue[i] = sc.nextInt();
		}

		System.out.println("Enter the total number of targets that need to be achieved");
		int totaltargets = sc.nextInt();

		for (int i = 1; i <= totaltargets; i++) {

			System.out.println("Enter value of target " + i);
			int target = sc.nextInt();

			if (targetAcheived(revenue, target))
				System.out.println("Target achieved after " + dayAchieved+" transactions");
			else
				System.out.println("Target not achieved");

		}

	}

	private static boolean targetAcheived(int[] revenue, int target) {
		int sum = 0;
		boolean flag = false;
		for (int d = 0; d < revenue.length; d++) {
			sum += revenue[d];
			if (sum >= target) {
				dayAchieved = d + 1;
				flag = true;
				break;
			}
		}
		return flag;
	}

}
