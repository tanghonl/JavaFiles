/*
	������������
	���󣺳����Զ�����1-100֮�������ʹ�ó���³���������Ƕ���
		  ���´�ʱ����ͬ����ʾ��
				�������ʵ����´���
				�������ʵС�����С��
				�������ʵ��ȣ���¶���
	������
		1.��������һ�������1-100֮�����
		2.��Ϊ�޷�Ԥ֪�����ܲ��С���������������������У����ʹ��ѭ������ʱ����whileѭ��
		3.ÿ�ξ�Ҫ����²��ֵ��ʹ�ü���¼��ʵ��
		4.�Ƚ������������ϵͳ���������ݣ���Ҫʹ�÷�֧��䣬����ʹ��if...else if...else��ʽ��
		  ���к���break����
*/
import java.util.Random;
import java.util.Scanner;

public class RandomExample {
	public static void main(String[] args) {
		
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("��������Ҫ�µ�����");
			
			int guessNumber = sc.nextInt();
			
			if(guessNumber > number) {
				System.out.println("��´���");
			}else if(guessNumber < number) {
				System.out.println("���С��");
			}else {
				System.out.println("��ϲ�������");
				break;
			}
		}
		
	}
}