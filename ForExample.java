/*
	案例：输出数据
	需求：在控制台输出1-5和5-1的数据
	分析：1.反复进行输出的动作，需要输出结构
		  2.从1开始到5结束，设置初始化从1开始
		  3.没有到5的时候继续，到5程序结束
		  4.条件控制每次+1
		  5.反复进行的事情写入循环内部，打印对应数据
		  6.从6-1同理即可
*/

public class ForExample {
	public static void main(String[] args) {
	
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		System.out.println("--------");
		for(int i=5; i>=1; i--) {
			System.out.println(i);
		}
	}
}