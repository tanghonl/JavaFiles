/*
	类型转换
*/
public class ConversionDemo{
	public static void main(String[] args){
		//自动类型转换
		double d = 10;		//int赋值给double  int自动转换成double 输出10.0
		System.out.println(d);
		
		byte b = 10;
		short s = b;		//byte赋值给short	没问题
		int i = b;			//byte赋值给int		没问题
		//char c = b;			//byte赋值给char	类型不兼容 不可以
		
		//强制数据类型转换
		//int k = 88.88;		//此时编译不通过 类型不兼容
		int k = (int)88.88;		//此时可以了
		System.out.println(k);	//值为88		数据丢失 不建议这样做
	}
}