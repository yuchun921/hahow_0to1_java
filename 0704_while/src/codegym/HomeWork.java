package codegym;

public class HomeWork {

	public static void main(String[] args) {
		// �߸� = (((220-�~��)-�w�R�߫�)*�j��)+�w�R�߫�
		// �w�R�߫� = 65
		int age = 27;
		int strength = 65;
		int heartRhythm = 65;
		while (strength <= 95) {
			int heartbeat = (int) ((((220 - age) - heartRhythm) * ((float)strength / 100)) + heartRhythm);
			System.out.printf("When strength is %d, heartbeat is %d.\n",strength, heartbeat);
			strength += 5;
		}
	}

}
