/*
	switch案例：春夏秋冬
	需求：一年有12个月份，分别属于春夏秋冬四个季节，键盘录入一个月分，判断属于哪个季节并输出
		春：3 4 5
		夏：6 7 8
		秋：9 10 11
		冬：12 1 2
	分析：
		1.键盘录入月份使用一个变量接收
		2.多种判断，使用switch接收
		3.在每种情况下完成输出
		
*/
import java.util.Scanner;

public class SwitchExample{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个月份（1-12）：");
		int month = sc.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("春季");	//利用了case穿透
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("冬季");
				break;
			default:
				System.out.println("请输入正确的月份！");
				//break;	//此处可以省略
		}
	}
}