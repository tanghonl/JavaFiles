/*
	switch�����������ﶬ
	����һ����12���·ݣ��ֱ����ڴ����ﶬ�ĸ����ڣ�����¼��һ���·֣��ж������ĸ����ڲ����
		����3 4 5
		�ģ�6 7 8
		�9 10 11
		����12 1 2
	������
		1.����¼���·�ʹ��һ����������
		2.�����жϣ�ʹ��switch����
		3.��ÿ�������������
		
*/
import java.util.Scanner;

public class SwitchExample{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���·ݣ�1-12����");
		int month = sc.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("����");	//������case��͸
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("��������ȷ���·ݣ�");
				//break;	//�˴�����ʡ��
		}
	}
}