public class VariableDemo02{
	public static void main(String[] args){
		int a = 10;
		System.out.println(a);
		byte b = 100;
		System.out.println(b);
		short c = 19999;
		System.out.println(c);
		//long d = 99999;
		//System.out.println(d);
		//float e = 13;
		//System.out.println(e);
		double f = 5.21;
		System.out.println(f);
		char g = 'a';
		System.out.println(g);
		boolean h = true;
		System.out.println(h);
		
		//long d=12345678900;	//����int���� ����
		//System.out.println(d);		//�����������
		long d=12345678900l;		//��β��l�ñ�����֪����long���͵�
		System.out.println(d);
		
		//float e = 13.14;	//������Ĭ��double����
		//System.out.println(e);	//Ҫ�ڽ�β����f
		
		float e = 13.14f;	
		System.out.println(e);	
	}
}

/*
����ʹ��ע������
	1.main������ �����������ظ�
	2.�������һ����ֵ
	3.��ֹ����long���͵�����̫�� ��β����l������
	4.��ֹ���Ͳ����� ���floatҪ�ڽ�β����f
*/
	