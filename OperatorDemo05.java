/*	
	�����Լ������
*/
public class OperatorDemo05{
	public static void main(String[] args){
		//�������
		int i = 10;
		System.out.println("i="+i);
		
		/*
		//����ʹ�� ���۷�ǰ�߻��Ƿź�߶����� ���������ͬ��
		i++;		//��i��1
		System.out.println("i="+i);
		++i;		//Ҳ����
		System.out.println("i="+i);
		*/
		
		
		//�������ʹ��
		/*
		int j=i++;	//++���ڱ������ʱ �ȸ�ֵ�ټ�һ
		System.out.println("j="+j);
		System.out.println("i="+i);
		*/
		/*
		int j=++i;	//++���ڱ���ǰ��ʱ �ȼ�һ�ٸ�ֵ
		System.out.println("j="+j);
		System.out.println("i="+i);
		*/
		
		i--;		
		System.out.println("i="+i);
		--i;		
		System.out.println("i="+i);
		
		int j=i--;	
		System.out.println("j="+j);
		System.out.println("i="+i);
		
		int a=--i;	
		System.out.println("a="+a);
		System.out.println("i="+i);
	}
}