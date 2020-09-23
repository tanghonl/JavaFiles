/*
	算数运算符
*/
public class OperatorDemo01{
	public static void main(String[] args){
		//定义两个变量
		int a = 6;
		int b = 4;
		//进行算数运算
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		//除法得到的是商，取余得到的是余数
		//整数相除只能得到整数，要想得到小数，必须有浮点数参与
		System.out.println(6.0 / 4);		//此处得到小数
	}
}