/*
	continue:用在循环中，基于条件控制，跳过某次循环体内的执行，继续下一次的执行
	break:用在循环中，基于条件控制，终止循环内容的执行，就是结束整个当前循环
*/
public class ControlDemo {
	public static void main(String[] args){
		for(int i = 1; i <= 5; i++){
			if( i % 2 == 0){
				//continue;		//输出：1 3 5
				//break;			//输出：1
								//不加if的情况输出：1 2 3 4 5
			}
			System.out.println(i);
		}
	}
}
//一般使用在循环中，且有条件判断