/*
	字符的‘+’操作
*/
public class OperatorDemo02{
	public static void main(String[] args){
		//定义两个变量
		int i = 10;
		char c = 'A';		//由此知道'A'的值为65	
		System.out.println(i + c);
		c = 'a';
		System.out.println(i + c);		//由此知道‘a’的值为97
		c = '0';		//由此知道‘0’的值为48
		System.out.println(i + c);
		//由此知道字符是可以和int类型做加法的
		
		//将i+c用一个变量接收
		//要么用int接收，要么用char接收
		//char ch = i + c;		//编译失败，类型不兼容 类型会自动提升
		int in = i + c;			//编译成功
		System.out.println(in);
		//int k = 10 + 13.14;		//编译失败，等级提升到double
		double k = 10 + 13.14;		//编译成功
		System.out.println(k);
	}
}