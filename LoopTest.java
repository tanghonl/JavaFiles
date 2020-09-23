/*
	三种循环的区别
*/

public class LoopTest {
	public static void main(String[] args){
		/*
		//for循环
		for(int i = 3; i<3; i++){
			System.out.println("我爱Java");
		}
		System.out.println("--------");
		
		//while循环
		int j = 3;
		while(j<3){
			System.out.println("我爱Java");
			j++;
		}
		System.out.println("--------");
		int k = 3;
		do{
			System.out.println("我爱Java");
			k++;
		}while(k<3);
		System.out.println("--------");
		//区别一：while和for是先判断后执行 
				//do while至少会执行一次循环
		*/
		/*
		//for循环
		for(int i = 1; i<3; i++){
			System.out.println("我爱Java");
		}
		//System.out.println(i);	//i属于for循环结构的 执行完就消失了
		System.out.println("--------");
		//while循环
		int j = 1;
		while(j<3){
			System.out.println("我爱Java");
			j++;
		}
		System.out.println(j);
		System.out.println("--------");
		//区别二：for循环里边定义的变量，归属for循环语法结构for结束之后，不能被再次访问
		//		  while循环中控制循环的变量不归属于while循环，循环结束后还可以使用
		*/
		
		//死循环
		/*
		//for循环
		//只写两个分号 表示条件永远为真
		for(;;){
			System.out.println("for");
		}
		*/
		
		/*
		//while循环
		while(true){
			System.out.println("while");
		}
		*/
		
		/*
		//do...while循环
		do{
			System.out.println("do...while");
		}while(true);
		*/
		//while的死循环是最常用的
	}
}