/*
	�ַ��ġ�+������
*/
public class OperatorDemo02{
	public static void main(String[] args){
		//������������
		int i = 10;
		char c = 'A';		//�ɴ�֪��'A'��ֵΪ65	
		System.out.println(i + c);
		c = 'a';
		System.out.println(i + c);		//�ɴ�֪����a����ֵΪ97
		c = '0';		//�ɴ�֪����0����ֵΪ48
		System.out.println(i + c);
		//�ɴ�֪���ַ��ǿ��Ժ�int�������ӷ���
		
		//��i+c��һ����������
		//Ҫô��int���գ�Ҫô��char����
		//char ch = i + c;		//����ʧ�ܣ����Ͳ����� ���ͻ��Զ�����
		int in = i + c;			//����ɹ�
		System.out.println(in);
		//int k = 10 + 13.14;		//����ʧ�ܣ��ȼ�������double
		double k = 10 + 13.14;		//����ɹ�
		System.out.println(k);
	}
}