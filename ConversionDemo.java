/*
	����ת��
*/
public class ConversionDemo{
	public static void main(String[] args){
		//�Զ�����ת��
		double d = 10;		//int��ֵ��double  int�Զ�ת����double ���10.0
		System.out.println(d);
		
		byte b = 10;
		short s = b;		//byte��ֵ��short	û����
		int i = b;			//byte��ֵ��int		û����
		//char c = b;			//byte��ֵ��char	���Ͳ����� ������
		
		//ǿ����������ת��
		//int k = 88.88;		//��ʱ���벻ͨ�� ���Ͳ�����
		int k = (int)88.88;		//��ʱ������
		System.out.println(k);	//ֵΪ88		���ݶ�ʧ ������������
	}
}