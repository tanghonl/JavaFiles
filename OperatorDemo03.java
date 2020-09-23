/*
	字符串的‘+’操作
*/
public class OperatorDemo03{
	public static void main(String[] args){
		System.out.println("it" + "heima");		//字符串与字符串类型拼接
		System.out.println("itheima" + 666);	//字符串与int类型拼接
		System.out.println(666 + "itheima");	//int类型放前后都可以
		//字符串加法操作是进行的字符串的拼接
		System.out.println("黑马" + 6 + 66);		//先把前边拼接,再和后边拼接,不进行后边的加法
		System.out.println(1 + 99 + "年黑马");		//先把前边进行加法,再和后边进行拼接
	}
}