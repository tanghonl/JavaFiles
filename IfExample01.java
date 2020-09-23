/*
	需求：小明快要考试了，小明爸爸对他说，会根据他不同的考试成绩送她不同的礼物，
		  假如你可以控制小明的得分，请用程序实现小明到底该获得什么样的礼物，并在控制台输出
		  假设：95-100 山地自行车	90-94 游乐场玩一次	80-89 变形金刚玩具 80分以下胖揍一顿
	
	分析:
		1.小明成绩未知，可用键盘录入的方式获取值
		2.由于奖励较多，属于多种判断 采用if...else...if格式实现
		3.每种判断对应条件
		4.为每种判断设置对应的奖励
*/
import java.util.Scanner;

public class IfExample01{
	public static void main(String[] args){
		//创建分数对象
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个分数：");
		int score = sc.nextInt();
		
		/*
		if(score>=95 && score<=100){
			System.out.println("山地自行车一辆");
		}else if(score>=90 && score<=94){
			System.out.println("游乐场游玩一次");
		}else if(score>=80 && score<90){
			System.out.println("变形金刚玩具一个");
		}else{
			System.out.println("胖揍一顿");
		}
		*/
		
		//改进版
		//数据测试：正确数据 边界数据，错误数据
		if(score>100 || score<0){
			System.out.println("你输入的分数有误");
		}else if(score>=95 && score<=100){
			System.out.println("山地自行车一辆");
		}else if(score>=90 && score<=94){
			System.out.println("游乐场游玩一次");
		}else if(score>=80 && score<90){
			System.out.println("变形金刚玩具一个");
		}else{
			System.out.println("胖揍一顿");
		}
	}
}