/*
	案例：统计
	需求：统计“水仙花数”个数，并在控制台输出
		
	分析：1.定义count用于保存水仙花数的数量 初始为0
		  2.在判断水仙花数的过程中不在输出，改为修改count的值 count+1
		  3.打印最终结果
*/

public class ForExample04 {
	public static void main(String[] args) {
		//定义计数的变量
		int count = 0;
		//建立循环
		for(int i=100; i<=999; i++) {
			//获取每个位上的值
			int ge = i%10;
			int shi = i/10%10;
			int bai = i/100;
			//判断
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
				count++;
			}
		}
		System.out.println("水仙花数的数量位为："+count);
	}
}