/*
	switch��䣺
	��ʽ��
		switch(���ʽ){
			case ֵ1:
				�����1;
				break;
			case ֵ2:
				�����2;
				break;
			......
			default:
				�����n+1
				[break;]
		}
*/
import java.util.Scanner;

public class SwitchDemo{
	public static void main(String[] args){
		System.out.println("��ʼ");
		
		//���󣺼�������һ����������1-7�������Ӧ������һ�����ڶ���...
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����������1-7����");
		int week = sc.nextInt();
		switch(week){
			case 1:
				System.out.println("����һ");
				break;
			case 2:
				System.out.println("���ڶ�");
				break;
			case 3:
				System.out.println("������");
				break;
			case 4:
				System.out.println("������");
				break;
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("������");
				break;
			case 7:
				System.out.println("������");
				break;
			default:
				System.out.println("��������ȷ����������");
				break;
		}
		System.out.println("����");
	}
}