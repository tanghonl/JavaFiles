/*
	关系运算符
*/
public class OperatorDemo06{
	public static void main(String[] args){
		//定义变量
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
		
		//不小心把两个写成一个了
		System.out.println(i = j);		//20
		//j赋值给i 再输出i
	}
}
/*
	只有做关系判断 结果才为真假值
	写等号的时候千万注意 不要写成赋值号
*/