/*
	�����������һ�����������ó����жϸ������Ǽ�������ż�������ڿ���̨���������ż��
	
	����:
		1.Ϊ�������������һ�����ݣ����ü���¼������
			¼�����ݣ�
				����
				��������
				��������
		2.�ж���ż�� ʹ��if else�ṹ
		3.�ж��Ƿ���ż����Ҫ��ȡ������ num%2 == 0;
		4.�����ж����������̨�����Ӧ������
*/
import java.util.Scanner;

public class IfExample{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ��������");
		int num = sc.nextInt();
		
		if(num % 2 == 0){
			System.out.println(num + "��ż��");
		}else{
			System.out.println(num + "������");
		}
	}
}