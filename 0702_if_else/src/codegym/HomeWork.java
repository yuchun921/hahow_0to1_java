package codegym;

public class HomeWork {
	public static void main(String[] args) {
		// �����ƭ� -96463453, 43713
		int num1 = 43713;
		System.out.println(reverseNums(num1));

		int num2 = -96463453;

		if (num2 > 0) {
			System.out.println(reverseNums(num2));
		} else if (num2 < 0) {
			// �N�t���ন����
			num2 = Math.abs(num2);
			// ��JreverseNums��k, �নreverse��char[] array
			char[] cArray = reverseNums(num2);
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
