/*
	for结构
	格式：
		for(初始化语句;条件判断语句;条件控制语句){
			循环体语句
		}
	执行流程：
		1.执行初始化语句
		2.执行条件判断语句
			false：循环结束
			true：继续执行
		3.执行循环体语句
		4.执行条件控制语句
		5.回到2
*/

public class ForDemo {
	public static void main(String[] args) {
	//需求：在控制台输出5次hello world
		for(int i=1; i<=5; i++){
			System.out.println("Hello World!");
		}
	}
}