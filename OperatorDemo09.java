/*
	��Ԫ�����
	��ʽ��
		��ϵ���ʽ ? ���ʽ1 : ���ʽ2;
	������
		a > b ? a : b;
	ִ�����̣�
		����ִ�й�ϵ���ʽ��ֵ
		���ֵΪtrue ���ʽ1��ֵ����������
		���ֵΪfalse ���ʽ2��ֵ���ǽ��
*/
public class OperatorDemo09{
	public static void main(String[] args){
		//������������
		int a = 10;
		int b = 20;
		
		//������һ��ͬ���ͱ������ս��
		//����	��ȡa b���������нϴ���Ǹ�ֵ
		int max = a > b ? a : b;
		//������
		System.out.println("max = "+max);
	}
}