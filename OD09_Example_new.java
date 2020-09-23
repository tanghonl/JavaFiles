/*
	案例三个和尚升级版：
		需求：自己输入三个和尚的身高，算出最高的和尚
		分析：1.身高未知，采用键盘录入。首先导包，然后创建对象。
			  2.键盘输入身高，分别赋值给三个对象
			  3.用三元运算符获取前两个和尚较高身高，并用临时变量保存
			  4.用三元运算符获取临时变量和第三个和尚的较高身高
			  5.输出结果
*/
import java.util.Scanner;		//导包

public class OD09_Example_new{
	public static void main(String[] args){
		//创建对象
		Scanner sc = new Scanner(System.in);
		
		//变量赋值
		System.out.println("请输入第一个和尚的身高：");
		int height1 = sc.nextInt();	
		System.out.println("请输入第二个和尚的身高：");		
		int height2 = sc.nextInt();
		System.out.println("请输入第三个和尚的身高：");
		int height3 = sc.nextInt();
		
		//比较身高
		int tempHeight;
		tempHeight = (height1 > height2) ? height1 : height2;
		int maxHeight;
		maxHeight = (tempHeight > height3) ? tempHeight : height3;
		
		//输出身高
		System.out.println("最高的和尚的身高为："+maxHeight + "cm");
	}
}