/*
	三元运算符的案例：
		两只老虎
	需求：
		已知动物园里有两只老虎，体重分别为180kg和200kg
		请用程序实现判断两只老虎体重是否相同
	分析：
		1.定义两个变量用于保存老虎的体重 单位kg 这里仅仅体现数值即可
		2.用三元运算符实现体重的判断,相等返回true,不相等返回false	
		3.输出结果
*/

public class OD09_Example{
	public static void main(String[] args){
		//定义体重
		int weight1 = 180;
		int weight2 = 200;
		
		//比较两个体重
		boolean b;
		b = (weight1 == weight2) ? true : false;
		
		//输出结果即可
		System.out.println("结果为:"+b);
	}
}