/*
	do...while语句
	完整格式：
		初始化语句;
		do
		{
			循环体语句;
			条件控制语句;
		}while(条件判断语句);
*/
public class DoWhileDemo {
	public static void main(String[] args){
		//需求：在控制台输出5次 hello world
		int i=0;
		do{
			System.out.println("hello world");
			i++;
		}while(i < 5);
	}
}