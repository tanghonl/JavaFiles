/*
	短路逻辑运算符
*/
public class OperatorDemo08{
	public static void main(String[] args){
		//定义变量
		int i = 10;
		int j = 20;
		int k = 30;
		
		//短路逻辑与 &&	有false则false
		System.out.println((i > j) && (i > k));	//false && false = false
		System.out.println((i < j) && (i > k));	//true && false =  false
		System.out.println((i > j) && (i < k));	//false && true =  false
		System.out.println((i < j) && (i < k));	//true && true =  true
		System.out.println("--------");
		
		
		//短路逻辑或 || 有true则true
		System.out.println((i > j) || (i > k));	//false || false = false
		System.out.println((i < j) || (i > k));	//true || false =  true
		System.out.println((i > j) || (i < k));	//false || true =  true
		System.out.println((i < j) || (i < k));	//true || true =  true
		System.out.println("--------");
		
		//与逻辑与& 逻辑或|结论相同
		
		//区别：
		/*
		System.out.println((i++ > 100) & (j++ > 100));	//false & false = false
		System.out.println("i = "+i);	//11
		System.out.println("j = "+j);	//21
		*/
		
		System.out.println((i++ > 100) && (j++ > 100));	//false && false = false
		//i++之后为false	短路与只要左边为false右边不管是什么肯定为false 所以右边不执行
		System.out.println("i = "+i);
		System.out.println("j = "+j);
		//同理短路或 左边如果为true 右边无论是什么都为true 所以右边就不执行
	}
}