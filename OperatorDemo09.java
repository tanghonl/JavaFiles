/*
	三元运算符
	格式：
		关系表达式 ? 表达式1 : 表达式2;
	范例：
		a > b ? a : b;
	执行流程：
		首先执行关系表达式的值
		如果值为true 表达式1的值就是运算结果
		如果值为false 表达式2的值就是结果
*/
public class OperatorDemo09{
	public static void main(String[] args){
		//定义两个变量
		int a = 10;
		int b = 20;
		
		//定义另一个同类型变量接收结果
		//运算	获取a b两个数据中较大的那个值
		int max = a > b ? a : b;
		//输出结果
		System.out.println("max = "+max);
	}
}