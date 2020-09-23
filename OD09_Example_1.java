/*
	三元运算符案例：
		三个和尚
	需求：
		一个寺庙里住着三个和尚，已知他们的身高分别为150cm，210cm，165cm，
		请用程序获取他们三个的最高身高
	分析：
		1.定义三个变量用于保存三个和尚的身高，单位cm，这里仅仅体现数值即可
		2.用三元运算符获取前两个和尚的较高身高，并用临时变量保存起来
		3.用三元运算符获取临时身高和第三个和尚的身高的较大值，并用最大身高保存
		4.输出结果
*/
public class OD09_Example_1{
	public static void main(String[] args){
		int height1 = 150;
		int height2 = 210;
		int height3 = 162;
		int h1 = (height1 > height2) ? height1 : height2;
		int hmax = (h1 > height3) ? h1 : height3;
		System.out.println("最高的和尚的身高为："+hmax);
	}
}