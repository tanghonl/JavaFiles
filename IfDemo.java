/*
	if����ʽ1��
	��ʽ��
		if(��ϵ���ʽ){
			�����;
		}
	ִ�����̣�
		1.���ȼ����ϵ���ʽ��ֵ
		2.�����ϵ���ʽֵΪtrue��ִ���м������
		3.�����ϵ���ʽֵΪfalse�Ͳ�ִ�������
		4.����ִ�к�������
*/
public class IfDemo{
	public static void main(String[] args){
		System.out.println("��ʼ");
		
		//������������
		int a = 10;
		int b = 15;
		
		//�����ж�a��b��ֵ�Ƿ���� �����ȾͿ���̨��� a����b;
		if(a == b){
			System.out.println("a����b");
		}
		
		int c = 10;		
		//�����ж�a��c��ֵ�Ƿ���� �����ȾͿ���̨��� a����c;
		if(a == c){
			System.out.println("a����c");
		}
		
		System.out.println("����");
	}
}