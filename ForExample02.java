/*
	案例：求偶数和
	需求：求1-100之间的偶数和，并用控制台输出
	分析：1.对1-100数据求和与1-5求和一样，仅仅是结束条件不同
		  2.对1-100的偶数和，需要对求和操作添加限制条件
		  3.限制条件是偶数才运算，因此判断条件应该判断是否是偶数
		  4.当循环执行完毕，将最终结果打印在控制台
*/

public class ForExample02 {
	public static void main(String[] args) {
		
		/*//自己的想法
		int sum = 0;
		for(int i=2; i<=100; i+=2) {
			
			sum += i;	
		}
		*/
		
		int sum = 0;
		for(int i=0; i<=100; i++) {
			if(i%2 == 0) {
				sum += i;
			}
		}
		//打印结果
		System.out.println("1-100之间的偶数和为"+sum);
	}
}