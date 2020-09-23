/*
	需求：任意给出一个整数，请用程序判断该整数是计数还是偶数，并在控制台输出计数或偶数
	
	分析:
		1.为了体现任意给出一个数据，采用键盘录入数据
			录入数据：
				导包
				创建对象
				接收数据
		2.判断奇偶数 使用if else结构
		3.判断是否是偶数需要用取余运算 num%2 == 0;
		4.根据判定情况，控制台输出对应的内容
*/
import java.util.Scanner;

public class IfExample{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个整数：");
		int num = sc.nextInt();
		
		if(num % 2 == 0){
			System.out.println(num + "是偶数");
		}else{
			System.out.println(num + "是奇数");
		}
	}
}