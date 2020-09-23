/*
	if语句格式1：
	格式：
		if(关系表达式){
			语句体;
		}
	执行流程：
		1.首先计算关系表达式的值
		2.如果关系表达式值为true就执行中间语句体
		3.如果关系表达式值为false就不执行语句体
		4.继续执行后面的语句
*/
public class IfDemo{
	public static void main(String[] args){
		System.out.println("开始");
		
		//定义两个变量
		int a = 10;
		int b = 15;
		
		//需求：判断a和b的值是否相等 如果相等就控制台输出 a等于b;
		if(a == b){
			System.out.println("a等于b");
		}
		
		int c = 10;		
		//需求：判断a和c的值是否相等 如果相等就控制台输出 a等于c;
		if(a == c){
			System.out.println("a等于c");
		}
		
		System.out.println("结束");
	}
}