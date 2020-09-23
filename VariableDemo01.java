/*
	变量定义格式：
		数据类型 变量名 = 变量值;
	基本数据类型：
		byte,short,int,long,float,double,char,boolean
	
	变量的使用：
		取值格式：变量名
		修改值的格式： 变量名=变量值;
*/
public class VariableDemo01{
	public static void main(String[] args){
		//定义变量
		int a = 10;
		byte b = 100;
		short c = 19999;
		long d = 99999;
		float e = 13;
		double f = 5.21;
		char g = 'a';
		boolean h = true;
		
		//输出变量
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println("---------");
		
		//修改变量
		a = 20;
		//再次输出
		System.out.println(a);
	}
}