/*
	��·�߼������
*/
public class OperatorDemo08{
	public static void main(String[] args){
		//�������
		int i = 10;
		int j = 20;
		int k = 30;
		
		//��·�߼��� &&	��false��false
		System.out.println((i > j) && (i > k));	//false && false = false
		System.out.println((i < j) && (i > k));	//true && false =  false
		System.out.println((i > j) && (i < k));	//false && true =  false
		System.out.println((i < j) && (i < k));	//true && true =  true
		System.out.println("--------");
		
		
		//��·�߼��� || ��true��true
		System.out.println((i > j) || (i > k));	//false || false = false
		System.out.println((i < j) || (i > k));	//true || false =  true
		System.out.println((i > j) || (i < k));	//false || true =  true
		System.out.println((i < j) || (i < k));	//true || true =  true
		System.out.println("--------");
		
		//���߼���& �߼���|������ͬ
		
		//����
		/*
		System.out.println((i++ > 100) & (j++ > 100));	//false & false = false
		System.out.println("i = "+i);	//11
		System.out.println("j = "+j);	//21
		*/
		
		System.out.println((i++ > 100) && (j++ > 100));	//false && false = false
		//i++֮��Ϊfalse	��·��ֻҪ���Ϊfalse�ұ߲�����ʲô�϶�Ϊfalse �����ұ߲�ִ��
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		//ͬ���·�� ������Ϊtrue �ұ�������ʲô��Ϊtrue �����ұ߾Ͳ�ִ��
	}
}