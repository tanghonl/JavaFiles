/*
	��ֵ�����
*/
public class OperatorDemo04{
	public static void main(String[] args){
		//��10��ֵ��int�ͱ���i
		int i = 10;
		System.out.println("i��"+i);	//�ַ���ƴ�� i:10
		
		//��չ +=
		//��+=��ߺ��ұߵ����ݼӷ����� �����ֵ�����
		i+=20;	
		//i=i+20;	
		System.out.println("i��"+i);
		
		//ע��
		short s = 10;
		s += 20;		//���� 
		System.out.println("s��"+s);
		
		//s = 10;
		//s = s + 20;	//���� �ȼ����� 20Ϊint sΪshort �����Ϊint�� ����ֵ��s��short�� 
		//System.out.println("s��"+s);
		
		//����i+=20;��i=i+20����ȫ��ͬ �����ͬ
		//��ǿ��ת�� ���ַ�������
		s = 10;
		s = (short)(s + 20);	//������
		System.out.println("s��"+s);
		
		//����˵ += ����������ǿ������ת��
		//��չ�����������ǿ������ת��
		//������չ������ľ�����չ�����
	}
}