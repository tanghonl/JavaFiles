/*
	if����ʽ3��
	��ʽ��
		if(��ϵ���ʽ1){
			�����1;
		}else if(��ϵ���ʽ2){
			�����2;
		}
		...
		else{
			�����n+1;
		}
		
	ִ�����̣�
		1.���ȼ����ϵ���ʽ1��ֵ
		2.�����ϵ���ʽֵΪtrue��ִ�������1,false�����ϵ���ʽ2��ֵ
		3.true��ִ�������2��false���������3��ֵ
		4. ...
		5.���û���κα��ʽֵΪtrue ��ִ�������n+1
*/
import java.util.Scanner;
public class IfDemo03{
	public static void main(String[] args){
		System.out.println("��ʼ");
		
		//���󣺼���¼��һ����������1,2,...,7�� �����Ӧ�ģ�����һ�����ڶ���...��������
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������������1-7��");
		int week = sc.nextInt();
		
		if(week == 1){
			System.out.println("����һ");
		}else if(week == 2){
			System.out.println("���ڶ�");
		}else if(week == 3){
			System.out.println("������");
		}else if(week == 4){
			System.out.println("������");
		}else if(week == 5){
			System.out.println("������");
		}else if(week == 6){
			System.out.println("������");
		}else if(week == 7){
			System.out.println("������");
		}else{
			System.out.println("��������ȷ������");
		}
		
		System.out.println("����");
	}
}