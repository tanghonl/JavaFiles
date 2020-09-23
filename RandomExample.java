/*
	案例：猜数字
	需求：程序自动生成1-100之间的数，使用程序猜出来这个数是多少
		  当猜错时给不同的提示：
				如果比真实大：你猜大了
				如果比真实小：你猜小了
				如果与真实相等：你猜对了
	分析：
		1.首先生成一个随机数1-100之间的数
		2.因为无法预知几次能猜中。猜数字这个操作反复进行，因而使用循环，这时常用while循环
		3.每次均要输入猜测的值，使用键盘录入实现
		4.比较输入的数据与系统产生的数据，需要使用分支语句，这里使用if...else if...else格式的
		  猜中后用break结束
*/
import java.util.Random;
import java.util.Scanner;

public class RandomExample {
	public static void main(String[] args) {
		
		Random r = new Random();
		int number = r.nextInt(100) + 1;
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("请输入你要猜的数：");
			
			int guessNumber = sc.nextInt();
			
			if(guessNumber > number) {
				System.out.println("你猜大了");
			}else if(guessNumber < number) {
				System.out.println("你猜小了");
			}else {
				System.out.println("恭喜你猜中了");
				break;
			}
		}
		
	}
}