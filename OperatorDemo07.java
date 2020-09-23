/*
	逻辑运算符
*/
public class OperatorDemo07{
	public static void main(String[] args){
		//定义变量
		int i = 10;
		int j = 20;
		int k = 30;
		
		//逻辑与&	两个都为true 结果才为true 有false则false
		System.out.println((i > j) & (i > k));	//false & false = false
		
		System.out.println((i < j) & (i > k));	//true & false =  false
		
		System.out.println((i > j) & (i < k));	//false & true =  false
		
		System.out.println((i < j) & (i < k));	//true & true =  true
		
		System.out.println("--------");
		
		//逻辑或|	两个都为false时结果才为false 有true则true
		System.out.println((i > j) | (i > k));	//false | false = false
		
		System.out.println((i < j) | (i > k));	//true | false =  true
		
		System.out.println((i > j) | (i < k));	//false | true =  true
		
		System.out.println((i < j) | (i < k));	//true | true =  true
		
		System.out.println("--------");
		
		//逻辑异或^ 相同为false 不同为true
		System.out.println((i > j) ^ (i > k));	//false ^ false = false
		
		System.out.println((i < j) ^ (i > k));	//true ^ false =  true
		
		System.out.println((i > j) ^ (i < k));	//false ^ true =  true
		
		System.out.println((i < j) ^ (i < k));	//true ^ true =  false
		
		System.out.println("--------");
		
		//逻辑非！
		System.out.println((i > j));
		System.out.println(!(i > j));	//!false = true
		System.out.println(!!(i > j));
		System.out.println(!!!(i > j));
	}
}