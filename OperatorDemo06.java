/*
	��ϵ�����
*/
public class OperatorDemo06{
	public static void main(String[] args){
		//�������
		int i = 10;
		int j = 20;
		int k = 10;
		
		//==
		System.out.println(i == j);		//false
		System.out.println(i == k);		//true
		System.out.println("------");
		
		//!=
		System.out.println(i != j);		//true
		System.out.println(i != k);		//false
		System.out.println("------");
		
		//>
		System.out.println(i > j);		//false
		System.out.println(i > k);		//false
		System.out.println("------");
		
		//>=
		System.out.println(i >= j);		//false
		System.out.println(i >= k);		//true
		System.out.println("------");
		
		//<
		System.out.println(i < j);		//true
		System.out.println(i < k);		//false
		System.out.println("------");
		
		//<=
		System.out.println(i <= j);		//true
		System.out.println(i <= k);		//true
		System.out.println("------");
		
		//��С�İ�����д��һ����
		System.out.println(i = j);		//20
		//j��ֵ��i �����i
	}
}
/*
	ֻ������ϵ�ж� �����Ϊ���ֵ
	д�Ⱥŵ�ʱ��ǧ��ע�� ��Ҫд�ɸ�ֵ��
*/