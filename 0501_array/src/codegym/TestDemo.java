package codegym;

import java.util.Arrays;

public class TestDemo {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };

		System.out.println(nums[2]);

		// Array is object
		// 可以指定長度
		int[] nums1 = new int[3];

		// 超過的話會噴exception
		nums1[0] = 2;
		nums1[1] = 4;
		nums1[2] = 6;

		/* 多維陣列 [行][列] */
		int[][] numnum = new int[3][2];
		numnum[0][0] = 1;
		numnum[0][1] = 2;

		numnum[1][0] = 3;
		numnum[1][1] = 4;

		numnum[2][0] = 5;
		numnum[2][1] = 6;

		// 一開始就給初始值
		int[][] numnum1 = { { 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
		System.out.println(numnum1[2][0]);

		/* Array copy */
		// Arrays.copyOf(resourceArray, resourceLength)
		System.out.println("=== Array copy example ===");
		System.out.println("== Wrong example ==");
		int[] t1 = { 1, 2 };
		int[] t2 = t1;
		System.out.println("Origin t1[1] = " + t1[1]);
		System.out.println("Origin t2[1] = " + t2[1]);

		t2[1] = 3;
		System.out.println("** Update t2[1] = 3 **");

		System.out.println("[Note] t1, t2 指向同個實體物件, 所以修改t2時, 連帶影響指向同個物件的t1");
		System.out.println("t1[1] = " + t1[1]);
		System.out.println("t2[1] = " + t2[1]);

		System.out.println();
		System.out.println("== Correct example ==");
		int[] a1 = { 1, 2 };
		int[] a2 = Arrays.copyOf(a1, 2);
		System.out.println("Origin a[1] = " + a1[1]);
		System.out.println("Origin a2[1] = " + a2[1]);

		a2[1] = 3;
		System.out.println("** Update a2[1] = 3 **");
		System.out.println("a1[1] = " + a1[1]);
		System.out.println("a2[1] = " + a2[1]);

		System.out.println();
		System.out.println();

	}
}
