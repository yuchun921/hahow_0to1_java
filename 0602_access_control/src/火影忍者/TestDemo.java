package ���v�Ԫ�;
import �����.�F�H��;
import �����.�N��;
public class TestDemo {
	public static void main(String[] args) {
		
		/* Access control
		 * - private:
		 * 		�P�@��class
		 * - default:
		 * 		�P�@��class and package, ��Lclass�i�ϥΨ��ݩʩM��k
		 * - protected:
		 * 		�򥻤W����Ω��Lpackage
		 * 		���Y��Lpackage����class���~��protected��class����, �N�i�H�ϥ�
		 * 		// �P�@��class and package, ���P�M��l���O
		 * - public:
		 * 		���i�H�ϥ�
		 */
		
		�]���� son1 = new �]����();
		����ù son2 = new ����ù();
		�F�H�� student1 = new �F�H��();
		
		System.out.println("�]�������ޯ�: " + son1.skill);
		System.out.println("����ù���ޯ�: " + son2.skill);
		System.out.println("�F�H�����ޯ�: " + student1.skill);
		
		// hw
		
		��H friend = new ��H();
		�N�� student2 = new �N��();
		System.out.println("��H���ޯ�: " + friend.skill);
		System.out.println("�N�����ޯ�: " + student2.skill);
		
	}
}
