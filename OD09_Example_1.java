/*
	��Ԫ�����������
		��������
	����
		һ��������ס���������У���֪���ǵ���߷ֱ�Ϊ150cm��210cm��165cm��
		���ó����ȡ����������������
	������
		1.���������������ڱ����������е���ߣ���λcm���������������ֵ����
		2.����Ԫ�������ȡǰ�������еĽϸ���ߣ�������ʱ������������
		3.����Ԫ�������ȡ��ʱ��ߺ͵��������е���ߵĽϴ�ֵ�����������߱���
		4.������
*/
public class OD09_Example_1{
	public static void main(String[] args){
		int height1 = 150;
		int height2 = 210;
		int height3 = 162;
		int h1 = (height1 > height2) ? height1 : height2;
		int hmax = (h1 > height3) ? h1 : height3;
		System.out.println("��ߵĺ��е����Ϊ��"+hmax);
	}
}