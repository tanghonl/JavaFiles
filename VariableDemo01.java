/*
	���������ʽ��
		�������� ������ = ����ֵ;
	�����������ͣ�
		byte,short,int,long,float,double,char,boolean
	
	������ʹ�ã�
		ȡֵ��ʽ��������
		�޸�ֵ�ĸ�ʽ�� ������=����ֵ;
*/
public class VariableDemo01{
	public static void main(String[] args){
		//�������
		int a = 10;
		byte b = 100;
		short c = 19999;
		long d = 99999;
		float e = 13;
		double f = 5.21;
		char g = 'a';
		boolean h = true;
		
		//�������
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println("---------");
		
		//�޸ı���
		a = 20;
		//�ٴ����
		System.out.println(a);
	}
}