package codegym;

public class HomeWork {
	public static void main(String[] args) {
		// 倒轉整數值 -96463453, 43713

		int[] nums = { 43713, -96463453 };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				System.out.println(reverseNums(nums[i]));
			} else if (nums[i] < 0) {
				// 將負數轉成正數
				nums[i] = Math.abs(nums[i]);
				// 丟入reverseNums方法, 轉成reverse的char[] array
				char[] cArray = reverseNums(nums[i]);
				// 將 char[] array 轉成String後, 再轉回integer
				int number = Integer.parseInt(String.valueOf(cArray));
				// 將 integer轉成負數
				number = Math.negateExact(number);
				// output
				System.out.println(number);
			} else {
				System.out.println(0);
			}
		}

	}

	public static char[] reverseNums(int num) {
		// 將intger轉string
		String s = String.valueOf(num);
		// string轉成char[] array (字串是字元的陣列)
		char[] cArray = s.toCharArray();
		// 宣告一個新的陣列，反轉後的字元陣列會放入這
		char[] reverseArray = new char[cArray.length];
		// 將原本數字反序放入reverseArray
		for (int i = 0; i < cArray.length; i++) {
			int index = cArray.length - i;
			reverseArray[index - 1] = cArray[i];
		}
		return reverseArray;
	}

}
