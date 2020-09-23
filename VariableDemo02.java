public class VariableDemo02{
	public static void main(String[] args){
		int a = 10;
		System.out.println(a);
		byte b = 100;
		System.out.println(b);
		short c = 19999;
		System.out.println(c);
		//long d = 99999;
		//System.out.println(d);
		//float e = 13;
		//System.out.println(e);
		double f = 5.21;
		System.out.println(f);
		char g = 'a';
		System.out.println(g);
		boolean h = true;
		System.out.println(h);
		
		//long d=12345678900;	//超过int类型 报错
		//System.out.println(d);		//解决方法如下
		long d=12345678900l;		//结尾加l让编译器知道是long类型的
		System.out.println(d);
		
		//float e = 13.14;	//浮点数默认double类型
		//System.out.println(e);	//要在结尾加上f
		
		float e = 13.14f;	
		System.out.println(e);	
	}
}

/*
变量使用注意事项
	1.main方法内 变量名不能重复
	2.定义变量一定给值
	3.防止定义long类型的整数太大 结尾加上l就行了
	4.防止类型不兼容 输出float要在结尾加上f
*/
	