/*
	if����ʽ2��
	��ʽ��
		if(��ϵ���ʽ){
			�����1;
		}else{
			�����2;
		}
	ִ�����̣�
		1.���ȼ����ϵ���ʽ��ֵ
		2.�����ϵ���ʽֵΪtrue��ִ�������1
		3.�����ϵ���ʽֵΪfalseִ�������2
		4.����ִ�к�������
*/
public class IfDemo02{
	public static void main(String[] args){
		System.out.println("��ʼ");
		
		//������������
		int a = 10;
		int b = 15;
		b = 5;
		
		//�����ж�a�Ƿ����b ����� �ڿ���̨���a����b ������� �ڿ���̨���a��ֵ������b
		if(a > b){
			System.out.println("a����b");
		}else{
			System.out.println("a��ֵ������b");
		}
		
		System.out.println("����");
	}
}