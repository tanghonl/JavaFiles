/*
	�߼������
*/
public class OperatorDemo07{
	public static void main(String[] args){
		//�������
		int i = 10;
		int j = 20;
		int k = 30;
		
		//�߼���&	������Ϊtrue �����Ϊtrue ��false��false
		System.out.println((i > j) & (i > k));	//false & false = false
		
		System.out.println((i < j) & (i > k));	//true & false =  false
		
		System.out.println((i > j) & (i < k));	//false & true =  false
		
		System.out.println((i < j) & (i < k));	//true & true =  true
		
		System.out.println("--------");
		
		//�߼���|	������Ϊfalseʱ�����Ϊfalse ��true��true
		System.out.println((i > j) | (i > k));	//false | false = false
		
		System.out.println((i < j) | (i > k));	//true | false =  true
		
		System.out.println((i > j) | (i < k));	//false | true =  true
		
		System.out.println((i < j) | (i < k));	//true | true =  true
		
		System.out.println("--------");
		
		//�߼����^ ��ͬΪfalse ��ͬΪtrue
		System.out.println((i > j) ^ (i > k));	//false ^ false = false
		
		System.out.println((i < j) ^ (i > k));	//true ^ false =  true
		
		System.out.println((i > j) ^ (i < k));	//false ^ true =  true
		
		System.out.println((i < j) ^ (i < k));	//true ^ true =  false
		
		System.out.println("--------");
		
		//�߼��ǣ�
		System.out.println((i > j));
		System.out.println(!(i > j));	//!false = true
		System.out.println(!!(i > j));
		System.out.println(!!!(i > j));
	}
}