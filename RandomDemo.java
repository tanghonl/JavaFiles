/*
	Random
	���ã�����һ�������
	
	ʹ�ò��裺
	1.������
		import java.util.Random;
	2.��������
		Random r = new Random;	����r�Ǳ��������ɸ���
	3.�����������
		int number = r.nextInt(10);	����number��10�ǿ��Ը��ĵ�
									10����0��10֮�� ���а���0������10
*/
import java.util.Random;	//����

public class RandomDemo {
	public static void main(String[] args) {
		//��������
		Random r = new Random();
		
		//��ѭ����ȡ10�������
		for(int i=0; i<10; i++) {
			//�����������
			int number = r.nextInt(10);
			//��������
			System.out.println(number);
		}
		
		//���󣺻�ȡһ��1-100֮��������
		int x = r.nextInt(100) + 1;	//��ȡ0-99֮����������+1
		System.out.println(x);
	}
}