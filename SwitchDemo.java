/*
	switch语句：
	格式：
		switch(表达式){
			case 值1:
				语句体1;
				break;
			case 值2:
				语句体2;
				break;
			......
			default:
				语句体n+1
				[break;]
		}
*/
import java.util.Scanner;

public class SwitchDemo{
	public static void main(String[] args){
		System.out.println("开始");
		
		//需求：键盘输入一个星期数（1-7）输出对应的星期一，星期二，...
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个星期数（1-7）：");
		int week = sc.nextInt();
		switch(week){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("请输入正确的星期数！");
				break;
		}
		System.out.println("结束");
	}
}