/*
	�����������������棺
		�����Լ������������е���ߣ������ߵĺ���
		������1.���δ֪�����ü���¼�롣���ȵ�����Ȼ�󴴽�����
			  2.����������ߣ��ֱ�ֵ����������
			  3.����Ԫ�������ȡǰ�������нϸ���ߣ�������ʱ��������
			  4.����Ԫ�������ȡ��ʱ�����͵��������еĽϸ����
			  5.������
*/
import java.util.Scanner;		//����

public class OD09_Example_new{
	public static void main(String[] args){
		//��������
		Scanner sc = new Scanner(System.in);
		
		//������ֵ
		System.out.println("�������һ�����е���ߣ�");
		int height1 = sc.nextInt();	
		System.out.println("������ڶ������е���ߣ�");		
		int height2 = sc.nextInt();
		System.out.println("��������������е���ߣ�");
		int height3 = sc.nextInt();
		
		//�Ƚ����
		int tempHeight;
		tempHeight = (height1 > height2) ? height1 : height2;
		int maxHeight;
		maxHeight = (tempHeight > height3) ? tempHeight : height3;
		
		//������
		System.out.println("��ߵĺ��е����Ϊ��"+maxHeight + "cm");
	}
}