/*	
	自增自减运算符
*/
public class OperatorDemo05{
	public static void main(String[] args){
		//定义变量
		int i = 10;
		System.out.println("i="+i);
		
		/*
		//单独使用 无论放前边还是放后边都可以 结果都是相同的
		i++;		//把i加1
		System.out.println("i="+i);
		++i;		//也可以
		System.out.println("i="+i);
		*/
		
		
		//参与操作使用
		/*
		int j=i++;	//++放在变量后边时 先赋值再加一
		System.out.println("j="+j);
		System.out.println("i="+i);
		*/
		/*
		int j=++i;	//++放在变量前边时 先加一再赋值
		System.out.println("j="+j);
		System.out.println("i="+i);
		*/
		
		i--;		
		System.out.println("i="+i);
		--i;		
		System.out.println("i="+i);
		
		int j=i--;	
		System.out.println("j="+j);
		System.out.println("i="+i);
		
		int a=--i;	
		System.out.println("a="+a);
		System.out.println("i="+i);
	}
}