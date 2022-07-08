package codegym;

public class HomeWork {
	public static void main(String[] args) {
		// �����ƭ� -96463453, 43713

		int[] nums = { 43713, -96463453 };

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				System.out.println(reverseNums(nums[i]));
			} else if (nums[i] < 0) {
				// �N�t���ন����
				nums[i] = Math.abs(nums[i]);
				// ��JreverseNums��k, �নreverse��char[] array
				char[] cArray = reverseNums(nums[i]);
				// �N char[] array �নString��, �A��^integer
				int number = Integer.parseInt(String.valueOf(cArray));
				// �N integer�ন�t��
				number = Math.negateExact(number);
				// output
				System.out.println(number);
			} else {
				System.out.println(0);
			}
		}

	}

	public static char[] reverseNums(int num) {
		// �Nintger��string
		String s = String.valueOf(num);
		// string�নchar[] array (�r��O�r�����}�C)
		char[] cArray = s.toCharArray();
		// �ŧi�@�ӷs���}�C�A����᪺�r���}�C�|��J�o
		char[] reverseArray = new char[cArray.length];
		// �N�쥻�Ʀr�ϧǩ�JreverseArray
		for (int i = 0; i < cArray.length; i++) {
			int index = cArray.length - i;
			reverseArray[index - 1] = cArray[i];
		}
		return reverseArray;
	}

}
