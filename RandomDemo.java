/*
	Random
	作用：产生一个随机数
	
	使用步骤：
	1.导包：
		import java.util.Random;
	2.创建对象：
		Random r = new Random;	其中r是变量名，可更改
	3.产生随机数：
		int number = r.nextInt(10);	其中number和10是可以更改的
									10代表0到10之间 其中包括0不包括10
*/
import java.util.Random;	//导包

public class RandomDemo {
	public static void main(String[] args) {
		//创建对象：
		Random r = new Random();
		
		//用循环获取10个随机数
		for(int i=0; i<10; i++) {
			//产生随机数：
			int number = r.nextInt(10);
			//输出随机数
			System.out.println(number);
		}
		
		//需求：获取一个1-100之间的随机数
		int x = r.nextInt(100) + 1;	//获取0-99之间的随机数再+1
		System.out.println(x);
	}
}