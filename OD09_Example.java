/*
	��Ԫ������İ�����
		��ֻ�ϻ�
	����
		��֪����԰������ֻ�ϻ������طֱ�Ϊ180kg��200kg
		���ó���ʵ���ж���ֻ�ϻ������Ƿ���ͬ
	������
		1.���������������ڱ����ϻ������� ��λkg �������������ֵ����
		2.����Ԫ�����ʵ�����ص��ж�,��ȷ���true,����ȷ���false	
		3.������
*/

public class OD09_Example{
	public static void main(String[] args){
		//��������
		int weight1 = 180;
		int weight2 = 200;
		
		//�Ƚ���������
		boolean b;
		b = (weight1 == weight2) ? true : false;
		
		//����������
		System.out.println("���Ϊ:"+b);
	}
}