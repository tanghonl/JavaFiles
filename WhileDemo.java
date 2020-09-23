/*
	while循环(与for相同 可互相转换)
	
	格式：
		初始化语句
		while(条件判断句) {
			循环体语句;
			条件控制语句;
		}
*/

public class WhileDemo {
	public static void main(String[] args) {
		 //需求：在控制台输出5次：helloworld
		 int i = 0;
		 while(i<5){
			 System.out.println("Hello world");
			 i++;
		 }
	}
}